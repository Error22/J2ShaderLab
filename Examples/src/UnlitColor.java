import framework.unity.Globals;
import framework.unity.Macros;
import framework.unity.meta.DataSources;
import framework.unity.meta.DataType;
import framework.unity.meta.DataTypes;
import framework.unity.meta.FogCoords;
import framework.unity.meta.FragmentHandler;
import framework.unity.meta.LOD;
import framework.unity.meta.MultiCompileFog;
import framework.unity.meta.RenderType;
import framework.unity.meta.RenderTypes;
import framework.unity.meta.ShaderPass;
import framework.unity.meta.SimpleInclude;
import framework.unity.meta.SimpleIncludes;
import framework.unity.meta.SubShader;
import framework.unity.meta.UnityShader;
import framework.unity.meta.VertexHandler;
import framework.unity.properties.ColorProperty;
import framework.unity.types.Fixed4;
import framework.unity.types.Float;
import framework.unity.types.Float4;
import framework.unity.Math;

@UnityShader("Examples/UnlitColor")
public class UnlitColor {

	@ColorProperty("Main Color")
	public Fixed4 _color = new Fixed4(1, 0, 0, 1);

	@SubShader
	@LOD(100)
	@RenderType(RenderTypes.Opaque)
	public class Sub1 {

		@ShaderPass
		@SimpleInclude(SimpleIncludes.UnityGC)
		@MultiCompileFog
		public class Pass1 {

			@DataType(DataTypes.Vertex)
			public class VertData {
				public Float4 vertex = DataSources.Position;
			}

			@DataType(DataTypes.Fragment)
			public class FragData {
				public Float4 vertex = DataSources.Position;
				@FogCoords(0)
				public Float fogCoord;
			}

			@VertexHandler
			public FragData vert(VertData inData) {
				FragData outData = new FragData();
				outData.vertex = Math.mult(Globals.ModelViewProjectionMatrix, inData.vertex);
				Macros.transferFog(outData, inData.vertex);
				return outData;
			}

			@FragmentHandler
			public Fixed4 frag(FragData inData) {
				Fixed4 col = _color;
				Macros.applyFog(inData.fogCoord, col);
				Macros.opaqueAlpha(col.a);
				return col;
			}
		}
	}
}
