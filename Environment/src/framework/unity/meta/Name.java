package framework.unity.meta;

import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Target;

@Target(TYPE)
public @interface Name {
	
	public String value();

}
