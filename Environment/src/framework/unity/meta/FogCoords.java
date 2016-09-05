package framework.unity.meta;

import static java.lang.annotation.ElementType.FIELD;

import java.lang.annotation.Target;

@Target(FIELD)
public @interface FogCoords {
	
	public int value();
	
	
}
