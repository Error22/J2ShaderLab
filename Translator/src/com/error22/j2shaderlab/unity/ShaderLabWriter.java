package com.error22.j2shaderlab.unity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.error22.j2shaderlab.data.Method;
import com.error22.j2shaderlab.data.Parameter;
import com.error22.j2shaderlab.data.Variable;
import com.error22.j2shaderlab.parser.Annotation;
import com.error22.j2shaderlab.statements.Statement;
import com.error22.j2shaderlab.statements.StatementDeclareVariable;
import com.error22.j2shaderlab.statements.StatementReturn;
import com.error22.j2shaderlab.statements.StatementStep;
import com.error22.j2shaderlab.steps.Call;
import com.error22.j2shaderlab.steps.DirectGet;
import com.error22.j2shaderlab.steps.Instantiate;
import com.error22.j2shaderlab.steps.JClass;
import com.error22.j2shaderlab.steps.Literal;
import com.error22.j2shaderlab.steps.QualifiedName;
import com.error22.j2shaderlab.steps.ReferenceGet;
import com.error22.j2shaderlab.steps.Set;
import com.error22.j2shaderlab.steps.Step;

public class ShaderLabWriter {
	private StringBuilder passBuilder;
	private Map<String, String> props;
	private Map<String, String> localVars;
	private JClass passClass;
	private int lastGenTemp;

	public String write(JClass clazz) {
		if (clazz.getAnnotation(UnityTypes.UnityShader) == null) {
			throw new RuntimeException("Not a unity shader!");
		}

		StringBuilder builder = new StringBuilder();

		String name = (String) clazz.getAnnotation(UnityTypes.UnityShader).getValue("value");
		builder.append("Shader \"" + name + "\"{\n");

		// Properties
		builder.append("Properties{\n");
		props = new HashMap<String, String>();
		for (Variable variable : clazz.getFields().values()) {
			props.put(variable.getName(), convert(variable.getType()));

			// Name
			builder.append(variable.getName() + " (");
			for (Annotation annotation : variable.getAnnotations()) {
				if (annotation.getType().equals(UnityTypes.ColorProperty)) {
					builder.append("\"" + annotation.getValue("value") + "\", Color");
					break;
				} else if (annotation.getType().equals(UnityTypes.RangeProperty)) {
					builder.append("\"" + annotation.getValue("name") + "\", Range(" + annotation.getValue("min") + ","
							+ annotation.getValue("max") + ")");
					break;
				} else if (annotation.getType().equals(UnityTypes.TextureProperty)) {
					builder.append("\"" + annotation.getValue("value") + "\", 2D");
					break;
				} else if (annotation.getType().equals(UnityTypes.TextureArrayProperty)) {
					builder.append("\"" + annotation.getValue("value") + "\", 2DArray");
					break;
				}
				throw new RuntimeException("Unknown? " + variable);
			}
			builder.append(")");

			System.out.println(" " + variable.getInitializer());

			// Initialiser
			if (variable.getInitializer() instanceof Instantiate) {
				Instantiate instantiate = (Instantiate) variable.getInitializer();
				String type = instantiate.getType().getName();
				if (type.equals(UnityTypes.Fixed4)) {
					builder.append(" = (");
					boolean first = true;
					for (Step step : instantiate.getArguments().getExpressions()) {
						if (!first) {
							builder.append(",");
						}
						builder.append(generateLiteral((Literal) step).getText());
						first = false;
					}
					builder.append(")");
				} else if (type.equals(UnityTypes.Half)) {
					builder.append(" = ");
					builder.append(
							generateLiteral((Literal) instantiate.getArguments().getExpressions().get(0)).getText());
				} else if (type.equals(UnityTypes.Sampler2D)) {
					builder.append(" = ");
					builder.append(
							generateLiteral((Literal) instantiate.getArguments().getExpressions().get(0)).getText());
				} else if (type.equals(UnityTypes.Sampler2DArray)) {
					builder.append(" = \"\" {}");
				} else {
					throw new RuntimeException("Unknown type! " + type);
				}
			} else if (variable.getInitializer() instanceof Literal) {
				builder.append(" = " + generateLiteral((Literal) variable.getInitializer()).getText());
			}

			builder.append("\n");
		}
		builder.append("}\n");

		// Sub Shaders
		for (JClass subL1 : clazz.getSubClasses()) {
			if (subL1.getAnnotation(UnityTypes.SubShader) != null) {
				builder.append("SubShader {\n");
				if (subL1.getAnnotation(UnityTypes.LOD) != null) {
					builder.append("LOD " + subL1.getAnnotation(UnityTypes.LOD).getValue("value") + "\n");
				}

				if (subL1.getAnnotation(UnityTypes.RenderType) != null) {
					String rt = ((QualifiedName) subL1.getAnnotation(UnityTypes.RenderType).getValue("value"))
							.getName();
					builder.append("Tags { \"RenderType\"=");
					if (rt.equals(UnityTypes.RenderTypes_Opaque)) {
						builder.append("\"Opaque\"");
					} else {
						throw new RuntimeException("Unknown? " + rt);
					}
					builder.append("}\n");
				}

				for (JClass subL2 : subL1.getSubClasses()) {
					if (subL2.getAnnotation(UnityTypes.ShaderPass) != null) {
						lastGenTemp = 0;

						builder.append("Pass {\n");
						builder.append("CGPROGRAM\n");
						generatePass(subL2);
						builder.append(passBuilder.toString());
						builder.append("ENDCG\n");
						builder.append("}\n");
					} else {
						throw new RuntimeException("Unknown?");
					}
				}
				builder.append("}\n");
			} else if (subL1.getAnnotation(UnityTypes.SurfaceShader) != null) {
				builder.append("SubShader {\n");
				if (subL1.getAnnotation(UnityTypes.LOD) != null) {
					builder.append("LOD " + subL1.getAnnotation(UnityTypes.LOD).getValue("value") + "\n");
				}

				if (subL1.getAnnotation(UnityTypes.RenderType) != null) {
					String rt = ((QualifiedName) subL1.getAnnotation(UnityTypes.RenderType).getValue("value"))
							.getName();
					builder.append("Tags { \"RenderType\"=");
					if (rt.equals(UnityTypes.RenderTypes_Opaque)) {
						builder.append("\"Opaque\"");
					} else {
						throw new RuntimeException("Unknown? " + rt);
					}
					builder.append("}\n");
				}

				lastGenTemp = 0;

				builder.append("CGPROGRAM\n");
				generatePass(subL1);
				builder.append(passBuilder.toString());
				builder.append("ENDCG\n");
				builder.append("}\n");
			} else {
				throw new RuntimeException("Unknown! " + subL1);
			}
		}

		if (clazz.getAnnotation(UnityTypes.Fallback) != null) {
			builder.append("FallBack \"" + clazz.getAnnotation(UnityTypes.Fallback).getValue("value") + "\"\n");
		}

		builder.append("}\n");
		System.out.println("BUILT!");
		return builder.toString();
	}

	private String convert(String type) {
		if (type.equals("java.float")) {
			return UnityTypes.Float;
		}
		return type;
	}

	private void generatePass(JClass clazz) {
		passClass = clazz;
		passBuilder = new StringBuilder();

		boolean surfaceShader = clazz.getAnnotation(UnityTypes.SurfaceShader) != null;

		if (surfaceShader) {
			Annotation annotation = clazz.getAnnotation(UnityTypes.SurfaceShader);

			String surfaceFunction = null, vertexFunction = null;
			for (Method meth : clazz.getMethods().values()) {
				if (meth.getAnnotation(UnityTypes.SurfaceHandler) != null) {
					surfaceFunction = meth.getName();
				} else if (meth.getAnnotation(UnityTypes.VertexHandler) != null) {
					vertexFunction = meth.getName();
				}
			}

			if (surfaceFunction == null) {
				throw new RuntimeException("No surface handler!");
			}

			passBuilder.append("#pragma surface " + surfaceFunction);

			String lighting = ((QualifiedName) annotation.getValue("lighting")).getName();

			if (lighting.equals(UnityTypes.LightingModels_Standard)) {
				passBuilder.append(" Standard");
			} else {
				throw new RuntimeException("Unknown lighting models!");
			}

			Map<String, String> simpleParams = new HashMap<String, String>();
			simpleParams.put("fullForwardShadows", "fullforwardshadows");
			simpleParams.put("castShadowsPass", "addshadow");
			simpleParams.put("disableShadows", "noshadow");
			simpleParams.put("disableDeferred", "exclude_path:deferred");
			simpleParams.put("disableForward", "exclude_path:forward");
			simpleParams.put("disablePrePass", "exclude_path:prepass");
			simpleParams.put("disableForwardAdd", "noforwardadd");

			for (Entry<String, String> entry : simpleParams.entrySet()) {
				if (annotation.getValue(entry.getKey(), boolean.class, false)) {
					passBuilder.append(" " + entry.getValue());
				}
			}

			if (vertexFunction != null) {
				passBuilder.append(" vertex:" + vertexFunction);
			}

			passBuilder.append("\n");
		}

		if (clazz.getAnnotation(UnityTypes.ShaderModel) != null) {
			passBuilder
					.append("#pragma target " + clazz.getAnnotation(UnityTypes.ShaderModel).getValue("value") + "\n");
		}

		if (clazz.getAnnotation(UnityTypes.MultiCompileFog) != null) {
			passBuilder.append("#pragma multi_compile_fog\n");
		}

		if (!surfaceShader) {
			for (Method meth : clazz.getMethods().values()) {
				if (meth.getAnnotation(UnityTypes.VertexHandler) != null) {
					passBuilder.append("#pragma vertex " + meth.getName() + "\n");
				} else if (meth.getAnnotation(UnityTypes.FragmentHandler) != null) {
					passBuilder.append("#pragma fragment " + meth.getName() + "\n");
				}
			}
		}

		for (Annotation ann : clazz.getAnnotations()) {
			if (ann.getType().equals(UnityTypes.SimpleInclude)) {
				String source = ((QualifiedName) ann.getValue("value")).getName();
				String target;
				if (source.equals(UnityTypes.SimpleIncludes_UnityGC)) {
					target = "UnityCG.cginc";
				} else {
					throw new RuntimeException("Unknown! " + source);
				}
				passBuilder.append("#include \"" + target + "\"\n");
			} else if (ann.getType().equals(UnityTypes.Include)) {
				passBuilder.append("#include \"" + ann.getValue("value") + "\"\n");
			}
		}

		for (JClass sub : clazz.getSubClasses()) {
			boolean vertex = false, fragment = false;

			if (sub.getAnnotation(UnityTypes.DataType) != null) {
				String type = ((QualifiedName) sub.getAnnotation(UnityTypes.DataType).getValue("value")).getName();
				vertex = type.equals(UnityTypes.DataTypes_Vertex);
				fragment = type.equals(UnityTypes.DataTypes_Fragment);
			}

			passBuilder.append("struct " + sub.getName() + " {\n");
			for (Variable variable : sub.getFields().values()) {
				if (variable.getAnnotation(UnityTypes.FogCoords) != null) {
					int coord = (int) variable.getAnnotation(UnityTypes.FogCoords).getValue("value");
					passBuilder.append("UNITY_FOG_COORDS(" + coord + ")\n");
					continue;
				}

				passBuilder.append(convertType(variable.getType()) + " " + variable.getName());

				if (variable.getInitializer() != null) {
					ReferenceGet rget = (ReferenceGet) variable.getInitializer();
					String target = ((DirectGet) rget.getExpression()).getName() + "." + rget.getName();

					if (target.equals(UnityTypes.DataSources_Position)) {
						passBuilder.append(" : " + (fragment ? "SV_POSITION" : "POSITION"));
					} else {
						throw new RuntimeException("Unknown!");
					}
				}

				passBuilder.append(";\n");
			}
			passBuilder.append("};\n");
		}

		for (Entry<String, String> entry : props.entrySet()) {
			if (entry.getValue().equals(UnityTypes.Sampler2DArray)) {
				passBuilder.append("UNITY_DECLARE_TEX2DARRAY(" + entry.getKey() + ");\n");
			} else {
				passBuilder.append(convertType(entry.getValue()) + " " + entry.getKey() + ";\n");
			}
		}

		for (Method meth : clazz.getMethods().values()) {
			localVars = new HashMap<String, String>();
			passBuilder.append((meth.getType() == null ? "void" : convertType(meth.getType().getName())) + " "
					+ meth.getName() + "(");
			boolean first = true;
			for (Parameter parameter : meth.getParameters()) {
				if (!first) {
					passBuilder.append(", ");
				}

				if (parameter.getAnnotation(UnityTypes.InOut) != null) {
					passBuilder.append("inout ");
				} else if (parameter.getAnnotation(UnityTypes.Out) != null) {
					passBuilder.append("out ");
				}

				passBuilder.append(convertType(parameter.getType()) + " " + parameter.getName());
				localVars.put(parameter.getName(), parameter.getType());
				first = false;
			}
			passBuilder.append(")");
			if (meth.getAnnotation(UnityTypes.FragmentHandler) != null) {
				passBuilder.append(" : SV_TARGET ");
			}

			passBuilder.append("{\n");

			for (Statement statement : meth.getStatements()) {
				if (statement instanceof StatementDeclareVariable) {
					StatementDeclareVariable sdc = (StatementDeclareVariable) statement;
					GenData data = generateStep(sdc.getStep());
					localVars.put(sdc.getName(), sdc.getType());
					passBuilder.append(data.getLines());
					passBuilder
							.append(convertType(sdc.getType()) + " " + sdc.getName() + " = " + data.getText() + ";\n");
				} else if (statement instanceof StatementStep) {
					StatementStep ss = (StatementStep) statement;
					GenData data = generateStep(ss.getStep());
					passBuilder.append(data.getLines());
					passBuilder.append(data.getText() + ";\n");
				} else if (statement instanceof StatementReturn) {
					StatementReturn sr = (StatementReturn) statement;
					if (sr.getStep() != null) {
						GenData data = generateStep(sr.getStep());
						passBuilder.append(data.getLines());
						passBuilder.append("return " + data.getText() + ";\n");
					} else {
						passBuilder.append("return;\n");
					}
				} else {
					throw new RuntimeException("Unsupported statement! " + statement);
				}
			}

			passBuilder.append("}\n");
			System.out.println("Method> " + meth);
		}

	}

	private String find(String name) {
		if (UnityTypes.doesClassExist(name)) {
			return name;
		}

		for (Variable variable : passClass.getFields().values()) {
			if (variable.getName().equals(name)) {
				return variable.getType();
			}
		}

		if (props.containsKey(name)) {
			return props.get(name);
		}

		if (localVars.containsKey(name)) {
			return localVars.get(name);
		}

		throw new RuntimeException("Failed to find variable " + name);
	}

	private GenData generateStep(Step step) {
		if (step instanceof DirectGet) {
			DirectGet dg = (DirectGet) step;
			String type = find(dg.getName());
			return new GenData("", dg.getName(), type, false);
		} else if (step instanceof ReferenceGet) {
			ReferenceGet rg = (ReferenceGet) step;
			GenData parent = generateStep(rg.getExpression());

			String type = null;
			boolean method = false;

			if (UnityTypes.doesClassExist(parent.getType())) {
				UnityClass uc = UnityTypes.getClass(parent.getType());
				if (uc.doesMethodExist(rg.getName())) {
					method = true;
					type = parent.getType();
				}

				if (uc.doesFieldExist(rg.getName())) {
					FieldCallGenerator callGen = uc.getField(rg.getName()).getCallGenerator();
					if (callGen == null) {
						throw new RuntimeException("Field should not be called!");
					}

					return callGen.generate(parent);
				}

			}

			if (type == null) {
				for (JClass sub : passClass.getSubClasses()) {
					if (parent.getType().equals(sub.getName())) {
						if (sub.getFields().containsKey(rg.getName())) {
							method = false;
							type = sub.getFields().get(rg.getName()).getType();
						}
					}
				}
			}

			if (type == null) {
				throw new RuntimeException("Unknown type " + parent.getType() + ":" + rg.getName());
			}

			return new GenData(parent.getLines().toString(), parent.getText() + "." + rg.getName(), type, method);
		} else if (step instanceof Call) {
			Call c = (Call) step;

			GenData target = generateStep(c.getStep());

			List<GenData> args = new ArrayList<GenData>();
			for (Step arg : c.getArguments().getExpressions()) {
				args.add(generateStep(arg));
			}

			return generateMethodCall(target, args);
		} else if (step instanceof Instantiate) {
			Instantiate inst = (Instantiate) step;

			for (JClass sub : passClass.getSubClasses()) {
				if (inst.getType().getName().equals(sub.getName())) {
					String name = generateName();
					String line = inst.getType().getName() + " " + name + ";\n";
					if (inst.getArguments().getExpressions().size() > 0) {
						throw new RuntimeException("Custom structs can not have initializers!");
					}
					return new GenData(line, name, inst.getType().getName(), false);
				}
			}

			String text = inst.getType().getName();
			text += text.substring(text.lastIndexOf("."));

			List<GenData> args = new ArrayList<GenData>();
			for (Step arg : inst.getArguments().getExpressions()) {
				args.add(generateStep(arg));
			}

			return generateMethodCall(new GenData("", text, inst.getType().getName(), true), args);
		} else if (step instanceof Set) {
			Set set = (Set) step;
			GenData lhs = generateStep(set.getLhs());
			GenData rhs = generateStep(set.getRhs());

			if (!lhs.getType().equals(rhs.getType())) {
				throw new RuntimeException(
						"Types do not match! " + lhs.getType() + " vs " + rhs.getType() + " in " + step);
			}

			StringBuilder lines = new StringBuilder();
			lines.append(lhs.getLines());
			lines.append(rhs.getLines());

			StringBuilder text = new StringBuilder();
			text.append(lhs.getText());
			text.append(" = ");
			text.append(rhs.getText());
			return new GenData(lines.toString(), text.toString(), null, false);
		} else if (step instanceof Literal) {
			return generateLiteral((Literal) step);
		}
		throw new RuntimeException("Unsupported step " + step);
	}

	private String generateName() {
		return "_gentemp_" + (lastGenTemp++);
	}

	private GenData generateMethodCall(GenData target, List<GenData> args) {
		String methodName = target.getText().substring(target.getText().lastIndexOf(".") + 1);

		String[] argTypes = new String[args.size()];
		for (int i = 0; i < args.size(); i++) {
			argTypes[i] = args.get(i).getType();
		}

		if (UnityTypes.doesClassExist(target.getType())) {
			UnityClass uclass = UnityTypes.getClass(target.getType());
			UnityMethod method = uclass.findMethod(methodName, argTypes);
			if (method != null) {
				return method.getGenerator().generate(target, args);
			}
		}

		throw new RuntimeException("Unknown method " + methodName + " :( " + target + " " + args);
	}

	private String convertType(String in) {
		if (UnityTypes.doesClassExist(in)) {
			UnityClass uclass = UnityTypes.getClass(in);
			if (uclass.getConversion() == null) {
				throw new RuntimeException("Type has no conversion!");
			}
			return uclass.getConversion();
		}

		for (JClass sub : passClass.getSubClasses()) {
			if (in.equals(sub.getName())) {
				return sub.getName();
			}
		}

		throw new RuntimeException("Unknown type! " + in);
	}

	private GenData generateLiteral(Literal literal) {
		Object value = literal.getValue();
		if (value instanceof String) {
			return new GenData("", "\"" + value + "\"", null, false);
		} else if (value instanceof Integer || value instanceof Float) {
			return new GenData("", value.toString(), UnityTypes.Float, false);
		}

		throw new RuntimeException("!WARNING! Unknown literal " + value + " " + value.getClass());
	}

}
