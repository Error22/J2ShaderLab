package com.error22.j2shaderlab.parser;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import com.error22.j2shaderlab.data.ClassImport;
import com.error22.j2shaderlab.data.Method;
import com.error22.j2shaderlab.data.Modifier;
import com.error22.j2shaderlab.data.Parameter;
import com.error22.j2shaderlab.data.Variable;
import com.error22.j2shaderlab.parser.JShaderParser.AnnotationContext;
import com.error22.j2shaderlab.parser.JShaderParser.BaseUnitContext;
import com.error22.j2shaderlab.parser.JShaderParser.BlockContext;
import com.error22.j2shaderlab.parser.JShaderParser.BlockStatementContext;
import com.error22.j2shaderlab.parser.JShaderParser.ClassDeclarationContext;
import com.error22.j2shaderlab.parser.JShaderParser.ConstructorDeclarationContext;
import com.error22.j2shaderlab.parser.JShaderParser.ElementValueContext;
import com.error22.j2shaderlab.parser.JShaderParser.ElementValuePairContext;
import com.error22.j2shaderlab.parser.JShaderParser.FieldDeclarationContext;
import com.error22.j2shaderlab.parser.JShaderParser.FormalParameterContext;
import com.error22.j2shaderlab.parser.JShaderParser.FormalParametersContext;
import com.error22.j2shaderlab.parser.JShaderParser.ImportDeclarationContext;
import com.error22.j2shaderlab.parser.JShaderParser.LiteralContext;
import com.error22.j2shaderlab.parser.JShaderParser.LocalVariableDeclarationContext;
import com.error22.j2shaderlab.parser.JShaderParser.MemberDeclarationContext;
import com.error22.j2shaderlab.parser.JShaderParser.MethodDeclarationContext;
import com.error22.j2shaderlab.parser.JShaderParser.MethodReturnContext;
import com.error22.j2shaderlab.parser.JShaderParser.ModifierContext;
import com.error22.j2shaderlab.parser.JShaderParser.SimpleExpressionContext;
import com.error22.j2shaderlab.parser.JShaderParser.SimpleTypeContext;
import com.error22.j2shaderlab.parser.JShaderParser.TypeContext;
import com.error22.j2shaderlab.parser.JShaderParser.TypeDeclarationContext;
import com.error22.j2shaderlab.parser.JShaderParser.VariableDeclaratorContext;
import com.error22.j2shaderlab.parser.JShaderParser.VariableModifierContext;
import com.error22.j2shaderlab.statements.Statement;
import com.error22.j2shaderlab.statements.StatementDeclareVariable;
import com.error22.j2shaderlab.statements.StatementReturn;
import com.error22.j2shaderlab.statements.StatementStep;
import com.error22.j2shaderlab.steps.JClass;
import com.error22.j2shaderlab.steps.QualifiedName;
import com.error22.j2shaderlab.steps.Step;
import com.error22.j2shaderlab.steps.Type;

public class JParser {
	private List<ClassImport> imports;

	public JClass parse(String source) throws Exception {
		JShaderParser parser = new JShaderParser(new CommonTokenStream(new JShaderLexer(new ANTLRFileStream(source))));
		BaseUnitContext context = parser.baseUnit();

		imports = new ArrayList<ClassImport>();
		for (ImportDeclarationContext idc : context.importDeclaration()) {
			imports.add(new ClassImport(idc.qualifiedName().getText()));
		}

		List<Annotation> annotations = new ArrayList<Annotation>();
		TypeDeclarationContext tdc = context.typeDeclaration();
		for (ModifierContext coimc : tdc.modifier()) {
			AnnotationContext ac = coimc.annotation();
			if (ac != null) {
				annotations.add(readAnnotation(ac));
			}
		}
		ClassDeclarationContext cdc = tdc.classDeclaration();

		JClass clazz = readClass(cdc);
		clazz.setAnnotations(annotations);
		return clazz;
	}

	public String resolveReference(String input) {
		if (input.contains(".")) {
			System.out.println("Not resolving '" + input + "' due to '.'!");
			return input;
		}
		for (ClassImport in : imports) {
			if (in.getName().equals(input)) {
				System.out.println("Resolved '" + input + "' to '" + in.getFull() + "'");
				return in.getFull();
			}
		}

		if (input.equals("float")) {
			return "java.float";
		}

		System.out.println("!WARNING! Failed to resolve type '" + input + "'");
		return input;
	}

	public String resolveReferenceGreedy(String input) {
		for (ClassImport in : imports) {
			if (input.startsWith(in.getName())) {
				String resolved = in.getFull() + input.substring(in.getName().length());
				System.out.println("Resolved '" + input + "' to '" + resolved + "'");
				return resolved;
			}
		}

		if (input.equals("float")) {
			return "java.float";
		}

		System.out.println("!WARNING! Failed to resolve type '" + input + "'");
		return input;
	}

	private JClass readClass(ClassDeclarationContext cdc) {
		JClass clazz = new JClass(cdc.Identifier().getText());
		for (MemberDeclarationContext mdc : cdc.classBody().memberDeclaration()) {
			EnumSet<Modifier> modifiers = EnumSet.noneOf(Modifier.class);
			List<Annotation> annotations = new ArrayList<Annotation>();
			for (ModifierContext mc : mdc.modifier()) {
				if (mc.annotation() != null) {
					annotations.add(readAnnotation(mc.annotation()));
				} else if (mc.getTokens(JShaderParser.PUBLIC).size() > 0) {
					modifiers.add(Modifier.Public);
				} else if (mc.getTokens(JShaderParser.PROTECTED).size() > 0) {
					modifiers.add(Modifier.Protected);
				} else if (mc.getTokens(JShaderParser.PRIVATE).size() > 0) {
					modifiers.add(Modifier.Private);
				} else if (mc.getTokens(JShaderParser.STATIC).size() > 0) {
					modifiers.add(Modifier.Static);
				} else {
					throw new RuntimeException("Unsupported modifier");
				}
			}
			if (mdc.methodDeclaration() != null) {
				MethodDeclarationContext methdc = mdc.methodDeclaration();
				MethodReturnContext mrc = methdc.methodReturn();
				Type result = mrc.type() != null ? new Type(readType(mrc.type())) : null;
				String name = methdc.Identifier().getText();
				List<Parameter> parameters = readFormalParameters(methdc.formalParameters());
				List<Statement> statements = readBlock(methdc.block());
				clazz.addMethod(new Method(modifiers, annotations, result, name, parameters, statements));
			} else if (mdc.fieldDeclaration() != null) {
				FieldDeclarationContext fdc = mdc.fieldDeclaration();
				String type = resolveReference(fdc.type().getText());
				int arrayCount = 0;
				if (type.contains("[")) {
					arrayCount += countOccurrences(type, '[');
					type = type.substring(0, type.indexOf('['));
				}

				for (VariableDeclaratorContext vdc : fdc.variableDeclarators().variableDeclarator()) {
					String name = vdc.variableDeclaratorId().getText();
					if (name.contains("[")) {
						arrayCount += countOccurrences(name, '[');
						name = name.substring(0, name.indexOf('['));
					}

					Step step = null;
					if (vdc.variableInitializer() != null) {
						if (vdc.variableInitializer().simpleExpression() != null) {
							step = readSimpleExpression(vdc.variableInitializer().simpleExpression());
						} else {
							throw new RuntimeException("Field initializers are not supported! " + name);
						}
					}

					String ltype = type;
					for (int i = 0; i < arrayCount; i++) {
						ltype += "[]";
					}
					clazz.addField(new Variable(modifiers, annotations, name, ltype, step));
				}
			} else if (mdc.constructorDeclaration() != null) {
				ConstructorDeclarationContext condc = mdc.constructorDeclaration();

				if (!condc.Identifier().getText().equals(clazz.getName())) {
					throw new RuntimeException("Invalid constructor name!");
				}

				throw new RuntimeException("Constructor methods are not used yet!");
			} else if (mdc.classDeclaration() != null) {
				JClass sub = readClass(mdc.classDeclaration());
				sub.setAnnotations(annotations);
				// TODO: Set mods
				clazz.addSubClass(sub);
			} else if (mdc.enumDeclaration() != null) {
				throw new RuntimeException("Custom enums are not working yet!");
			} else {
				throw new RuntimeException("Unknown member type!");
			}

		}

		return clazz;
	}

	private Step readSimpleExpression(SimpleExpressionContext sec) {
		ExpressionParser listener = new ExpressionParser(this);
		listener.wrap();
		ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
		parseTreeWalker.walk(listener, sec);
		return listener.unwrap().get(0);
	}

	private Annotation readAnnotation(AnnotationContext ac) {
		Annotation annotation = new Annotation(resolveReference(ac.annotationName().getText()));
		if (ac.elementValue() != null) {
			annotation.addValue("value", parseElementValue(ac.elementValue()));
		} else if (ac.elementValuePairs() != null) {
			for (ElementValuePairContext evpc : ac.elementValuePairs().elementValuePair()) {
				annotation.addValue(evpc.Identifier().getText(), parseElementValue(evpc.elementValue()));
			}
		}
		return annotation;
	}

	private Object parseElementValue(ElementValueContext evc) {
		if (evc.simpleType() != null) {
			return parseSimpleType(evc.simpleType());
		} else {
			throw new RuntimeException("Unhandled!");
		}
	}

	private Object parseSimpleType(SimpleTypeContext stc) {
		if (stc.literal() != null) {
			LiteralContext lc = stc.literal();
			if (lc.IntegerLiteral() != null) {
				return Integer.parseInt(lc.IntegerLiteral().getText());
			} else if (lc.FloatingPointLiteral() != null) {
				return Float.parseFloat(lc.FloatingPointLiteral().getText());
			} else if (lc.CharacterLiteral() != null) {
				throw new RuntimeException("Character literals are not supported yet!");
			} else if (lc.StringLiteral() != null) {
				String text = lc.StringLiteral().getText();
				return text.substring(1, text.length() - 1);
			} else if (lc.BooleanLiteral() != null) {
				return Boolean.parseBoolean(lc.BooleanLiteral().getText());
			} else {
				throw new RuntimeException("Unknown literal! " + lc.getText());
			}
		} else if (stc.qualifiedName() != null) {
			return new QualifiedName(resolveReferenceGreedy(stc.qualifiedName().getText()));
		}
		throw new RuntimeException("Unknown type! " + stc.getText());
	}

	private List<Statement> readBlock(BlockContext bc) {
		List<Statement> statements = new ArrayList<Statement>();
		for (BlockStatementContext bsc : bc.blockStatement()) {
			if (bsc.localVariableDeclaration() != null) {
				LocalVariableDeclarationContext lvdc = bsc.localVariableDeclaration();
				String type = readType(lvdc.type());
				System.out.println("type " + type);

				for (VariableDeclaratorContext vdc : lvdc.variableDeclarators().variableDeclarator()) {
					String name = vdc.variableDeclaratorId().getText();
					Step step = null;
					if (vdc.variableInitializer() != null) {
						if (vdc.variableInitializer().simpleExpression() != null) {
							step = readSimpleExpression(vdc.variableInitializer().simpleExpression());
						} else {
							throw new RuntimeException("Field initializers are not supported! " + name);
						}
					}
					statements.add(new StatementDeclareVariable(type, name, step));
				}
			} else if (bsc.statement() != null) {
				if (bsc.statement().block() != null) {
					throw new RuntimeException("Blocks aren't supported yet!");
				} else if (bsc.statement().returnStatement() != null) {
					SimpleExpressionContext sec = bsc.statement().returnStatement().simpleExpression();
					statements.add(new StatementReturn(sec != null ? readSimpleExpression(sec) : null));
				} else if (bsc.statement().expressionStatement() != null) {
					SimpleExpressionContext sec = bsc.statement().expressionStatement().simpleExpression();
					statements.add(new StatementStep(readSimpleExpression(sec)));
				} else {
					throw new RuntimeException("Unknown! " + bsc.getText());
				}
			} else {
				throw new RuntimeException("Unknow block statement!");
			}
		}
		return statements;
	}

	private List<Parameter> readFormalParameters(FormalParametersContext fpsc) {
		List<Parameter> parameters = new ArrayList<Parameter>();
		for (FormalParameterContext fpc : fpsc.formalParameter()) {
			List<Annotation> annotations = new ArrayList<Annotation>();
			for (VariableModifierContext vmc : fpc.variableModifier()) {
				if (vmc.annotation() != null) {
					annotations.add(readAnnotation(vmc.annotation()));
				} else {
					throw new RuntimeException("Unsupported modifier");
				}
			}

			int arrayCount = 0;
			String type = readType(fpc.type());
			if (type.contains("[")) {
				arrayCount += countOccurrences(type, '[');
				type = type.substring(0, type.indexOf('['));
			}

			String name = fpc.variableDeclaratorId().getText();
			if (name.contains("[")) {
				arrayCount += countOccurrences(name, '[');
				name = name.substring(0, name.indexOf('['));
			}

			for (int i = 0; i < arrayCount; i++) {
				type += "[]";
			}

			parameters.add(new Parameter(type, name, annotations));
		}

		return parameters;
	}

	private String readType(TypeContext tc) {
		if (tc.primitiveType() != null) {
			return tc.getText();
		}

		String text = tc.getText();
		if (text.contains("[")) {
			return resolveReference(text.substring(0, text.indexOf("["))) + text.substring(text.indexOf('['));
		} else {
			return resolveReference(text);
		}
	}

	public static int countOccurrences(String haystack, char needle) {
		int count = 0;
		for (int i = 0; i < haystack.length(); i++) {
			if (haystack.charAt(i) == needle) {
				count++;
			}
		}
		return count;
	}

}
