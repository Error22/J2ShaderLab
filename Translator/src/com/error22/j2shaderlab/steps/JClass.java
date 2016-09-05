package com.error22.j2shaderlab.steps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.error22.j2shaderlab.data.Method;
import com.error22.j2shaderlab.data.Variable;
import com.error22.j2shaderlab.parser.Annotation;

public class JClass {
	private String name;
	private List<JClass> subClasses;
	private Map<String, Method> methods;
	private Map<String, Variable> fields;
	private List<Annotation> annotations;

	public JClass(String name) {
		this.name = name;
		subClasses = new ArrayList<JClass>();
		methods = new HashMap<String, Method>();
		fields = new HashMap<String, Variable>();
	}

	public void addSubClass(JClass clazz) {
		subClasses.add(clazz);
	}

	public List<JClass> getSubClasses() {
		return subClasses;
	}

	public String getName() {
		return name;
	}
	
	public void addMethod(Method method) {
		methods.put(method.getName(), method);
	}
	
	public Map<String, Method> getMethods() {
		return methods;
	}
	
	public void addField(Variable variable) {
		fields.put(variable.getName(), variable);
	}

	public Map<String, Variable> getFields() {
		return fields;
	}

	public void setAnnotations(List<Annotation> annotations) {
		this.annotations = annotations;
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
		return "JClass [name=" + name + ", subClasses=" + subClasses + ", fields=" + fields
				+ ", annotations=" + annotations + "]";
	}

}
