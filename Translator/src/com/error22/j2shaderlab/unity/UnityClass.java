package com.error22.j2shaderlab.unity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UnityClass {
	private String name, conversion;
	private List<String> methodNames;
	private List<UnityMethod> methods;
	private Map<String, UnityField> fields;
	
	public UnityClass(String name, String conversion) {
		this.name = name;
		this.conversion = conversion;
		methodNames = new ArrayList<String>();
		methods = new ArrayList<UnityMethod>();
		fields = new HashMap<String, UnityField>();
	}
	
	public UnityMethod registerMethod(String name, String type, String... args){
		if(!methodNames.contains(name)){
			methodNames.add(name);
		}
		UnityMethod method = new UnityMethod(name, type, args);
		methods.add(method);
		return method;
	}
	
	public UnityMethod findMethod(String name, String[] args) {
		search: for(UnityMethod method : methods){
			if(method.getName().equals(name)){
				if(method.getArgs().length != args.length){
					continue;
				}
				
				for(int i = 0; i < args.length; i++){
					if(method.getArgs()[i] != null && !method.getArgs()[i].equals(args[i])){
						continue search;
					}
				}
				
				return method;
			}
		}
		return null;
	}
	
	public boolean doesMethodExist(String name){
		return methodNames.contains(name);
	}
	
	public UnityField registerField(String name, String type){
		UnityField field = new UnityField(type, name);
		fields.put(name, field);
		return field;
	}
	
	public boolean doesFieldExist(String name) {
		return fields.containsKey(name);
	}

	public UnityField getField(String name) {
		return fields.get(name);
	}
	
	public String getConversion() {
		return conversion;
	}
	
	public String getName() {
		return name;
	}


}
