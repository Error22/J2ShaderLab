package com.error22.j2shaderlab.data;

import java.util.List;

import com.error22.j2shaderlab.parser.Annotation;

public class Parameter {
	private String type, name;
	private List<Annotation> annotations;

	public Parameter(String type, String name, List<Annotation> annotations) {
		this.type = type;
		this.name = name;
		this.annotations = annotations;
	}

	public String getName() {
		return name;
	}
	
	public String getType() {
		return type;
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
	
	@Override
	public String toString() {
		return "Parameter [type=" + type + ", name=" + name + "]";
	}

}
