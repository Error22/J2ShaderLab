package framework.unity;

import framework.unity.types.Float3;
import framework.unity.types.Float4;
import framework.unity.types.Float4x4;

public class Globals {
	public static Float4x4 ModelViewProjectionMatrix;
	public static Float4x4 ModelViewMatrix;
	public static Float4x4 ViewMatrix;
	public static Float4x4 ProjectionMatrix;
	public static Float4x4 ViewProjectionMatrix;
	public static Float4x4 ModelViewTransposeMatrix;
	public static Float4x4 ModelViewInverseTransponseMatrix;
	public static Float4x4[] TextureMatrix;
	public static Float4x4 Object2World;
	public static Float4x4 World2Object;
	public static Float3 WorldSpaceCameraPos;
	public static Float4 UnityScale;
}
