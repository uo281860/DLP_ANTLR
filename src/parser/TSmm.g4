grammar TSmm;
@header{
import ast.*;
}

// ------------------------------
// PARSER RULES
// ------------------------------

program
    : definition* EOF
    ;

definition
    : variableDefinition
    | functionDefinition
    ;

variableDefinition
    : 'let' IDENTIFIER ':' type END_SENTENCE
    ;

functionDefinition
    : 'function' IDENTIFIER '(' parameters? ')' ':' type block
    ;

parameters
    : parameter (',' parameter)*
    ;

parameter
    : IDENTIFIER ':' type
    ;

block
    : '{' statement* '}'
    ;

statement
    : variableDefinition
    | assignment
    | ifStatement
    | whileStatement
    | returnStatement
    | invocation END_SENTENCE
    ;

assignment
    : expression '=' expression END_SENTENCE
    ;

ifStatement
    : 'if' '(' expression ')' block ('else' block)?
    ;

whileStatement
    : 'while' '(' expression ')' block
    ;

returnStatement
    : 'return' expression? END_SENTENCE
    ;

// ------------------------------
// EXPRESSIONS (with precedence)
// ------------------------------

expression [Expression ast]
    : logicalOr
    ;

logicalOr
    : logicalAnd ('||' logicalAnd)*
    ;

logicalAnd
    : equality ('&&' equality)*
    ;

equality
    : relational (('==' | '!=') relational)*
    ;

relational
    : additive (('<' | '<=' | '>' | '>=') additive)*
    ;

additive
    : multiplicative (('+' | '-') multiplicative)*
    ;

multiplicative
    : unary (('*' | '/' | '%') unary)*
    ;

unary
    : ('!' | '+' | '-') unary
    | postfix
    ;

postfix
    : primary ( ('[' expression ']') | ('.' IDENTIFIER) | ('(' arguments? ')') )*
    ;

arguments
    : expression (',' expression)*
    ;

// A call is a postfix form; we also keep a dedicated rule for statement calls.
invocation
    : IDENTIFIER '(' arguments? ')'
    ;

primary
    : INT_CONSTANT{%ast = new IntLiteral($INT_CONSTANT.getCharPositionInLine, LexerHelper.lexemeToChar}
    | REAL_CONSTANT
    | CHAR_CONSTANT
    | IDENTIFIER
    | '(' expression ')' // e1=expresion OP=('+'|'-') e2=expression {$ast * new Arithmetic($e1.ast.getLine(), $e1.getColumn(),$e1.ast,$OP.txt,$e2.ast);}
    ;

// ------------------------------
// TYPES
// ------------------------------

type
    : 'int'
    | 'char'
    | 'void'
    | 'real'
    | type '[' INT_CONSTANT ']'
    | 'struct' '{' recordField+ '}'
    ;

recordField
    : type IDENTIFIER END_SENTENCE
    ;

  //-------------------------------------
//Reglas gramaticales no meter un varDefinition como cualquier statement -> let b:int;

/*
function f():void
{
 let a: int;
 a = 2;
 let b:int;
 b= a;
}
*/
//i,j :void;

END_SENTENCE : ';'
            ;
WHITES : [ \t\n\r]+ -> skip
            ;
COMMENT_1 : '/*'.*?'*/' -> skip
            ;
COMMENT_2 : '//'.*? [\n] -> skip
            ;
INT_CONSTANT: [1-9][0-9]*
            | '0'
            ;
REAL_CONSTANT: BASE EXPONENT*
            ;
fragment BASE: INT_CONSTANT | INT_CONSTANT*'.'INT_CONSTANT*
            ;
fragment EXPONENT: [Ee][+-]?INT_CONSTANT
            ;
CHAR_CONSTANT: '\'' ( ~['\\\r\n] | ESCAPED_CHAR | ASCII_CHAR ) '\''
            ;
fragment ESCAPED_CHAR : '\\' [nt]
	    ;
fragment ASCII_CHAR   : '\\' [0-9][0-9][0-9]
	    ;
IDENTIFIER : [a-zA-Z_] [a-zA-Z0-9_]*
	    ;