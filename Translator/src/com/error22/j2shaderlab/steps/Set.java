package com.error22.j2shaderlab.steps;

public class Set extends Step {
	private Step lhs, rhs;

	public Set(Step lhs, Step rhs) {
		this.lhs = lhs;
		this.rhs = rhs;
	}

	public Step getLhs() {
		return lhs;
	}
	
	public Step getRhs() {
		return rhs;
	}
	
	@Override
	public String toString() {
		return "Set [lhs=" + lhs + ", rhs=" + rhs + "]";
	}

}
