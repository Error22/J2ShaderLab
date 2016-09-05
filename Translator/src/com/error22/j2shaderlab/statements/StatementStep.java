package com.error22.j2shaderlab.statements;

import com.error22.j2shaderlab.steps.Step;

public class StatementStep extends Statement {
	private Step step;

	public StatementStep(Step step) {
		this.step = step;
	}
	
	public Step getStep() {
		return step;
	}

	@Override
	public String toString() {
		return "StatementStep [step=" + step + "]";
	}

}
