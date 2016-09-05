package com.error22.j2shaderlab.steps;

public class ReferenceGet extends Step {
	private Step expression;
	private String name;

	public ReferenceGet(Step expression, String name) {
		this.expression = expression;
		this.name = name;
	}

	@Override
	public String toString() {
		return "ReferenceGet [expression=" + expression + ", name=" + name + "]";
	}
	
	public Step getExpression() {
		return expression;
	}
	
	public String getName() {
		return name;
	}

}
