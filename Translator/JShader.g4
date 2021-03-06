/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar JShader;

@header {
    package com.error22.java2shaderlab.parser;
}

baseUnit
    : packageDeclaration? importDeclaration* typeDeclaration EOF
    ;

qualifiedName
    :   Identifier ('.' Identifier)*
    ;

primitiveType
    :   'boolean'
    |   'char'
    |   'byte'
    |   'short'
    |   'int'
    |   'long'
    |   'float'
    |   'double'
    ;

literal
    :   IntegerLiteral
    |   FloatingPointLiteral
    |   CharacterLiteral
    |   StringLiteral
    |   BooleanLiteral
    |   'null'
    ;

simpleType
    : literal
    | qualifiedName
    ;

type
    : qualifiedName
    | primitiveType
    ;

packageDeclaration
    : 'package' qualifiedName ';'
    ;

importDeclaration
    :   'import' qualifiedName ';'
    ;

annotation
    :   '@' annotationName ( '(' ( elementValuePairs | elementValue )? ')' )?
    ;

annotationName
    : qualifiedName
    ;

elementValuePairs
    : elementValuePair (',' elementValuePair)*
    ;

elementValuePair
    : Identifier '=' elementValue
    ;

elementValue
    : simpleType
    | annotation
    | elementValueArrayInitializer
    ;

elementValueArrayInitializer
    : '{' (elementValue (',' elementValue)*)? (',')? '}'
    ;

modifier
    : annotation
    | ( 'public'
      | 'protected'
      | 'private'
      | 'static')
    ;

typeDeclaration
    : modifier* classDeclaration
    ;

classDeclaration
    :   'class' Identifier classBody
    ;

classBody
    :   '{' memberDeclaration* '}'
    ;

memberDeclaration
    :   modifier* methodDeclaration
    |   modifier* fieldDeclaration
    |   modifier* constructorDeclaration
    |   modifier* classDeclaration
    |   modifier* enumDeclaration
    ;

methodDeclaration
    : methodReturn Identifier formalParameters ( block | ';' )
    ;

fieldDeclaration
    :   type variableDeclarators ';'
    ;

constructorDeclaration
    :   Identifier formalParameters constructorBody
    ;

constructorBody
    :   block
    ;

enumDeclaration
    :   ENUM Identifier '{' enumConstant? (',' enumConstant)* ','?  '}'
    ;

enumConstant
    :   annotation* Identifier
    ;


methodReturn
    : type 
    | 'void'
    ;

variableModifier
    : annotation
    ;

formalParameters
    : '(' (formalParameter (',' formalParameter)*)? ')'
    ;

formalParameter
    : variableModifier* type variableDeclaratorId
    ;

variableDeclaratorId
    : Identifier ('[' ']')*
    ;

block
    : '{' blockStatement* '}'
    ;

blockStatement
    : localVariableDeclaration ';'
    | statement
    ;

statement
    : block
    | emptyStatement
    | returnStatement
    | expressionStatement
    ;

returnStatement
    : 'return' simpleExpression? ';'
    ;
    

expressionStatement
    : simpleExpression ';'
    ;

emptyStatement
    : ';'
    ;

localVariableDeclaration
    : variableModifier* type variableDeclarators
    ;

variableDeclarators
    : variableDeclarator (',' variableDeclarator)*
    ;

variableDeclarator
    : variableDeclaratorId ('=' variableInitializer)?
    ;

variableInitializer
    : arrayInitializer
    | simpleExpression
    ;

arrayInitializer
    : '{' (variableInitializer (',' variableInitializer)* (',')? )? '}'
    ;

simpleExpression
    : literal
    | classExpression
    | newExpression
    | simpleExpression '.' Identifier
    | '(' simpleExpression ')'
    | localGetExpression
    | simpleExpression '[' simpleExpression ']'
    | simpleExpression callExpression  
    | castExpression
    | simpleExpression '++'
    | simpleExpression '--'
    | '!' simpleExpression
    | simpleExpression '+' simpleExpression
    | simpleExpression '-' simpleExpression
    | simpleExpression '*' simpleExpression
    | simpleExpression '/' simpleExpression
    | simpleExpression '%' simpleExpression
    | simpleExpression '<' simpleExpression
    | simpleExpression '<=' simpleExpression
    | simpleExpression '>' simpleExpression
    | simpleExpression '>=' simpleExpression
    | simpleExpression '==' simpleExpression
    | simpleExpression '!=' simpleExpression
    | simpleExpression '&&' simpleExpression
    | simpleExpression '||' simpleExpression
    | <assoc=right> simpleExpression
      (   '='
      |   '+='
      |   '-='
      |   '*='
      |   '/='
      )
      simpleExpression
    ;

localGetExpression
    : Identifier
    ;
      
callExpression
    : '(' expressionList? ')'
    ;
      
newExpression
    : 'new' newName arguments
    ;

newName
    : qualifiedName
    | primitiveType
    ;

arguments
    :   '(' expressionList? ')'
    ;

classExpression
    : type '.' 'class'
    | 'void' '.' 'class'
    ;

expressionList
    : simpleExpression (',' simpleExpression)*
    ;

castExpression
    : '(' type ')' simpleExpression
    ;


// LEXER

// �3.9 Keywords

BOOLEAN       : 'boolean';
BYTE          : 'byte';
CASE          : 'case';
CHAR          : 'char';
CLASS         : 'class';
DOUBLE        : 'double';
ELSE          : 'else';
ENUM          : 'enum';
FLOAT         : 'float';
FOR           : 'for';
IF            : 'if';
IMPORT        : 'import';
INT           : 'int';
LONG          : 'long';
NEW           : 'new';
PACKAGE       : 'package';
PRIVATE       : 'private';
PROTECTED     : 'protected';
PUBLIC        : 'public';
RETURN        : 'return';
SHORT         : 'short';
STATIC        : 'static';
SWITCH        : 'switch';
THIS          : 'this';
VOID          : 'void';

// �3.10.1 Integer Literals

IntegerLiteral
    :   DecimalIntegerLiteral
    |   HexIntegerLiteral
    |   OctalIntegerLiteral
    |   BinaryIntegerLiteral
    ;

fragment
DecimalIntegerLiteral
    :   DecimalNumeral IntegerTypeSuffix?
    ;

fragment
HexIntegerLiteral
    :   HexNumeral IntegerTypeSuffix?
    ;

fragment
OctalIntegerLiteral
    :   OctalNumeral IntegerTypeSuffix?
    ;

fragment
BinaryIntegerLiteral
    :   BinaryNumeral IntegerTypeSuffix?
    ;

fragment
IntegerTypeSuffix
    :   [lL]
    ;

fragment
DecimalNumeral
    :   '0'
    |   NonZeroDigit (Digits? | Underscores Digits)
    ;

fragment
Digits
    :   Digit (DigitOrUnderscore* Digit)?
    ;

fragment
Digit
    :   '0'
    |   NonZeroDigit
    ;

fragment
NonZeroDigit
    :   [1-9]
    ;

fragment
DigitOrUnderscore
    :   Digit
    |   '_'
    ;

fragment
Underscores
    :   '_'+
    ;

fragment
HexNumeral
    :   '0' [xX] HexDigits
    ;

fragment
HexDigits
    :   HexDigit (HexDigitOrUnderscore* HexDigit)?
    ;

fragment
HexDigit
    :   [0-9a-fA-F]
    ;

fragment
HexDigitOrUnderscore
    :   HexDigit
    |   '_'
    ;

fragment
OctalNumeral
    :   '0' Underscores? OctalDigits
    ;

fragment
OctalDigits
    :   OctalDigit (OctalDigitOrUnderscore* OctalDigit)?
    ;

fragment
OctalDigit
    :   [0-7]
    ;

fragment
OctalDigitOrUnderscore
    :   OctalDigit
    |   '_'
    ;

fragment
BinaryNumeral
    :   '0' [bB] BinaryDigits
    ;

fragment
BinaryDigits
    :   BinaryDigit (BinaryDigitOrUnderscore* BinaryDigit)?
    ;

fragment
BinaryDigit
    :   [01]
    ;

fragment
BinaryDigitOrUnderscore
    :   BinaryDigit
    |   '_'
    ;

// �3.10.2 Floating-Point Literals

FloatingPointLiteral
    :   DecimalFloatingPointLiteral
    |   HexadecimalFloatingPointLiteral
    ;

fragment
DecimalFloatingPointLiteral
    :   Digits '.' Digits? ExponentPart? FloatTypeSuffix?
    |   '.' Digits ExponentPart? FloatTypeSuffix?
    |   Digits ExponentPart FloatTypeSuffix?
    |   Digits FloatTypeSuffix
    ;

fragment
ExponentPart
    :   ExponentIndicator SignedInteger
    ;

fragment
ExponentIndicator
    :   [eE]
    ;

fragment
SignedInteger
    :   Sign? Digits
    ;

fragment
Sign
    :   [+-]
    ;

fragment
FloatTypeSuffix
    :   [fFdD]
    ;

fragment
HexadecimalFloatingPointLiteral
    :   HexSignificand BinaryExponent FloatTypeSuffix?
    ;

fragment
HexSignificand
    :   HexNumeral '.'?
    |   '0' [xX] HexDigits? '.' HexDigits
    ;

fragment
BinaryExponent
    :   BinaryExponentIndicator SignedInteger
    ;

fragment
BinaryExponentIndicator
    :   [pP]
    ;

// �3.10.3 Boolean Literals

BooleanLiteral
    :   'true'
    |   'false'
    ;

// �3.10.4 Character Literals

CharacterLiteral
    :   '\'' SingleCharacter '\''
    |   '\'' EscapeSequence '\''
    ;

fragment
SingleCharacter
    :   ~['\\]
    ;

// �3.10.5 String Literals

StringLiteral
    :   '"' StringCharacters? '"'
    ;

fragment
StringCharacters
    :   StringCharacter+
    ;

fragment
StringCharacter
    :   ~["\\]
    |   EscapeSequence
    ;

// �3.10.6 Escape Sequences for Character and String Literals

fragment
EscapeSequence
    :   '\\' [btnfr"'\\]
    |   OctalEscape
    |   UnicodeEscape
    ;

fragment
OctalEscape
    :   '\\' OctalDigit
    |   '\\' OctalDigit OctalDigit
    |   '\\' ZeroToThree OctalDigit OctalDigit
    ;

fragment
UnicodeEscape
    :   '\\' 'u' HexDigit HexDigit HexDigit HexDigit
    ;

fragment
ZeroToThree
    :   [0-3]
    ;

// �3.10.7 The Null Literal

NullLiteral
    :   'null'
    ;

// �3.11 Separators

LPAREN          : '(';
RPAREN          : ')';
LBRACE          : '{';
RBRACE          : '}';
LBRACK          : '[';
RBRACK          : ']';
SEMI            : ';';
COMMA           : ',';
DOT             : '.';

// �3.12 Operators

ASSIGN          : '=';
GT              : '>';
LT              : '<';
BANG            : '!';
TILDE           : '~';
QUESTION        : '?';
COLON           : ':';
EQUAL           : '==';
LE              : '<=';
GE              : '>=';
NOTEQUAL        : '!=';
AND             : '&&';
OR              : '||';
INC             : '++';
DEC             : '--';
ADD             : '+';
SUB             : '-';
MUL             : '*';
DIV             : '/';
BITAND          : '&';
BITOR           : '|';
CARET           : '^';
MOD             : '%';

ADD_ASSIGN      : '+=';
SUB_ASSIGN      : '-=';
MUL_ASSIGN      : '*=';
DIV_ASSIGN      : '/=';
AND_ASSIGN      : '&=';
OR_ASSIGN       : '|=';
XOR_ASSIGN      : '^=';
MOD_ASSIGN      : '%=';
LSHIFT_ASSIGN   : '<<=';
RSHIFT_ASSIGN   : '>>=';
URSHIFT_ASSIGN  : '>>>=';

// �3.8 Identifiers (must appear after all keywords in the grammar)

Identifier
    :   JavaLetter JavaLetterOrDigit*
    ;

fragment
JavaLetter
    :   [a-zA-Z$_] // these are the "java letters" below 0x7F
    |   // covers all characters above 0x7F which are not a surrogate
        ~[\u0000-\u007F\uD800-\uDBFF]
        {Character.isJavaIdentifierStart(_input.LA(-1))}?
    |   // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
        [\uD800-\uDBFF] [\uDC00-\uDFFF]
        {Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?
    ;

fragment
JavaLetterOrDigit
    :   [a-zA-Z0-9$_] // these are the "java letters or digits" below 0x7F
    |   // covers all characters above 0x7F which are not a surrogate
        ~[\u0000-\u007F\uD800-\uDBFF]
        {Character.isJavaIdentifierPart(_input.LA(-1))}?
    |   // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
        [\uD800-\uDBFF] [\uDC00-\uDFFF]
        {Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?
    ;

//
// Additional symbols not defined in the lexical specification
//

AT : '@';
ELLIPSIS : '...';

//
// Whitespace and comments
//

WS  :  [ \t\r\n\u000C]+ -> skip
    ;

COMMENT
    :   '/*' .*? '*/' -> skip
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> skip
    ;