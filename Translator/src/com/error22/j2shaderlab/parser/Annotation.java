package com.error22.j2shaderlab.parser;

import java.util.HashMap;

public class Annotation {
	private String type;
	private HashMap<String, Object> values;

	public Annotation(String type) {
		this.type = type;
		values = new HashMap<String, Object>();
	}

	public String getType() {
		return type;
	}

	public void addValue(String name, Object value) {
		values.put(name, value);
	}

	public Object getValue(String name) {
		return values.get(name);
	}
	
	@SuppressWarnings("unchecked")
	public <T> T getValue(String name, Class<T> type, T def) {
		if(!values.containsKey(name)){
			return def;
		}
		return (T) values.get(name);
	}

	@Override
	public String toString() {
		return "Annotation [type=" + type + ", values=" + values + "]";
	}

}
