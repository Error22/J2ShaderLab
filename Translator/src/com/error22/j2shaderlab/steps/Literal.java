package com.error22.j2shaderlab.steps;

public class Literal extends Step {
	private Object value;

	public Literal(Object value) {
		this.value = value;
	}
	
	public Object getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Literal [value=" + value + "]";
	}

}
