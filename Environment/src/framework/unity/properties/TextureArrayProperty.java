package framework.unity.properties;

import static java.lang.annotation.ElementType.FIELD;

import java.lang.annotation.Target;

@Target(FIELD)
public @interface TextureArrayProperty {
	
	public String value();
	
}
