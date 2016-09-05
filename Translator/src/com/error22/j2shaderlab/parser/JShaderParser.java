// Generated from C:\Users\chand\JShader.g4 by ANTLR 4.5.3

    package com.error22.j2shaderlab.parser;

import java.util.List;

import org.antlr.v4.runtime.FailedPredicateException;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JShaderParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOLEAN=1, BYTE=2, CASE=3, CHAR=4, CLASS=5, DOUBLE=6, ELSE=7, ENUM=8, 
		FLOAT=9, FOR=10, IF=11, IMPORT=12, INT=13, LONG=14, NEW=15, PACKAGE=16, 
		PRIVATE=17, PROTECTED=18, PUBLIC=19, RETURN=20, SHORT=21, STATIC=22, SWITCH=23, 
		THIS=24, VOID=25, IntegerLiteral=26, FloatingPointLiteral=27, BooleanLiteral=28, 
		CharacterLiteral=29, StringLiteral=30, NullLiteral=31, LPAREN=32, RPAREN=33, 
		LBRACE=34, RBRACE=35, LBRACK=36, RBRACK=37, SEMI=38, COMMA=39, DOT=40, 
		ASSIGN=41, GT=42, LT=43, BANG=44, TILDE=45, QUESTION=46, COLON=47, EQUAL=48, 
		LE=49, GE=50, NOTEQUAL=51, AND=52, OR=53, INC=54, DEC=55, ADD=56, SUB=57, 
		MUL=58, DIV=59, BITAND=60, BITOR=61, CARET=62, MOD=63, ADD_ASSIGN=64, 
		SUB_ASSIGN=65, MUL_ASSIGN=66, DIV_ASSIGN=67, AND_ASSIGN=68, OR_ASSIGN=69, 
		XOR_ASSIGN=70, MOD_ASSIGN=71, LSHIFT_ASSIGN=72, RSHIFT_ASSIGN=73, URSHIFT_ASSIGN=74, 
		Identifier=75, AT=76, ELLIPSIS=77, WS=78, COMMENT=79, LINE_COMMENT=80;
	public static final int
		RULE_baseUnit = 0, RULE_qualifiedName = 1, RULE_primitiveType = 2, RULE_literal = 3, 
		RULE_simpleType = 4, RULE_type = 5, RULE_packageDeclaration = 6, RULE_importDeclaration = 7, 
		RULE_annotation = 8, RULE_annotationName = 9, RULE_elementValuePairs = 10, 
		RULE_elementValuePair = 11, RULE_elementValue = 12, RULE_elementValueArrayInitializer = 13, 
		RULE_modifier = 14, RULE_typeDeclaration = 15, RULE_classDeclaration = 16, 
		RULE_classBody = 17, RULE_memberDeclaration = 18, RULE_methodDeclaration = 19, 
		RULE_fieldDeclaration = 20, RULE_constructorDeclaration = 21, RULE_constructorBody = 22, 
		RULE_enumDeclaration = 23, RULE_enumConstant = 24, RULE_methodReturn = 25, 
		RULE_variableModifier = 26, RULE_formalParameters = 27, RULE_formalParameter = 28, 
		RULE_variableDeclaratorId = 29, RULE_block = 30, RULE_blockStatement = 31, 
		RULE_statement = 32, RULE_returnStatement = 33, RULE_expressionStatement = 34, 
		RULE_emptyStatement = 35, RULE_localVariableDeclaration = 36, RULE_variableDeclarators = 37, 
		RULE_variableDeclarator = 38, RULE_variableInitializer = 39, RULE_arrayInitializer = 40, 
		RULE_simpleExpression = 41, RULE_localGetExpression = 42, RULE_callExpression = 43, 
		RULE_newExpression = 44, RULE_newName = 45, RULE_arguments = 46, RULE_classExpression = 47, 
		RULE_expressionList = 48, RULE_castExpression = 49;
	public static final String[] ruleNames = {
		"baseUnit", "qualifiedName", "primitiveType", "literal", "simpleType", 
		"type", "packageDeclaration", "importDeclaration", "annotation", "annotationName", 
		"elementValuePairs", "elementValuePair", "elementValue", "elementValueArrayInitializer", 
		"modifier", "typeDeclaration", "classDeclaration", "classBody", "memberDeclaration", 
		"methodDeclaration", "fieldDeclaration", "constructorDeclaration", "constructorBody", 
		"enumDeclaration", "enumConstant", "methodReturn", "variableModifier", 
		"formalParameters", "formalParameter", "variableDeclaratorId", "block", 
		"blockStatement", "statement", "returnStatement", "expressionStatement", 
		"emptyStatement", "localVariableDeclaration", "variableDeclarators", "variableDeclarator", 
		"variableInitializer", "arrayInitializer", "simpleExpression", "localGetExpression", 
		"callExpression", "newExpression", "newName", "arguments", "classExpression", 
		"expressionList", "castExpression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'boolean'", "'byte'", "'case'", "'char'", "'class'", "'double'", 
		"'else'", "'enum'", "'float'", "'for'", "'if'", "'import'", "'int'", "'long'", 
		"'new'", "'package'", "'private'", "'protected'", "'public'", "'return'", 
		"'short'", "'static'", "'switch'", "'this'", "'void'", null, null, null, 
		null, null, "'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", 
		"','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'=='", 
		"'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", 
		"'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'+='", "'-='", "'*='", "'/='", 
		"'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", "'>>>='", null, "'@'", 
		"'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BOOLEAN", "BYTE", "CASE", "CHAR", "CLASS", "DOUBLE", "ELSE", "ENUM", 
		"FLOAT", "FOR", "IF", "IMPORT", "INT", "LONG", "NEW", "PACKAGE", "PRIVATE", 
		"PROTECTED", "PUBLIC", "RETURN", "SHORT", "STATIC", "SWITCH", "THIS", 
		"VOID", "IntegerLiteral", "FloatingPointLiteral", "BooleanLiteral", "CharacterLiteral", 
		"StringLiteral", "NullLiteral", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
		"LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG", 
		"TILDE", "QUESTION", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", 
		"OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", 
		"MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", 
		"OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", 
		"URSHIFT_ASSIGN", "Identifier", "AT", "ELLIPSIS", "WS", "COMMENT", "LINE_COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "JShader.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JShaderParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class BaseUnitContext extends ParserRuleContext {
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(JShaderParser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public BaseUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).enterBaseUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).exitBaseUnit(this);
		}
	}

	public final BaseUnitContext baseUnit() throws RecognitionException {
		BaseUnitContext _localctx = new BaseUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_baseUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(100);
				packageDeclaration();
				}
			}

			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(103);
				importDeclaration();
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
			typeDeclaration();
			setState(110);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(JShaderParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JShaderParser.Identifier, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).exitQualifiedName(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(Identifier);
			setState(117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(113);
					match(DOT);
					setState(114);
					match(Identifier);
					}
					} 
				}
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(JShaderParser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(JShaderParser.FloatingPointLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(JShaderParser.CharacterLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(JShaderParser.StringLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(JShaderParser.BooleanLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleTypeContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public SimpleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).enterSimpleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).exitSimpleType(this);
		}
	}

	public final SimpleTypeContext simpleType() throws RecognitionException {
		SimpleTypeContext _localctx = new SimpleTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_simpleType);
		try {
			setState(126);
			switch (_input.LA(1)) {
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				literal();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				qualifiedName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		try {
			setState(130);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				qualifiedName();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageDeclarationContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).exitPackageDeclaration(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_packageDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(PACKAGE);
			setState(133);
			qualifiedName();
			setState(134);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_importDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(IMPORT);
			setState(137);
			qualifiedName();
			setState(138);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public AnnotationNameContext annotationName() {
			return getRuleContext(AnnotationNameContext.class,0);
		}
		public ElementValuePairsContext elementValuePairs() {
			return getRuleContext(ElementValuePairsContext.class,0);
		}
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(AT);
			setState(141);
			annotationName();
			setState(148);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(142);
				match(LPAREN);
				setState(145);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(143);
					elementValuePairs();
					}
					break;
				case 2:
					{
					setState(144);
					elementValue();
					}
					break;
				}
				setState(147);
				match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public AnnotationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).enterAnnotationName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).exitAnnotationName(this);
		}
	}

	public final AnnotationNameContext annotationName() throws RecognitionException {
		AnnotationNameContext _localctx = new AnnotationNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_annotationName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			qualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairsContext extends ParserRuleContext {
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public ElementValuePairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).enterElementValuePairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).exitElementValuePairs(this);
		}
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			elementValuePair();
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(153);
				match(COMMA);
				setState(154);
				elementValuePair();
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JShaderParser.Identifier, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).exitElementValuePair(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(Identifier);
			setState(161);
			match(ASSIGN);
			setState(162);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueContext extends ParserRuleContext {
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).exitElementValue(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_elementValue);
		try {
			setState(167);
			switch (_input.LA(1)) {
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				simpleType();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				annotation();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				elementValueArrayInitializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).exitElementValueArrayInitializer(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(LBRACE);
			setState(178);
			_la = _input.LA(1);
			if (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & ((1L << (IntegerLiteral - 26)) | (1L << (FloatingPointLiteral - 26)) | (1L << (BooleanLiteral - 26)) | (1L << (CharacterLiteral - 26)) | (1L << (StringLiteral - 26)) | (1L << (NullLiteral - 26)) | (1L << (LBRACE - 26)) | (1L << (Identifier - 26)) | (1L << (AT - 26)))) != 0)) {
				{
				setState(170);
				elementValue();
				setState(175);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(171);
						match(COMMA);
						setState(172);
						elementValue();
						}
						} 
					}
					setState(177);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				}
			}

			setState(181);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(180);
				match(COMMA);
				}
			}

			setState(183);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).exitModifier(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_modifier);
		int _la;
		try {
			setState(187);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				annotation();
				}
				break;
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).exitTypeDeclaration(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_typeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (PRIVATE - 17)) | (1L << (PROTECTED - 17)) | (1L << (PUBLIC - 17)) | (1L << (STATIC - 17)) | (1L << (AT - 17)))) != 0)) {
				{
				{
				setState(189);
				modifier();
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(195);
			classDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JShaderParser.Identifier, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_classDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(CLASS);
			setState(198);
			match(Identifier);
			setState(199);
			classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public List<MemberDeclarationContext> memberDeclaration() {
			return getRuleContexts(MemberDeclarationContext.class);
		}
		public MemberDeclarationContext memberDeclaration(int i) {
			return getRuleContext(MemberDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).exitClassBody(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(LBRACE);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << VOID))) != 0) || _la==Identifier || _la==AT) {
				{
				{
				setState(202);
				memberDeclaration();
				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(208);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).enterMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).exitMemberDeclaration(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_memberDeclaration);
		int _la;
		try {
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (PRIVATE - 17)) | (1L << (PROTECTED - 17)) | (1L << (PUBLIC - 17)) | (1L << (STATIC - 17)) | (1L << (AT - 17)))) != 0)) {
					{
					{
					setState(210);
					modifier();
					}
					}
					setState(215);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(216);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (PRIVATE - 17)) | (1L << (PROTECTED - 17)) | (1L << (PUBLIC - 17)) | (1L << (STATIC - 17)) | (1L << (AT - 17)))) != 0)) {
					{
					{
					setState(217);
					modifier();
					}
					}
					setState(222);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(223);
				fieldDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (PRIVATE - 17)) | (1L << (PROTECTED - 17)) | (1L << (PUBLIC - 17)) | (1L << (STATIC - 17)) | (1L << (AT - 17)))) != 0)) {
					{
					{
					setState(224);
					modifier();
					}
					}
					setState(229);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(230);
				constructorDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (PRIVATE - 17)) | (1L << (PROTECTED - 17)) | (1L << (PUBLIC - 17)) | (1L << (STATIC - 17)) | (1L << (AT - 17)))) != 0)) {
					{
					{
					setState(231);
					modifier();
					}
					}
					setState(236);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(237);
				classDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (PRIVATE - 17)) | (1L << (PROTECTED - 17)) | (1L << (PUBLIC - 17)) | (1L << (STATIC - 17)) | (1L << (AT - 17)))) != 0)) {
					{
					{
					setState(238);
					modifier();
					}
					}
					setState(243);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(244);
				enumDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodReturnContext methodReturn() {
			return getRuleContext(MethodReturnContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JShaderParser.Identifier, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_methodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			methodReturn();
			setState(248);
			match(Identifier);
			setState(249);
			formalParameters();
			setState(252);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(250);
				block();
				}
				break;
			case SEMI:
				{
				setState(251);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			type();
			setState(255);
			variableDeclarators();
			setState(256);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JShaderParser.Identifier, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).exitConstructorDeclaration(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_constructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(Identifier);
			setState(259);
			formalParameters();
			setState(260);
			constructorBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).enterConstructorBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).exitConstructorBody(this);
		}
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_constructorBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(JShaderParser.ENUM, 0); }
		public TerminalNode Identifier() { return getToken(JShaderParser.Identifier, 0); }
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).exitEnumDeclaration(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_enumDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(ENUM);
			setState(265);
			match(Identifier);
			setState(266);
			match(LBRACE);
			setState(268);
			_la = _input.LA(1);
			if (_la==Identifier || _la==AT) {
				{
				setState(267);
				enumConstant();
				}
			}

			setState(274);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(270);
					match(COMMA);
					setState(271);
					enumConstant();
					}
					} 
				}
				setState(276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(278);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(277);
				match(COMMA);
				}
			}

			setState(280);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JShaderParser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).exitEnumConstant(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(282);
				annotation();
				}
				}
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(288);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodReturnContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public MethodReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).enterMethodReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).exitMethodReturn(this);
		}
	}

	public final MethodReturnContext methodReturn() throws RecognitionException {
		MethodReturnContext _localctx = new MethodReturnContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_methodReturn);
		try {
			setState(292);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				type();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).exitVariableModifier(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_variableModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			annotation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(LPAREN);
			setState(305);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(297);
				formalParameter();
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(298);
					match(COMMA);
					setState(299);
					formalParameter();
					}
					}
					setState(304);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(307);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).exitFormalParameter(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(309);
				variableModifier();
				}
				}
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(315);
			type();
			setState(316);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JShaderParser.Identifier, 0); }
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).exitVariableDeclaratorId(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(Identifier);
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(319);
				match(LBRACK);
				setState(320);
				match(RBRACK);
				}
				}
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(LBRACE);
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << RETURN) | (1L << SHORT) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << BANG))) != 0) || _la==Identifier || _la==AT) {
				{
				{
				setState(327);
				blockStatement();
				}
				}
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(333);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).exitBlockStatement(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_blockStatement);
		try {
			setState(339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
				localVariableDeclaration();
				setState(336);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(338);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_statement);
		try {
			setState(345);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(342);
				emptyStatement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(343);
				returnStatement();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case Identifier:
				enterOuterAlt(_localctx, 4);
				{
				setState(344);
				expressionStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(RETURN);
			setState(349);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << BANG))) != 0) || _la==Identifier) {
				{
				setState(348);
				simpleExpression(0);
				}
			}

			setState(351);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).exitExpressionStatement(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			simpleExpression(0);
			setState(354);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptyStatementContext extends ParserRuleContext {
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).exitEmptyStatement(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).exitLocalVariableDeclaration(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(358);
				variableModifier();
				}
				}
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(364);
			type();
			setState(365);
			variableDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).exitVariableDeclarators(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			variableDeclarator();
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(368);
				match(COMMA);
				setState(369);
				variableDeclarator();
				}
				}
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).exitVariableDeclarator(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			variableDeclaratorId();
			setState(378);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(376);
				match(ASSIGN);
				setState(377);
				variableInitializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).exitVariableInitializer(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_variableInitializer);
		try {
			setState(382);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(380);
				arrayInitializer();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(381);
				simpleExpression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).exitArrayInitializer(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(LBRACE);
			setState(396);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << BANG))) != 0) || _la==Identifier) {
				{
				setState(385);
				variableInitializer();
				setState(390);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(386);
						match(COMMA);
						setState(387);
						variableInitializer();
						}
						} 
					}
					setState(392);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				}
				setState(394);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(393);
					match(COMMA);
					}
				}

				}
			}

			setState(398);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleExpressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ClassExpressionContext classExpression() {
			return getRuleContext(ClassExpressionContext.class,0);
		}
		public NewExpressionContext newExpression() {
			return getRuleContext(NewExpressionContext.class,0);
		}
		public List<SimpleExpressionContext> simpleExpression() {
			return getRuleContexts(SimpleExpressionContext.class);
		}
		public SimpleExpressionContext simpleExpression(int i) {
			return getRuleContext(SimpleExpressionContext.class,i);
		}
		public LocalGetExpressionContext localGetExpression() {
			return getRuleContext(LocalGetExpressionContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JShaderParser.Identifier, 0); }
		public CallExpressionContext callExpression() {
			return getRuleContext(CallExpressionContext.class,0);
		}
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).enterSimpleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).exitSimpleExpression(this);
		}
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		return simpleExpression(0);
	}

	private SimpleExpressionContext simpleExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, _parentState);
		SimpleExpressionContext _prevctx = _localctx;
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_simpleExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(401);
				literal();
				}
				break;
			case 2:
				{
				setState(402);
				classExpression();
				}
				break;
			case 3:
				{
				setState(403);
				newExpression();
				}
				break;
			case 4:
				{
				setState(404);
				match(LPAREN);
				setState(405);
				simpleExpression(0);
				setState(406);
				match(RPAREN);
				}
				break;
			case 5:
				{
				setState(408);
				localGetExpression();
				}
				break;
			case 6:
				{
				setState(409);
				castExpression();
				}
				break;
			case 7:
				{
				setState(410);
				match(BANG);
				setState(411);
				simpleExpression(15);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(472);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(470);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						_localctx = new SimpleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpression);
						setState(414);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(415);
						match(ADD);
						setState(416);
						simpleExpression(15);
						}
						break;
					case 2:
						{
						_localctx = new SimpleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpression);
						setState(417);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(418);
						match(SUB);
						setState(419);
						simpleExpression(14);
						}
						break;
					case 3:
						{
						_localctx = new SimpleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpression);
						setState(420);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(421);
						match(MUL);
						setState(422);
						simpleExpression(13);
						}
						break;
					case 4:
						{
						_localctx = new SimpleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpression);
						setState(423);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(424);
						match(DIV);
						setState(425);
						simpleExpression(12);
						}
						break;
					case 5:
						{
						_localctx = new SimpleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpression);
						setState(426);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(427);
						match(MOD);
						setState(428);
						simpleExpression(11);
						}
						break;
					case 6:
						{
						_localctx = new SimpleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpression);
						setState(429);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(430);
						match(LT);
						setState(431);
						simpleExpression(10);
						}
						break;
					case 7:
						{
						_localctx = new SimpleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpression);
						setState(432);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(433);
						match(LE);
						setState(434);
						simpleExpression(9);
						}
						break;
					case 8:
						{
						_localctx = new SimpleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpression);
						setState(435);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(436);
						match(GT);
						setState(437);
						simpleExpression(8);
						}
						break;
					case 9:
						{
						_localctx = new SimpleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpression);
						setState(438);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(439);
						match(GE);
						setState(440);
						simpleExpression(7);
						}
						break;
					case 10:
						{
						_localctx = new SimpleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpression);
						setState(441);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(442);
						match(EQUAL);
						setState(443);
						simpleExpression(6);
						}
						break;
					case 11:
						{
						_localctx = new SimpleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpression);
						setState(444);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(445);
						match(NOTEQUAL);
						setState(446);
						simpleExpression(5);
						}
						break;
					case 12:
						{
						_localctx = new SimpleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpression);
						setState(447);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(448);
						match(AND);
						setState(449);
						simpleExpression(4);
						}
						break;
					case 13:
						{
						_localctx = new SimpleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpression);
						setState(450);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(451);
						match(OR);
						setState(452);
						simpleExpression(3);
						}
						break;
					case 14:
						{
						_localctx = new SimpleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpression);
						setState(453);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(454);
						_la = _input.LA(1);
						if ( !(((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (ASSIGN - 41)) | (1L << (ADD_ASSIGN - 41)) | (1L << (SUB_ASSIGN - 41)) | (1L << (MUL_ASSIGN - 41)) | (1L << (DIV_ASSIGN - 41)))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(455);
						simpleExpression(1);
						}
						break;
					case 15:
						{
						_localctx = new SimpleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpression);
						setState(456);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(457);
						match(DOT);
						setState(458);
						match(Identifier);
						}
						break;
					case 16:
						{
						_localctx = new SimpleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpression);
						setState(459);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(460);
						match(LBRACK);
						setState(461);
						simpleExpression(0);
						setState(462);
						match(RBRACK);
						}
						break;
					case 17:
						{
						_localctx = new SimpleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpression);
						setState(464);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(465);
						callExpression();
						}
						break;
					case 18:
						{
						_localctx = new SimpleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpression);
						setState(466);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(467);
						match(INC);
						}
						break;
					case 19:
						{
						_localctx = new SimpleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpression);
						setState(468);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(469);
						match(DEC);
						}
						break;
					}
					} 
				}
				setState(474);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LocalGetExpressionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JShaderParser.Identifier, 0); }
		public LocalGetExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localGetExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).enterLocalGetExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).exitLocalGetExpression(this);
		}
	}

	public final LocalGetExpressionContext localGetExpression() throws RecognitionException {
		LocalGetExpressionContext _localctx = new LocalGetExpressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_localGetExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallExpressionContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public CallExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).enterCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).exitCallExpression(this);
		}
	}

	public final CallExpressionContext callExpression() throws RecognitionException {
		CallExpressionContext _localctx = new CallExpressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_callExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			match(LPAREN);
			setState(479);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << BANG))) != 0) || _la==Identifier) {
				{
				setState(478);
				expressionList();
				}
			}

			setState(481);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewExpressionContext extends ParserRuleContext {
		public NewNameContext newName() {
			return getRuleContext(NewNameContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public NewExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).enterNewExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).exitNewExpression(this);
		}
	}

	public final NewExpressionContext newExpression() throws RecognitionException {
		NewExpressionContext _localctx = new NewExpressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_newExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			match(NEW);
			setState(484);
			newName();
			setState(485);
			arguments();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public NewNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).enterNewName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).exitNewName(this);
		}
	}

	public final NewNameContext newName() throws RecognitionException {
		NewNameContext _localctx = new NewNameContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_newName);
		try {
			setState(489);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(487);
				qualifiedName();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(488);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			match(LPAREN);
			setState(493);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << BANG))) != 0) || _la==Identifier) {
				{
				setState(492);
				expressionList();
				}
			}

			setState(495);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassExpressionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ClassExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).enterClassExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).exitClassExpression(this);
		}
	}

	public final ClassExpressionContext classExpression() throws RecognitionException {
		ClassExpressionContext _localctx = new ClassExpressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_classExpression);
		try {
			setState(504);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(497);
				type();
				setState(498);
				match(DOT);
				setState(499);
				match(CLASS);
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(501);
				match(VOID);
				setState(502);
				match(DOT);
				setState(503);
				match(CLASS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<SimpleExpressionContext> simpleExpression() {
			return getRuleContexts(SimpleExpressionContext.class);
		}
		public SimpleExpressionContext simpleExpression(int i) {
			return getRuleContext(SimpleExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			simpleExpression(0);
			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(507);
				match(COMMA);
				setState(508);
				simpleExpression(0);
				}
				}
				setState(513);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastExpressionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JShaderListener ) ((JShaderListener)listener).exitCastExpression(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_castExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			match(LPAREN);
			setState(515);
			type();
			setState(516);
			match(RPAREN);
			setState(517);
			simpleExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 41:
			return simpleExpression_sempred((SimpleExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean simpleExpression_sempred(SimpleExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 7);
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		case 13:
			return precpred(_ctx, 1);
		case 14:
			return precpred(_ctx, 23);
		case 15:
			return precpred(_ctx, 20);
		case 16:
			return precpred(_ctx, 19);
		case 17:
			return precpred(_ctx, 17);
		case 18:
			return precpred(_ctx, 16);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3R\u020a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2\5\2"+
		"h\n\2\3\2\7\2k\n\2\f\2\16\2n\13\2\3\2\3\2\3\2\3\3\3\3\3\3\7\3v\n\3\f\3"+
		"\16\3y\13\3\3\4\3\4\3\5\3\5\3\6\3\6\5\6\u0081\n\6\3\7\3\7\5\7\u0085\n"+
		"\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n\u0094\n\n\3"+
		"\n\5\n\u0097\n\n\3\13\3\13\3\f\3\f\3\f\7\f\u009e\n\f\f\f\16\f\u00a1\13"+
		"\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\5\16\u00aa\n\16\3\17\3\17\3\17\3\17"+
		"\7\17\u00b0\n\17\f\17\16\17\u00b3\13\17\5\17\u00b5\n\17\3\17\5\17\u00b8"+
		"\n\17\3\17\3\17\3\20\3\20\5\20\u00be\n\20\3\21\7\21\u00c1\n\21\f\21\16"+
		"\21\u00c4\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\7\23\u00ce\n\23"+
		"\f\23\16\23\u00d1\13\23\3\23\3\23\3\24\7\24\u00d6\n\24\f\24\16\24\u00d9"+
		"\13\24\3\24\3\24\7\24\u00dd\n\24\f\24\16\24\u00e0\13\24\3\24\3\24\7\24"+
		"\u00e4\n\24\f\24\16\24\u00e7\13\24\3\24\3\24\7\24\u00eb\n\24\f\24\16\24"+
		"\u00ee\13\24\3\24\3\24\7\24\u00f2\n\24\f\24\16\24\u00f5\13\24\3\24\5\24"+
		"\u00f8\n\24\3\25\3\25\3\25\3\25\3\25\5\25\u00ff\n\25\3\26\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\5\31\u010f\n\31"+
		"\3\31\3\31\7\31\u0113\n\31\f\31\16\31\u0116\13\31\3\31\5\31\u0119\n\31"+
		"\3\31\3\31\3\32\7\32\u011e\n\32\f\32\16\32\u0121\13\32\3\32\3\32\3\33"+
		"\3\33\5\33\u0127\n\33\3\34\3\34\3\35\3\35\3\35\3\35\7\35\u012f\n\35\f"+
		"\35\16\35\u0132\13\35\5\35\u0134\n\35\3\35\3\35\3\36\7\36\u0139\n\36\f"+
		"\36\16\36\u013c\13\36\3\36\3\36\3\36\3\37\3\37\3\37\7\37\u0144\n\37\f"+
		"\37\16\37\u0147\13\37\3 \3 \7 \u014b\n \f \16 \u014e\13 \3 \3 \3!\3!\3"+
		"!\3!\5!\u0156\n!\3\"\3\"\3\"\3\"\5\"\u015c\n\"\3#\3#\5#\u0160\n#\3#\3"+
		"#\3$\3$\3$\3%\3%\3&\7&\u016a\n&\f&\16&\u016d\13&\3&\3&\3&\3\'\3\'\3\'"+
		"\7\'\u0175\n\'\f\'\16\'\u0178\13\'\3(\3(\3(\5(\u017d\n(\3)\3)\5)\u0181"+
		"\n)\3*\3*\3*\3*\7*\u0187\n*\f*\16*\u018a\13*\3*\5*\u018d\n*\5*\u018f\n"+
		"*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u019f\n+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\7+\u01d9\n+\f+\16+\u01dc\13+\3,\3,\3-\3-\5-\u01e2\n-"+
		"\3-\3-\3.\3.\3.\3.\3/\3/\5/\u01ec\n/\3\60\3\60\5\60\u01f0\n\60\3\60\3"+
		"\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u01fb\n\61\3\62\3\62\3\62"+
		"\7\62\u0200\n\62\f\62\16\62\u0203\13\62\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\2\3T\64\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668"+
		":<>@BDFHJLNPRTVXZ\\^`bd\2\6\b\2\3\4\6\6\b\b\13\13\17\20\27\27\3\2\34!"+
		"\4\2\23\25\30\30\4\2++BE\u0226\2g\3\2\2\2\4r\3\2\2\2\6z\3\2\2\2\b|\3\2"+
		"\2\2\n\u0080\3\2\2\2\f\u0084\3\2\2\2\16\u0086\3\2\2\2\20\u008a\3\2\2\2"+
		"\22\u008e\3\2\2\2\24\u0098\3\2\2\2\26\u009a\3\2\2\2\30\u00a2\3\2\2\2\32"+
		"\u00a9\3\2\2\2\34\u00ab\3\2\2\2\36\u00bd\3\2\2\2 \u00c2\3\2\2\2\"\u00c7"+
		"\3\2\2\2$\u00cb\3\2\2\2&\u00f7\3\2\2\2(\u00f9\3\2\2\2*\u0100\3\2\2\2,"+
		"\u0104\3\2\2\2.\u0108\3\2\2\2\60\u010a\3\2\2\2\62\u011f\3\2\2\2\64\u0126"+
		"\3\2\2\2\66\u0128\3\2\2\28\u012a\3\2\2\2:\u013a\3\2\2\2<\u0140\3\2\2\2"+
		">\u0148\3\2\2\2@\u0155\3\2\2\2B\u015b\3\2\2\2D\u015d\3\2\2\2F\u0163\3"+
		"\2\2\2H\u0166\3\2\2\2J\u016b\3\2\2\2L\u0171\3\2\2\2N\u0179\3\2\2\2P\u0180"+
		"\3\2\2\2R\u0182\3\2\2\2T\u019e\3\2\2\2V\u01dd\3\2\2\2X\u01df\3\2\2\2Z"+
		"\u01e5\3\2\2\2\\\u01eb\3\2\2\2^\u01ed\3\2\2\2`\u01fa\3\2\2\2b\u01fc\3"+
		"\2\2\2d\u0204\3\2\2\2fh\5\16\b\2gf\3\2\2\2gh\3\2\2\2hl\3\2\2\2ik\5\20"+
		"\t\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nl\3\2\2\2op\5 "+
		"\21\2pq\7\2\2\3q\3\3\2\2\2rw\7M\2\2st\7*\2\2tv\7M\2\2us\3\2\2\2vy\3\2"+
		"\2\2wu\3\2\2\2wx\3\2\2\2x\5\3\2\2\2yw\3\2\2\2z{\t\2\2\2{\7\3\2\2\2|}\t"+
		"\3\2\2}\t\3\2\2\2~\u0081\5\b\5\2\177\u0081\5\4\3\2\u0080~\3\2\2\2\u0080"+
		"\177\3\2\2\2\u0081\13\3\2\2\2\u0082\u0085\5\4\3\2\u0083\u0085\5\6\4\2"+
		"\u0084\u0082\3\2\2\2\u0084\u0083\3\2\2\2\u0085\r\3\2\2\2\u0086\u0087\7"+
		"\22\2\2\u0087\u0088\5\4\3\2\u0088\u0089\7(\2\2\u0089\17\3\2\2\2\u008a"+
		"\u008b\7\16\2\2\u008b\u008c\5\4\3\2\u008c\u008d\7(\2\2\u008d\21\3\2\2"+
		"\2\u008e\u008f\7N\2\2\u008f\u0096\5\24\13\2\u0090\u0093\7\"\2\2\u0091"+
		"\u0094\5\26\f\2\u0092\u0094\5\32\16\2\u0093\u0091\3\2\2\2\u0093\u0092"+
		"\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\7#\2\2\u0096"+
		"\u0090\3\2\2\2\u0096\u0097\3\2\2\2\u0097\23\3\2\2\2\u0098\u0099\5\4\3"+
		"\2\u0099\25\3\2\2\2\u009a\u009f\5\30\r\2\u009b\u009c\7)\2\2\u009c\u009e"+
		"\5\30\r\2\u009d\u009b\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2"+
		"\u009f\u00a0\3\2\2\2\u00a0\27\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3"+
		"\7M\2\2\u00a3\u00a4\7+\2\2\u00a4\u00a5\5\32\16\2\u00a5\31\3\2\2\2\u00a6"+
		"\u00aa\5\n\6\2\u00a7\u00aa\5\22\n\2\u00a8\u00aa\5\34\17\2\u00a9\u00a6"+
		"\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\33\3\2\2\2\u00ab"+
		"\u00b4\7$\2\2\u00ac\u00b1\5\32\16\2\u00ad\u00ae\7)\2\2\u00ae\u00b0\5\32"+
		"\16\2\u00af\u00ad\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00ac\3\2"+
		"\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b8\7)\2\2\u00b7"+
		"\u00b6\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\7%"+
		"\2\2\u00ba\35\3\2\2\2\u00bb\u00be\5\22\n\2\u00bc\u00be\t\4\2\2\u00bd\u00bb"+
		"\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be\37\3\2\2\2\u00bf\u00c1\5\36\20\2\u00c0"+
		"\u00bf\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2"+
		"\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6\5\"\22\2\u00c6"+
		"!\3\2\2\2\u00c7\u00c8\7\7\2\2\u00c8\u00c9\7M\2\2\u00c9\u00ca\5$\23\2\u00ca"+
		"#\3\2\2\2\u00cb\u00cf\7$\2\2\u00cc\u00ce\5&\24\2\u00cd\u00cc\3\2\2\2\u00ce"+
		"\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\3\2"+
		"\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\7%\2\2\u00d3%\3\2\2\2\u00d4\u00d6"+
		"\5\36\20\2\u00d5\u00d4\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2"+
		"\u00d7\u00d8\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00f8"+
		"\5(\25\2\u00db\u00dd\5\36\20\2\u00dc\u00db\3\2\2\2\u00dd\u00e0\3\2\2\2"+
		"\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00de"+
		"\3\2\2\2\u00e1\u00f8\5*\26\2\u00e2\u00e4\5\36\20\2\u00e3\u00e2\3\2\2\2"+
		"\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8"+
		"\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00f8\5,\27\2\u00e9\u00eb\5\36\20\2"+
		"\u00ea\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed"+
		"\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f8\5\"\22\2"+
		"\u00f0\u00f2\5\36\20\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1"+
		"\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6"+
		"\u00f8\5\60\31\2\u00f7\u00d7\3\2\2\2\u00f7\u00de\3\2\2\2\u00f7\u00e5\3"+
		"\2\2\2\u00f7\u00ec\3\2\2\2\u00f7\u00f3\3\2\2\2\u00f8\'\3\2\2\2\u00f9\u00fa"+
		"\5\64\33\2\u00fa\u00fb\7M\2\2\u00fb\u00fe\58\35\2\u00fc\u00ff\5> \2\u00fd"+
		"\u00ff\7(\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff)\3\2\2\2\u0100"+
		"\u0101\5\f\7\2\u0101\u0102\5L\'\2\u0102\u0103\7(\2\2\u0103+\3\2\2\2\u0104"+
		"\u0105\7M\2\2\u0105\u0106\58\35\2\u0106\u0107\5.\30\2\u0107-\3\2\2\2\u0108"+
		"\u0109\5> \2\u0109/\3\2\2\2\u010a\u010b\7\n\2\2\u010b\u010c\7M\2\2\u010c"+
		"\u010e\7$\2\2\u010d\u010f\5\62\32\2\u010e\u010d\3\2\2\2\u010e\u010f\3"+
		"\2\2\2\u010f\u0114\3\2\2\2\u0110\u0111\7)\2\2\u0111\u0113\5\62\32\2\u0112"+
		"\u0110\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2"+
		"\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u0119\7)\2\2\u0118"+
		"\u0117\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\7%"+
		"\2\2\u011b\61\3\2\2\2\u011c\u011e\5\22\n\2\u011d\u011c\3\2\2\2\u011e\u0121"+
		"\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0122\3\2\2\2\u0121"+
		"\u011f\3\2\2\2\u0122\u0123\7M\2\2\u0123\63\3\2\2\2\u0124\u0127\5\f\7\2"+
		"\u0125\u0127\7\33\2\2\u0126\u0124\3\2\2\2\u0126\u0125\3\2\2\2\u0127\65"+
		"\3\2\2\2\u0128\u0129\5\22\n\2\u0129\67\3\2\2\2\u012a\u0133\7\"\2\2\u012b"+
		"\u0130\5:\36\2\u012c\u012d\7)\2\2\u012d\u012f\5:\36\2\u012e\u012c\3\2"+
		"\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131"+
		"\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u012b\3\2\2\2\u0133\u0134\3\2"+
		"\2\2\u0134\u0135\3\2\2\2\u0135\u0136\7#\2\2\u01369\3\2\2\2\u0137\u0139"+
		"\5\66\34\2\u0138\u0137\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2\2\2"+
		"\u013a\u013b\3\2\2\2\u013b\u013d\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u013e"+
		"\5\f\7\2\u013e\u013f\5<\37\2\u013f;\3\2\2\2\u0140\u0145\7M\2\2\u0141\u0142"+
		"\7&\2\2\u0142\u0144\7\'\2\2\u0143\u0141\3\2\2\2\u0144\u0147\3\2\2\2\u0145"+
		"\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146=\3\2\2\2\u0147\u0145\3\2\2\2"+
		"\u0148\u014c\7$\2\2\u0149\u014b\5@!\2\u014a\u0149\3\2\2\2\u014b\u014e"+
		"\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014f\3\2\2\2\u014e"+
		"\u014c\3\2\2\2\u014f\u0150\7%\2\2\u0150?\3\2\2\2\u0151\u0152\5J&\2\u0152"+
		"\u0153\7(\2\2\u0153\u0156\3\2\2\2\u0154\u0156\5B\"\2\u0155\u0151\3\2\2"+
		"\2\u0155\u0154\3\2\2\2\u0156A\3\2\2\2\u0157\u015c\5> \2\u0158\u015c\5"+
		"H%\2\u0159\u015c\5D#\2\u015a\u015c\5F$\2\u015b\u0157\3\2\2\2\u015b\u0158"+
		"\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015a\3\2\2\2\u015cC\3\2\2\2\u015d"+
		"\u015f\7\26\2\2\u015e\u0160\5T+\2\u015f\u015e\3\2\2\2\u015f\u0160\3\2"+
		"\2\2\u0160\u0161\3\2\2\2\u0161\u0162\7(\2\2\u0162E\3\2\2\2\u0163\u0164"+
		"\5T+\2\u0164\u0165\7(\2\2\u0165G\3\2\2\2\u0166\u0167\7(\2\2\u0167I\3\2"+
		"\2\2\u0168\u016a\5\66\34\2\u0169\u0168\3\2\2\2\u016a\u016d\3\2\2\2\u016b"+
		"\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016e\3\2\2\2\u016d\u016b\3\2"+
		"\2\2\u016e\u016f\5\f\7\2\u016f\u0170\5L\'\2\u0170K\3\2\2\2\u0171\u0176"+
		"\5N(\2\u0172\u0173\7)\2\2\u0173\u0175\5N(\2\u0174\u0172\3\2\2\2\u0175"+
		"\u0178\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177M\3\2\2\2"+
		"\u0178\u0176\3\2\2\2\u0179\u017c\5<\37\2\u017a\u017b\7+\2\2\u017b\u017d"+
		"\5P)\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017dO\3\2\2\2\u017e\u0181"+
		"\5R*\2\u017f\u0181\5T+\2\u0180\u017e\3\2\2\2\u0180\u017f\3\2\2\2\u0181"+
		"Q\3\2\2\2\u0182\u018e\7$\2\2\u0183\u0188\5P)\2\u0184\u0185\7)\2\2\u0185"+
		"\u0187\5P)\2\u0186\u0184\3\2\2\2\u0187\u018a\3\2\2\2\u0188\u0186\3\2\2"+
		"\2\u0188\u0189\3\2\2\2\u0189\u018c\3\2\2\2\u018a\u0188\3\2\2\2\u018b\u018d"+
		"\7)\2\2\u018c\u018b\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018f\3\2\2\2\u018e"+
		"\u0183\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0191\7%"+
		"\2\2\u0191S\3\2\2\2\u0192\u0193\b+\1\2\u0193\u019f\5\b\5\2\u0194\u019f"+
		"\5`\61\2\u0195\u019f\5Z.\2\u0196\u0197\7\"\2\2\u0197\u0198\5T+\2\u0198"+
		"\u0199\7#\2\2\u0199\u019f\3\2\2\2\u019a\u019f\5V,\2\u019b\u019f\5d\63"+
		"\2\u019c\u019d\7.\2\2\u019d\u019f\5T+\21\u019e\u0192\3\2\2\2\u019e\u0194"+
		"\3\2\2\2\u019e\u0195\3\2\2\2\u019e\u0196\3\2\2\2\u019e\u019a\3\2\2\2\u019e"+
		"\u019b\3\2\2\2\u019e\u019c\3\2\2\2\u019f\u01da\3\2\2\2\u01a0\u01a1\f\20"+
		"\2\2\u01a1\u01a2\7:\2\2\u01a2\u01d9\5T+\21\u01a3\u01a4\f\17\2\2\u01a4"+
		"\u01a5\7;\2\2\u01a5\u01d9\5T+\20\u01a6\u01a7\f\16\2\2\u01a7\u01a8\7<\2"+
		"\2\u01a8\u01d9\5T+\17\u01a9\u01aa\f\r\2\2\u01aa\u01ab\7=\2\2\u01ab\u01d9"+
		"\5T+\16\u01ac\u01ad\f\f\2\2\u01ad\u01ae\7A\2\2\u01ae\u01d9\5T+\r\u01af"+
		"\u01b0\f\13\2\2\u01b0\u01b1\7-\2\2\u01b1\u01d9\5T+\f\u01b2\u01b3\f\n\2"+
		"\2\u01b3\u01b4\7\63\2\2\u01b4\u01d9\5T+\13\u01b5\u01b6\f\t\2\2\u01b6\u01b7"+
		"\7,\2\2\u01b7\u01d9\5T+\n\u01b8\u01b9\f\b\2\2\u01b9\u01ba\7\64\2\2\u01ba"+
		"\u01d9\5T+\t\u01bb\u01bc\f\7\2\2\u01bc\u01bd\7\62\2\2\u01bd\u01d9\5T+"+
		"\b\u01be\u01bf\f\6\2\2\u01bf\u01c0\7\65\2\2\u01c0\u01d9\5T+\7\u01c1\u01c2"+
		"\f\5\2\2\u01c2\u01c3\7\66\2\2\u01c3\u01d9\5T+\6\u01c4\u01c5\f\4\2\2\u01c5"+
		"\u01c6\7\67\2\2\u01c6\u01d9\5T+\5\u01c7\u01c8\f\3\2\2\u01c8\u01c9\t\5"+
		"\2\2\u01c9\u01d9\5T+\3\u01ca\u01cb\f\31\2\2\u01cb\u01cc\7*\2\2\u01cc\u01d9"+
		"\7M\2\2\u01cd\u01ce\f\26\2\2\u01ce\u01cf\7&\2\2\u01cf\u01d0\5T+\2\u01d0"+
		"\u01d1\7\'\2\2\u01d1\u01d9\3\2\2\2\u01d2\u01d3\f\25\2\2\u01d3\u01d9\5"+
		"X-\2\u01d4\u01d5\f\23\2\2\u01d5\u01d9\78\2\2\u01d6\u01d7\f\22\2\2\u01d7"+
		"\u01d9\79\2\2\u01d8\u01a0\3\2\2\2\u01d8\u01a3\3\2\2\2\u01d8\u01a6\3\2"+
		"\2\2\u01d8\u01a9\3\2\2\2\u01d8\u01ac\3\2\2\2\u01d8\u01af\3\2\2\2\u01d8"+
		"\u01b2\3\2\2\2\u01d8\u01b5\3\2\2\2\u01d8\u01b8\3\2\2\2\u01d8\u01bb\3\2"+
		"\2\2\u01d8\u01be\3\2\2\2\u01d8\u01c1\3\2\2\2\u01d8\u01c4\3\2\2\2\u01d8"+
		"\u01c7\3\2\2\2\u01d8\u01ca\3\2\2\2\u01d8\u01cd\3\2\2\2\u01d8\u01d2\3\2"+
		"\2\2\u01d8\u01d4\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d9\u01dc\3\2\2\2\u01da"+
		"\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01dbU\3\2\2\2\u01dc\u01da\3\2\2\2"+
		"\u01dd\u01de\7M\2\2\u01deW\3\2\2\2\u01df\u01e1\7\"\2\2\u01e0\u01e2\5b"+
		"\62\2\u01e1\u01e0\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3"+
		"\u01e4\7#\2\2\u01e4Y\3\2\2\2\u01e5\u01e6\7\21\2\2\u01e6\u01e7\5\\/\2\u01e7"+
		"\u01e8\5^\60\2\u01e8[\3\2\2\2\u01e9\u01ec\5\4\3\2\u01ea\u01ec\5\6\4\2"+
		"\u01eb\u01e9\3\2\2\2\u01eb\u01ea\3\2\2\2\u01ec]\3\2\2\2\u01ed\u01ef\7"+
		"\"\2\2\u01ee\u01f0\5b\62\2\u01ef\u01ee\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0"+
		"\u01f1\3\2\2\2\u01f1\u01f2\7#\2\2\u01f2_\3\2\2\2\u01f3\u01f4\5\f\7\2\u01f4"+
		"\u01f5\7*\2\2\u01f5\u01f6\7\7\2\2\u01f6\u01fb\3\2\2\2\u01f7\u01f8\7\33"+
		"\2\2\u01f8\u01f9\7*\2\2\u01f9\u01fb\7\7\2\2\u01fa\u01f3\3\2\2\2\u01fa"+
		"\u01f7\3\2\2\2\u01fba\3\2\2\2\u01fc\u0201\5T+\2\u01fd\u01fe\7)\2\2\u01fe"+
		"\u0200\5T+\2\u01ff\u01fd\3\2\2\2\u0200\u0203\3\2\2\2\u0201\u01ff\3\2\2"+
		"\2\u0201\u0202\3\2\2\2\u0202c\3\2\2\2\u0203\u0201\3\2\2\2\u0204\u0205"+
		"\7\"\2\2\u0205\u0206\5\f\7\2\u0206\u0207\7#\2\2\u0207\u0208\5T+\2\u0208"+
		"e\3\2\2\2\64glw\u0080\u0084\u0093\u0096\u009f\u00a9\u00b1\u00b4\u00b7"+
		"\u00bd\u00c2\u00cf\u00d7\u00de\u00e5\u00ec\u00f3\u00f7\u00fe\u010e\u0114"+
		"\u0118\u011f\u0126\u0130\u0133\u013a\u0145\u014c\u0155\u015b\u015f\u016b"+
		"\u0176\u017c\u0180\u0188\u018c\u018e\u019e\u01d8\u01da\u01e1\u01eb\u01ef"+
		"\u01fa\u0201";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}