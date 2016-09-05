package com.error22.j2shaderlab.data;

import java.util.EnumSet;
import java.util.List;

import com.error22.j2shaderlab.parser.Annotation;
import com.error22.j2shaderlab.steps.Step;

public class Variable {
	private EnumSet<Modifier> modifiers;
	private List<Annotation> annotations;
	private String name, type;
	private Step initializer;

	public Variable(EnumSet<Modifier> modifiers, List<Annotation> annotations, String name, String type,
			Step initializer) {
		this.modifiers = modifiers;
		this.annotations = annotations;
		this.name = name;
		this.type = type;
		this.initializer = initializer;
	}

	public String getType() {
		return type;
	}

	public String getName() {
		return name;
	}

	public List<Annotation> getAnnotations() {
		return annotations;
	}

	public Annotation getAnnotation(String type) {
		for (Annotation annotation : annotations) {
			if (annotation.getType().equals(type)) {
				return annotation;
			}
		}
		return null;
	}

	public Step getInitializer() {
		return initializer;
	}

	@Override
	public String toString() {
		return "Variable [modifiers=" + modifiers + ", annotations=" + annotations + ", name=" + name + ", type=" + type
				+ ", initializer=" + initializer + "]";
	}

}
