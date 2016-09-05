package com.error22.j2shaderlab.steps;

public class Call extends Step {
	private Step step;
	private Arguments arguments;

	public Call(Step step, Arguments arguments) {
		this.step = step;
		this.arguments = arguments;
	}
	
	public Step getStep() {
		return step;
	}
	
	public Arguments getArguments() {
		return arguments;
	}

	@Override
	public String toString() {
		return "Call [step=" + step + ", arguments=" + arguments + "]";
	}

}
