package com.error22.j2shaderlab.statements;

import com.error22.j2shaderlab.steps.Step;

public class StatementReturn extends Statement {
	private Step step;

	public StatementReturn(Step step) {
		this.step = step;
	}
	
	public Step getStep() {
		return step;
	}

	@Override
	public String toString() {
		return "StatementReturn [step=" + step + "]";
	}

}
