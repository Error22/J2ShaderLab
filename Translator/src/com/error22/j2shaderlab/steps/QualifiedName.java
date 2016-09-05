package com.error22.j2shaderlab.steps;

public class QualifiedName extends Step {
	private String name;

	public QualifiedName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "QualifiedName [name=" + name + "]";
	}

}
