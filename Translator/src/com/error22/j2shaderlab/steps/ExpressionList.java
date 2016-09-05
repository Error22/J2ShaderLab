package com.error22.j2shaderlab.steps;

import java.util.List;

public class ExpressionList extends Step {
	private List<Step> expressions;

	public ExpressionList(List<Step> expressions) {
		this.expressions = expressions;
	}

	public List<Step> getExpressions() {
		return expressions;
	}

	@Override
	public String toString() {
		return "ExpressionList [expressions=" + expressions + "]";
	}

}
