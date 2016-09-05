package com.error22.j2shaderlab.unity;

public class GenData {
	private StringBuilder lines, text;
	private String type;
	private boolean isMethod;

	public GenData() {
		lines = new StringBuilder();
		text = new StringBuilder();
	}

	public GenData(String lines, String text, String type, boolean isMethod) {
		this.lines = new StringBuilder(lines);
		this.text = new StringBuilder(text);
		this.type = type;
		this.isMethod = isMethod;
	}

	public void addLine(String line) {
		lines.append(line + "\n");
	}

	public void append(String data) {
		text.append(data);
	}

	public StringBuilder getLines() {
		return lines;
	}

	public StringBuilder getText() {
		return text;
	}
	
	public boolean isMethod() {
		return isMethod;
	}

	public void setType(String type, boolean isMethod) {
		this.type = type;
		this.isMethod = isMethod;
	}

	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		return "GenData [lines=" + lines + ", text=" + text + ", type=" + type + "]";
	}

}
