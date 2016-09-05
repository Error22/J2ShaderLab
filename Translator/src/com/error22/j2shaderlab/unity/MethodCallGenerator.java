package com.error22.j2shaderlab.unity;

import java.util.List;

public interface MethodCallGenerator {
	
	public GenData generate(GenData target, List<GenData> args);
	
	
}
