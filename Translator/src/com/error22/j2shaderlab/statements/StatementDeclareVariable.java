package com.error22.j2shaderlab.statements;

import com.error22.j2shaderlab.steps.Step;

public class StatementDeclareVariable extends Statement {
	private String type, name;
	private Step step;

	public StatementDeclareVariable(String type, String name, Step step) {
		this.type = type;
		this.name = name;
		this.step = step;
	}
	
	public String getType() {
		return type;
	}
	
	public String getName() {
		return name;
	}
	
	public Step getStep() {
		return step;
	}

	@Override
	public String toString() {
		return "StatementDeclareVariable [type=" + type + ", name=" + name + ", step=" + step + "]";
	}

}
