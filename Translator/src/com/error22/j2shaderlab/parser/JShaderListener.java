// Generated from C:\Users\chand\JShader.g4 by ANTLR 4.5.3

    package com.error22.j2shaderlab.parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JShaderParser}.
 */
public interface JShaderListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JShaderParser#baseUnit}.
	 * @param ctx the parse tree
	 */
	void enterBaseUnit(JShaderParser.BaseUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JShaderParser#baseUnit}.
	 * @param ctx the parse tree
	 */
	void exitBaseUnit(JShaderParser.BaseUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JShaderParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(JShaderParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JShaderParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(JShaderParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JShaderParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(JShaderParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JShaderParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(JShaderParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JShaderParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(JShaderParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JShaderParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(JShaderParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JShaderParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void enterSimpleType(JShaderParser.SimpleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JShaderParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void exitSimpleType(JShaderParser.SimpleTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JShaderParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(JShaderParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JShaderParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(JShaderParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JShaderParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(JShaderParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JShaderParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(JShaderParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JShaderParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(JShaderParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JShaderParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(JShaderParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JShaderParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(JShaderParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JShaderParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(JShaderParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JShaderParser#annotationName}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationName(JShaderParser.AnnotationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JShaderParser#annotationName}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationName(JShaderParser.AnnotationNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JShaderParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairs(JShaderParser.ElementValuePairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JShaderParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairs(JShaderParser.ElementValuePairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JShaderParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(JShaderParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link JShaderParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(JShaderParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link JShaderParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(JShaderParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JShaderParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(JShaderParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JShaderParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(JShaderParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JShaderParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(JShaderParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JShaderParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(JShaderParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JShaderParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(JShaderParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JShaderParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(JShaderParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JShaderParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(JShaderParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JShaderParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(JShaderParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JShaderParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(JShaderParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JShaderParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(JShaderParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JShaderParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(JShaderParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JShaderParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(JShaderParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JShaderParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(JShaderParser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JShaderParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(JShaderParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JShaderParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(JShaderParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JShaderParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(JShaderParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JShaderParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(JShaderParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JShaderParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(JShaderParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JShaderParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(JShaderParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JShaderParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(JShaderParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JShaderParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(JShaderParser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JShaderParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(JShaderParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JShaderParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(JShaderParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JShaderParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(JShaderParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link JShaderParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(JShaderParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link JShaderParser#methodReturn}.
	 * @param ctx the parse tree
	 */
	void enterMethodReturn(JShaderParser.MethodReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link JShaderParser#methodReturn}.
	 * @param ctx the parse tree
	 */
	void exitMethodReturn(JShaderParser.MethodReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link JShaderParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(JShaderParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JShaderParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(JShaderParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JShaderParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(JShaderParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JShaderParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(JShaderParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JShaderParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(JShaderParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JShaderParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(JShaderParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JShaderParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(JShaderParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link JShaderParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(JShaderParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link JShaderParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(JShaderParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JShaderParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(JShaderParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JShaderParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(JShaderParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JShaderParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(JShaderParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JShaderParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JShaderParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JShaderParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JShaderParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JShaderParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(JShaderParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JShaderParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(JShaderParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JShaderParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(JShaderParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JShaderParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(JShaderParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JShaderParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(JShaderParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JShaderParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(JShaderParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JShaderParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(JShaderParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JShaderParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(JShaderParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JShaderParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(JShaderParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JShaderParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(JShaderParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JShaderParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(JShaderParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JShaderParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(JShaderParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JShaderParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(JShaderParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JShaderParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(JShaderParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JShaderParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(JShaderParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JShaderParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(JShaderParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JShaderParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(JShaderParser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JShaderParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(JShaderParser.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JShaderParser#localGetExpression}.
	 * @param ctx the parse tree
	 */
	void enterLocalGetExpression(JShaderParser.LocalGetExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JShaderParser#localGetExpression}.
	 * @param ctx the parse tree
	 */
	void exitLocalGetExpression(JShaderParser.LocalGetExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JShaderParser#callExpression}.
	 * @param ctx the parse tree
	 */
	void enterCallExpression(JShaderParser.CallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JShaderParser#callExpression}.
	 * @param ctx the parse tree
	 */
	void exitCallExpression(JShaderParser.CallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JShaderParser#newExpression}.
	 * @param ctx the parse tree
	 */
	void enterNewExpression(JShaderParser.NewExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JShaderParser#newExpression}.
	 * @param ctx the parse tree
	 */
	void exitNewExpression(JShaderParser.NewExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JShaderParser#newName}.
	 * @param ctx the parse tree
	 */
	void enterNewName(JShaderParser.NewNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JShaderParser#newName}.
	 * @param ctx the parse tree
	 */
	void exitNewName(JShaderParser.NewNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JShaderParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(JShaderParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JShaderParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(JShaderParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JShaderParser#classExpression}.
	 * @param ctx the parse tree
	 */
	void enterClassExpression(JShaderParser.ClassExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JShaderParser#classExpression}.
	 * @param ctx the parse tree
	 */
	void exitClassExpression(JShaderParser.ClassExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JShaderParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(JShaderParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JShaderParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(JShaderParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JShaderParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(JShaderParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JShaderParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(JShaderParser.CastExpressionContext ctx);
}