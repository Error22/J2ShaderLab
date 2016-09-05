package com.error22.j2shaderlab.parser;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import com.error22.j2shaderlab.parser.JShaderParser.ArgumentsContext;
import com.error22.j2shaderlab.parser.JShaderParser.CallExpressionContext;
import com.error22.j2shaderlab.parser.JShaderParser.ExpressionListContext;
import com.error22.j2shaderlab.parser.JShaderParser.LiteralContext;
import com.error22.j2shaderlab.parser.JShaderParser.NewExpressionContext;
import com.error22.j2shaderlab.parser.JShaderParser.NewNameContext;
import com.error22.j2shaderlab.parser.JShaderParser.QualifiedNameContext;
import com.error22.j2shaderlab.parser.JShaderParser.SimpleExpressionContext;
import com.error22.j2shaderlab.steps.Arguments;
import com.error22.j2shaderlab.steps.Call;
import com.error22.j2shaderlab.steps.DirectGet;
import com.error22.j2shaderlab.steps.ExpressionList;
import com.error22.j2shaderlab.steps.Instantiate;
import com.error22.j2shaderlab.steps.Literal;
import com.error22.j2shaderlab.steps.QualifiedName;
import com.error22.j2shaderlab.steps.ReferenceGet;
import com.error22.j2shaderlab.steps.Set;
import com.error22.j2shaderlab.steps.Step;
import com.error22.j2shaderlab.steps.Type;

public class ExpressionParser extends JShaderBaseListener {
	private JParser parser;
	private Stack<List<Step>> dataStack;

	public ExpressionParser(JParser parser) {
		this.parser = parser;
		dataStack = new Stack<List<Step>>();
	}

	@Override
	public void enterEveryRule(ParserRuleContext ctx) {
		if (isKnown(ctx)) {
			return;
		}

		System.out.println("enterEveryRule " + ctx.getClass() + " > " + ctx.getText());
	}

	@Override
	public void exitEveryRule(ParserRuleContext ctx) {
		if (isKnown(ctx)) {
			return;
		}

		System.out.println("exitEveryRule " + ctx.getClass() + " > " + ctx.getText());
	}

	@Override
	public void exitQualifiedName(QualifiedNameContext ctx) {
		result(new QualifiedName(ctx.getText()));
	}

	@Override
	public void enterNewName(NewNameContext ctx) {
		wrap();
	}

	@Override
	public void exitNewName(NewNameContext ctx) {
		Object val = unwrap().get(0);
		if (val instanceof QualifiedName) {
			result(new Type(parser.resolveReference(((QualifiedName) val).getName())));
		} else {
			throw new RuntimeException("Unknown value");
		}
	}

	@Override
	public void exitLiteral(LiteralContext ctx) {
		if (ctx.IntegerLiteral() != null) {
			result(new Literal(Integer.parseInt(ctx.IntegerLiteral().getText())));
		} else if (ctx.FloatingPointLiteral() != null) {
			result(new Literal(Float.parseFloat(ctx.FloatingPointLiteral().getText())));
		} else if (ctx.CharacterLiteral() != null) {
			throw new RuntimeException("Character literals are not supported yet!");
		} else if (ctx.StringLiteral() != null) {
			String text = ctx.StringLiteral().getText();
			result(new Literal(text.substring(1, text.length() - 1)));
		} else if (ctx.BooleanLiteral() != null) {
			throw new RuntimeException("Boolean literals are not supported yet?");
		} else {
			throw new RuntimeException("Unknown literal! " + ctx.getText());
		}
	}

	@Override
	public void enterCallExpression(CallExpressionContext ctx) {
		wrap();
	}

	@Override
	public void exitCallExpression(CallExpressionContext ctx) {
		result(new Arguments(((ExpressionList) unwrap().get(0)).getExpressions()));
	}

	@Override
	public void enterSimpleExpression(SimpleExpressionContext ctx) {
		wrap();
	}

	@Override
	public void exitSimpleExpression(SimpleExpressionContext ctx) {
		 printTop();
		System.out.println("Exiting " + ctx.getText());
		List<Step> data = unwrap();
		if (ctx.literal() != null || ctx.newExpression() != null) {
			result(data.get(0));
		} else if (ctx.Identifier() != null) {
			result(new ReferenceGet(data.get(0), ctx.Identifier().toString()));
		} else if (ctx.localGetExpression() != null) {
			result(new DirectGet(parser.resolveReference(ctx.localGetExpression().getText())));
		} else if (ctx.callExpression() != null) {
			result(new Call(data.get(0), (Arguments) data.get(1)));
		} else if(ctx.getTokens(JShaderParser.ASSIGN).size() > 0){
			result(new Set(data.get(0), data.get(1)));
		}else {
			System.out.println("classExpression " + ctx.classExpression());
			System.out.println("Identifier " + ctx.Identifier());
			System.out.println("castExpression " + ctx.castExpression());
			System.out.println("simpleExpression " + ctx.simpleExpression().size());
			System.out.println("= "+ctx.getTokens(JShaderParser.ASSIGN).size());
			
			for(ParseTree pt : ctx.children){
				System.out.println("CHILD "+pt.getText()+" "+pt.getClass());
				if(pt instanceof TerminalNodeImpl){
					System.out.println("     >> "+((TerminalNodeImpl)pt).getSymbol());
				}
			}

			throw new RuntimeException("Unknown?? " + ctx.getText());

		}
	}

	@Override
	public void enterExpressionList(ExpressionListContext ctx) {
		wrap();
	}

	@Override
	public void exitExpressionList(ExpressionListContext ctx) {
		List<Step> wrapped = unwrap();
		List<Step> expressions = new ArrayList<Step>();

		for (Object value : wrapped) {
			expressions.add((Step) value);
		}

		result(new ExpressionList(expressions));
	}

	@Override
	public void enterArguments(ArgumentsContext ctx) {
		wrap();
	}

	@Override
	public void exitArguments(ArgumentsContext ctx) {
		List<Step> data = unwrap();
		if(data.size() > 0){
			result(new Arguments(((ExpressionList) data.get(0)).getExpressions()));
		}else{
			result(new Arguments(new ArrayList<Step>()));
		}
	}

	@Override
	public void enterNewExpression(NewExpressionContext ctx) {
		wrap();
	}

	@Override
	public void exitNewExpression(NewExpressionContext ctx) {
		List<Step> data = unwrap();
		result(new Instantiate((Type) data.get(0), (Arguments) data.get(1)));
	}

	public void wrap() {
		dataStack.push(new ArrayList<Step>());
	}

	private void result(Step obj) {
		dataStack.peek().add(obj);
	}

	public List<Step> unwrap() {
		return dataStack.pop();
	}

	private void printTop() {
		List<Step> data = dataStack.peek();
		int pos = 0;
		for (Object obj : data) {
			System.out.println(pos + ": " + obj);
			pos++;
		}
	}

	public static boolean DEBUG = true;

	public boolean isKnown(ParserRuleContext ctx) {
		if (DEBUG) {
			return false;
		}
		return ctx instanceof QualifiedNameContext || ctx instanceof NewNameContext || ctx instanceof LiteralContext
				|| ctx instanceof SimpleExpressionContext || ctx instanceof ExpressionListContext
				|| ctx instanceof ArgumentsContext || ctx instanceof NewExpressionContext;
	}

}
