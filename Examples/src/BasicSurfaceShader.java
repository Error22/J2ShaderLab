import framework.unity.Math;
import framework.unity.meta.Fallback;
import framework.unity.meta.InOut;
import framework.unity.meta.LOD;
import framework.unity.meta.LightingModels;
import framework.unity.meta.RenderType;
import framework.unity.meta.RenderTypes;
import framework.unity.meta.ShaderModel;
import framework.unity.meta.SurfaceHandler;
import framework.unity.meta.SurfaceShader;
import framework.unity.meta.UnityShader;
import framework.unity.properties.ColorProperty;
import framework.unity.properties.RangeProperty;
import framework.unity.properties.TextureProperty;
import framework.unity.types.Fixed4;
import framework.unity.types.Float2;
import framework.unity.types.Half;
import framework.unity.types.Sampler2D;
import framework.unity.types.SurfaceOutputStandard;

@UnityShader("Examples/BasicSurfaceShader")
@Fallback("Diffuse")
public class BasicSurfaceShader {

	@ColorProperty("Color")
	public Fixed4 _Color = new Fixed4(1, 1, 1, 1);

	@TextureProperty("Albedo (RGB)")
	public Sampler2D _MainTex = new Sampler2D("white");

	@RangeProperty(name = "Smoothness", min = 0, max = 1)
	public Half _Glossiness = new Half(0.5f);

	@RangeProperty(name = "Metallic", min = 0, max = 1)
	public Half _Metallic = new Half(0f);

	@SurfaceShader(lighting = LightingModels.Standard, disableForward = true, disablePrePass = true, disableForwardAdd = true)
	@ShaderModel(3.5f)
	@RenderType(RenderTypes.Opaque)
	@LOD(200)
	public class Sub1 {

		public class Input {
			public Float2 uv_MainTex;
		}

		@SurfaceHandler
		public void surf(Input IN, @InOut SurfaceOutputStandard o) {
			Fixed4 c = Math.mult(_MainTex.getColor(IN.uv_MainTex), _Color);
			o.albedo = c.rgb;
			o.metallicness = _Metallic;
			o.smoothness = _Glossiness;
			o.alpha = c.a;
		}

	}

}
