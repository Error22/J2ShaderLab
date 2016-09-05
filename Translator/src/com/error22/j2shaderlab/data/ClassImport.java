package com.error22.j2shaderlab.data;

public class ClassImport {
	private String full, path, name;

	public ClassImport(String full) {
		this.full = full;
		path = full.substring(0, full.lastIndexOf("."));
		name = full.substring(full.lastIndexOf(".") + 1);
	}

	public String getFull() {
		return full;
	}

	public String getPath() {
		return path;
	}

	public String getName() {
		return name;
	}

}
