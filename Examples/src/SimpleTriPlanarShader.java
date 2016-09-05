import framework.unity.Math;
import framework.unity.meta.Fallback;
import framework.unity.meta.InOut;
import framework.unity.meta.LightingModels;
import framework.unity.meta.RenderType;
import framework.unity.meta.RenderTypes;
import framework.unity.meta.SurfaceHandler;
import framework.unity.meta.SurfaceShader;
import framework.unity.meta.UnityShader;
import framework.unity.properties.RangeProperty;
import framework.unity.properties.TextureProperty;
import framework.unity.types.Fixed;
import framework.unity.types.Fixed3;
import framework.unity.types.Float3;
import framework.unity.types.Half;
import framework.unity.types.Sampler2D;
import framework.unity.types.SurfaceOutputStandard;

@UnityShader("Examples/SimpleTriPlanarShader")
@Fallback("Diffuse")
public class SimpleTriPlanarShader {

	@RangeProperty(name = "Smoothness", min = 0, max = 1)
	public Half _Glossiness = new Half(0.5f);

	@RangeProperty(name = "Metallic", min = 0, max = 1)
	public Half _Metallic = new Half(0f);

	@TextureProperty("Albedo X (RGB)")
	public Sampler2D _AlbedoX = new Sampler2D("white");

	@TextureProperty("Albedo Y (RGB)")
	public Sampler2D _AlbedoY = new Sampler2D("white");

	@TextureProperty("Albedo Y (RGB)")
	public Sampler2D _AlbedoZ = new Sampler2D("white");

	@RangeProperty(name = "Scale", min = 0, max = 100)
	public float _Scale = 0;

	@SurfaceShader(lighting = LightingModels.Standard, disableForward = true, disablePrePass = true, disableForwardAdd = true)
	@RenderType(RenderTypes.Opaque)
	// TODO: Queue + IgnoreProjector
	public class Sub1 {

		public class Input {
			public Float3 worldPos;
			public Float3 worldNormal;
		}

		@SurfaceHandler
		public void surf(Input IN, @InOut SurfaceOutputStandard o) {
			Float3 projNormal = Math.saturate(Math.pow(Math.mult(IN.worldNormal, 1.4f), new Float3(4, 4, 4)));

			Fixed3 x = Math.mult(_AlbedoX.getColor(Math.frac(Math.mult(IN.worldPos.zy, _Scale))).xyz,
					Math.abs(IN.worldNormal.x));
			Fixed3 y = Math.mult(_AlbedoY.getColor(Math.frac(Math.mult(IN.worldPos.zx, _Scale))).xyz,
					Math.abs(IN.worldNormal.y));
			Fixed3 z = Math.mult(_AlbedoZ.getColor(Math.frac(Math.mult(IN.worldPos.xy, _Scale))).xyz,
					Math.abs(IN.worldNormal.z));
			o.albedo = z;
			o.albedo = Math.lerp(o.albedo, x, projNormal.x);
			o.albedo = Math.lerp(o.albedo, y, projNormal.y);
			o.metallicness = _Metallic;
			o.smoothness = _Glossiness;
			o.alpha = new Fixed(1);
		}

	}

}