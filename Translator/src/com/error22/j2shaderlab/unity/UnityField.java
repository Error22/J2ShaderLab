package com.error22.j2shaderlab.unity;

public class UnityField {
	private String type, name;
	private FieldCallGenerator callGenerator;

	public UnityField(String type, String name) {
		this.type = type;
		this.name = name;
	}

	public FieldCallGenerator getCallGenerator() {
		return callGenerator;
	}

	public void useSimpleGenerator() {
		callGenerator = new FieldCallGenerator() {

			@Override
			public GenData generate(GenData parent) {
				return new GenData(parent.getLines().toString(), parent.getText() + "." + name, type, false);
			}
		};
	}
	
	public void useRenameGenerator(String newName) {
		callGenerator = new FieldCallGenerator() {

			@Override
			public GenData generate(GenData parent) {
				return new GenData(parent.getLines().toString(), parent.getText() + "." + newName, type, false);
			}
		};
	}

	public void useStaticGenerator(String target) {
		callGenerator = new FieldCallGenerator() {

			@Override
			public GenData generate(GenData parent) {
				return new GenData("", target, type, false);
			}
		};
	}

}
