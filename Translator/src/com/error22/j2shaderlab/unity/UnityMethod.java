package com.error22.j2shaderlab.unity;

import java.util.List;

public class UnityMethod {
	private String name, type;
	private String[] args;
	private MethodCallGenerator generator;

	public UnityMethod(String name, String type, String[] args) {
		this.name = name;
		this.type = type;
		this.args = args;
	}

	public String getName() {
		return name;
	}

	public String[] getArgs() {
		return args;
	}

	public String getType() {
		return type;
	}

	public MethodCallGenerator getGenerator() {
		return generator;
	}

	public void setGenerator(MethodCallGenerator generator) {
		this.generator = generator;
	}

	public void useMacroGenerator(String targetMethodName) {
		generator = new MethodCallGenerator() {

			@Override
			public GenData generate(GenData target, List<GenData> args) {
				StringBuilder lines = new StringBuilder();
				StringBuilder text = new StringBuilder();
				text.append(targetMethodName);
				text.append('(');

				boolean first = true;
				for (GenData arg : args) {
					lines.append(arg.getLines());

					if (!first) {
						text.append(", ");
					}
					text.append(arg.getText());
					first = false;
				}

				text.append(")");

				System.out.println("Generated method call using macro generator: " + lines + " " + text + " " + type);

				return new GenData(lines.toString(), text.toString(), type, false);
			}
		};
	}
	
	public void useOperatorGenerator(String op) {
		generator = new MethodCallGenerator() {

			@Override
			public GenData generate(GenData target, List<GenData> args) {
				StringBuilder lines = new StringBuilder();
				StringBuilder text = new StringBuilder();
				text.append('(');

				boolean first = true;
				for (GenData arg : args) {
					lines.append(arg.getLines());

					if (!first) {
						text.append(" "+op+" ");
					}
					text.append(arg.getText());
					first = false;
				}

				text.append(")");

				System.out.println("Generated method call using operator generator: " + lines + " " + text + " " + type);

				return new GenData(lines.toString(), text.toString(), type, false);
			}
		};
	}

	public void useSimpleGenerator(String targetMethodName) {
		generator = new MethodCallGenerator() {

			@Override
			public GenData generate(GenData target, List<GenData> args) {
				StringBuilder lines = new StringBuilder();
				StringBuilder text = new StringBuilder();
				text.append(targetMethodName);
				text.append('(');

				lines.append(target.getLines());
				String param = target.getText().toString();
				text.append(param.substring(0, param.length() - name.length() - 1));

				for (GenData arg : args) {
					text.append(", ");
					lines.append(arg.getLines());
					text.append(arg.getText());
				}

				text.append(")");

				System.out.println("Generated method call using simple generator: " + lines + " " + text + " " + type);

				return new GenData(lines.toString(), text.toString(), type, false);
			}
		};
	}

}
