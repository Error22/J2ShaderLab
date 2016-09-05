package com.error22.j2shaderlab.steps;

public class Instantiate extends Step {
	private Type type;
	private Arguments arguments;

	public Instantiate(Type type, Arguments arguments) {
		this.type = type;
		this.arguments = arguments;
	}
	
	public Type getType() {
		return type;
	}

	public Arguments getArguments() {
		return arguments;
	}
	
	@Override
	public String toString() {
		return "Instantiate [type=" + type + ", arguments=" + arguments + "]";
	}

}
