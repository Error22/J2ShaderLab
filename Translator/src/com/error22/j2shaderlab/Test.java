package com.error22.j2shaderlab;

import java.io.FileWriter;

import com.error22.j2shaderlab.parser.JParser;
import com.error22.j2shaderlab.unity.ShaderLabWriter;

public class Test {

	public static void main(String[] args) throws Exception {
		JParser parser = new JParser();
		ShaderLabWriter writer = new ShaderLabWriter();
		String out = writer.write(parser.parse("../Examples/src/UnlitColor.java"));
		
		FileWriter fwriter = new FileWriter("compiled.shader");
		fwriter.write(out);
		fwriter.close();
	}

}
