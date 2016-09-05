package com.error22.j2shaderlab.data;

import java.util.EnumSet;
import java.util.List;

import com.error22.j2shaderlab.parser.Annotation;
import com.error22.j2shaderlab.statements.Statement;
import com.error22.j2shaderlab.steps.Type;

public class Method {
	private EnumSet<Modifier> modifiers;
	private List<Annotation> annotations;
	private Type type;
	private String name;
	private List<Parameter> parameters;
	private List<Statement> statements;

	public Method(EnumSet<Modifier> modifiers, List<Annotation> annotations, Type type, String name,
			List<Parameter> parameters, List<Statement> statements) {
		this.modifiers = modifiers;
		this.annotations = annotations;
		this.type = type;
		this.name = name;
		this.parameters = parameters;
		this.statements = statements;
	}

	public String getName() {
		return name;
	}
	
	public Type getType() {
		return type;
	}
	
	public List<Statement> getStatements() {
		return statements;
	}
	
	public List<Parameter> getParameters() {
		return parameters;
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
		return "Method [modifiers=" + modifiers + ", annotations=" + annotations + ", type=" + type + ", name=" + name
				+ ", parameters=" + parameters + ", statements=" + statements + "]";
	}

}
