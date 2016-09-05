package framework.unity.meta;

import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Target;

@Target(TYPE)
public @interface SurfaceShader {

	public LightingModels lighting();

	public boolean fullForwardShadows() default false;

	/**
	 * Generate a shadow caster pass. Commonly used with custom vertex
	 * modification, so that shadow casting also gets any procedural vertex
	 * animation. Often shaders don’t need any special shadows handling, as they
	 * can just use shadow caster pass from their fallback.
	 */
	public boolean castShadowsPass() default false;

	public boolean disableShadows() default false;
	
	/**
	 * Do not generate passes for deferred rendering path
	 */
	public boolean disableDeferred() default false;

	/**
	 * Do not generate passes for forward rendering path
	 */
	public boolean disableForward() default false;
	
	/**
	 * Do not generate passes for legacy deferred rendering path
	 */
	public boolean disablePrePass() default false;

	
	public boolean disableForwardAdd() default false;
}
