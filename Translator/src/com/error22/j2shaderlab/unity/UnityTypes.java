package com.error22.j2shaderlab.unity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UnityTypes {
	public static String UnityShader = "framework.unity.meta.UnityShader";
	public static String SubShader = "framework.unity.meta.SubShader";
	public static String ShaderPass = "framework.unity.meta.ShaderPass";
	public static String Fallback = "framework.unity.meta.Fallback";
	public static String SurfaceShader = "framework.unity.meta.SurfaceShader";
	public static String LightingModels_Standard = "framework.unity.meta.LightingModels.Standard";
	public static String ColorProperty = "framework.unity.properties.ColorProperty";
	public static String RangeProperty = "framework.unity.properties.RangeProperty";
	public static String TextureProperty = "framework.unity.properties.TextureProperty";
	public static String TextureArrayProperty = "framework.unity.properties.TextureArrayProperty";
	public static String LOD = "framework.unity.meta.LOD";
	public static String MultiCompileFog = "framework.unity.meta.MultiCompileFog";
	public static String ShaderModel = "framework.unity.meta.ShaderModel";
	public static String Include = "framework.unity.meta.Include";
	public static String SimpleInclude = "framework.unity.meta.SimpleInclude";
	public static String SimpleIncludes = "framework.unity.meta.SimpleIncludes";
	public static String SimpleIncludes_UnityGC = "framework.unity.meta.SimpleIncludes.UnityGC";
	public static String RenderType = "framework.unity.meta.RenderType";
	public static String RenderTypes = "framework.unity.meta.RenderTypes";
	public static String RenderTypes_Opaque = "framework.unity.meta.RenderTypes.Opaque";
	public static String DataType = "framework.unity.meta.DataType";
	public static String DataTypes = "framework.unity.meta.DataTypes";
	public static String DataTypes_Vertex = "framework.unity.meta.DataTypes.Vertex";
	public static String DataTypes_Fragment = "framework.unity.meta.DataTypes.Fragment";
	public static String FogCoords = "framework.unity.meta.FogCoords";
	public static String VertexHandler = "framework.unity.meta.VertexHandler";
	public static String FragmentHandler = "framework.unity.meta.FragmentHandler";
	public static String SurfaceHandler = "framework.unity.meta.SurfaceHandler";
	public static String DataSources = "framework.unity.meta.DataSources";
	public static String DataSources_Position = "framework.unity.meta.DataSources.Position";
	public static String Float = "framework.unity.types.Float";
	public static String Float2 = "framework.unity.types.Float2";
	public static String Float3 = "framework.unity.types.Float3";
	public static String Float4 = "framework.unity.types.Float4";
	public static String Float4x4 = "framework.unity.types.Float4x4";
	public static String Fixed = "framework.unity.types.Fixed";
	public static String Fixed3 = "framework.unity.types.Fixed3";
	public static String Fixed4 = "framework.unity.types.Fixed4";
	public static String Half = "framework.unity.types.Half";
	public static String Half3 = "framework.unity.types.Half3";
	public static String Sampler2D = "framework.unity.types.Sampler2D";
	public static String Sampler2DArray = "framework.unity.types.Sampler2DArray";
	public static String SurfaceOutputStandard = "framework.unity.types.SurfaceOutputStandard";
	public static String AppdataFull = "framework.unity.types.AppdataFull";
	public static String InOut = "framework.unity.meta.InOut";
	public static String Out = "framework.unity.meta.Out";
	private static Map<String, UnityClass> classes;

	private static void registerClass(UnityClass clazz) {
		classes.put(clazz.getName(), clazz);
	}

	public static boolean doesClassExist(String name) {
		return classes.containsKey(name);
	}

	public static UnityClass getClass(String name) {
		return classes.get(name);
	}

	static {
		classes = new HashMap<String, UnityClass>();

		UnityClass fixedClass = new UnityClass(Fixed, "fixed");
		fixedClass.registerMethod("Fixed", Fixed, new String[] { null }).setGenerator(new MethodCallGenerator() {

			@Override
			public GenData generate(GenData target, List<GenData> args) {
				GenData data = args.get(0);
				return new GenData(data.getLines().toString(), data.getText().toString(), Fixed, false);
			}
		});
		registerClass(fixedClass);

		UnityClass fixed4Class = new UnityClass(Fixed4, "fixed4");
		fixed4Class.registerField("a", Fixed).useSimpleGenerator();
		fixed4Class.registerField("rgb", Fixed3).useSimpleGenerator();
		fixed4Class.registerField("xyz", Fixed3).useSimpleGenerator();
		registerClass(fixed4Class);

		UnityClass fixed3Class = new UnityClass(Fixed3, "fixed3");
		registerClass(fixed3Class);

		UnityClass floatClass = new UnityClass(Float, "float");
		registerClass(floatClass);

		UnityClass float2Class = new UnityClass(Float2, "float2");
		registerClass(float2Class);

		UnityClass float3Class = new UnityClass(Float3, "float3");
		float3Class.registerMethod("Float3", Float3, Float, Float, Float).useMacroGenerator("float3");
		float3Class.registerField("x", Float).useSimpleGenerator();
		float3Class.registerField("y", Float).useSimpleGenerator();
		float3Class.registerField("z", Float).useSimpleGenerator();
		float3Class.registerField("zy", Float2).useSimpleGenerator();
		float3Class.registerField("zx", Float2).useSimpleGenerator();
		float3Class.registerField("xy", Float2).useSimpleGenerator();
		registerClass(float3Class);

		UnityClass float4Class = new UnityClass(Float4, "float4");
		float4Class.registerField("a", Float).useSimpleGenerator();
		float4Class.registerField("xyz", Float3).useSimpleGenerator();
		registerClass(float4Class);

		UnityClass halfClass = new UnityClass(Half, "half");
		registerClass(halfClass);

		UnityClass sampler2DClass = new UnityClass(Sampler2D, "sampler2D");
		sampler2DClass.registerMethod("getColor", Fixed4, Float2).useSimpleGenerator("tex2D");
		registerClass(sampler2DClass);

		UnityClass sampler2DArrayClass = new UnityClass(Sampler2DArray, null);
		sampler2DArrayClass.registerMethod("getColor", Fixed4, Float3).useSimpleGenerator("UNITY_SAMPLE_TEX2DARRAY");
		registerClass(sampler2DArrayClass);

		UnityClass surfaceOutputStandardClass = new UnityClass(SurfaceOutputStandard, "SurfaceOutputStandard");
		surfaceOutputStandardClass.registerField("albedo", Fixed3).useRenameGenerator("Albedo");
		surfaceOutputStandardClass.registerField("normal", Fixed3).useRenameGenerator("Normal");
		surfaceOutputStandardClass.registerField("emission", Half3).useRenameGenerator("Emission");
		surfaceOutputStandardClass.registerField("metallicness", Half).useRenameGenerator("Metallic");
		surfaceOutputStandardClass.registerField("smoothness", Half).useRenameGenerator("Smoothness");
		surfaceOutputStandardClass.registerField("occlusion", Half).useRenameGenerator("Occlusion");
		surfaceOutputStandardClass.registerField("alpha", Fixed).useRenameGenerator("Alpha");
		registerClass(surfaceOutputStandardClass);

		UnityClass appdataFullClass = new UnityClass(AppdataFull, "appdata_full");
		appdataFullClass.registerField("vertex", Float4).useRenameGenerator("vertex");
		appdataFullClass.registerField("tangent", Float4).useRenameGenerator("tangent");
		appdataFullClass.registerField("normal", Float3).useRenameGenerator("normal");
		appdataFullClass.registerField("texCoord", Float4).useRenameGenerator("texcoord");
		appdataFullClass.registerField("texCoord1", Float4).useRenameGenerator("texcoord1");
		appdataFullClass.registerField("texCoord2", Float4).useRenameGenerator("texcoord2");
		appdataFullClass.registerField("texCoord3", Float4).useRenameGenerator("texcoord3");
		appdataFullClass.registerField("color", Fixed4).useRenameGenerator("color");
		registerClass(appdataFullClass);

		UnityClass globalsClass = new UnityClass("framework.unity.Globals", null);
		globalsClass.registerField("ModelViewProjectionMatrix", Float4x4).useStaticGenerator("UNITY_MATRIX_MVP");
		registerClass(globalsClass);

		UnityClass mathClass = new UnityClass("framework.unity.Math", null);
		mathClass.registerMethod("mult", Float4, Float4x4, Float4).useMacroGenerator("mul");
		mathClass.registerMethod("mult", Fixed4, Fixed4, Fixed4).useOperatorGenerator("*");
		mathClass.registerMethod("mult", Float3, Float3, Float).useOperatorGenerator("*");
		mathClass.registerMethod("mult", Float2, Float2, Float).useOperatorGenerator("*");
		mathClass.registerMethod("mult", Fixed3, Fixed3, Float).useOperatorGenerator("*");
		mathClass.registerMethod("saturate", Float3, Float3).useMacroGenerator("saturate");
		mathClass.registerMethod("pow", Float3, Float3, Float3).useMacroGenerator("pow");
		mathClass.registerMethod("frac", Float3, Float3).useMacroGenerator("frac");
		mathClass.registerMethod("frac", Float2, Float2).useMacroGenerator("frac");
		mathClass.registerMethod("abs", Float, Float).useMacroGenerator("abs");
		mathClass.registerMethod("lerp", Fixed3, Fixed3, Fixed3, Float).useMacroGenerator("lerp");
		registerClass(mathClass);

		UnityClass macrosClass = new UnityClass("framework.unity.Macros", null);
		macrosClass.registerMethod("transferFog", null, null, Float4).useMacroGenerator("UNITY_TRANSFER_FOG");
		macrosClass.registerMethod("applyFog", null, Float, Fixed4).useMacroGenerator("UNITY_APPLY_FOG");
		macrosClass.registerMethod("opaqueAlpha", null, Fixed).useMacroGenerator("UNITY_OPAQUE_ALPHA");

		macrosClass.registerMethod("initializeOutput", null, new String[] { null })
				.setGenerator(new MethodCallGenerator() {

					@Override
					public GenData generate(GenData target, List<GenData> args) {
						GenData a1 = args.get(0);
						StringBuilder text = new StringBuilder();
						text.append("UNITY_INITIALIZE_OUTPUT(");
						text.append(a1.getType());
						text.append(", ");
						text.append(a1.getText());
						text.append(")");

						System.out
								.println("Generated method call using macro generator: " + a1.getLines() + " " + text);

						return new GenData(a1.getLines().toString(), text.toString(), null, false);
					}
				});
		registerClass(macrosClass);

	}

}
