package com.error22.j2shaderlab.steps;

import java.util.List;

public class Arguments extends Step{
	private List<Step> expressions;

	public Arguments(List<Step> expressions) {
		this.expressions = expressions;
	}

	public List<Step> getExpressions() {
		return expressions;
	}
	
	@Override
	public String toString() {
		return "Arguments [expressions=" + expressions + "]";
	}

}
