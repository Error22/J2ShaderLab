package com.error22.j2shaderlab.steps;

public class Type extends Step {
	private String name;

	public Type(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Type [name=" + name + "]";
	}

}
