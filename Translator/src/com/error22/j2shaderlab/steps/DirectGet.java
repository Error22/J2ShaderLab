package com.error22.j2shaderlab.steps;

public class DirectGet extends Step {
	private String name;

	public DirectGet(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "DirectGet [name=" + name + "]";
	}
	
}
