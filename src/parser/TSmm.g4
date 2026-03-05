grammar TSmm;

@header {
    import ast.*;
    import java.util.*;
    import parser.LexerHelper;
}

// ------------------------------
// REGLAS DEL PARSER
// ------------------------------

program returns [Program ast]
    : { List<Definition> defs = new ArrayList<>(); }
      (d=definition { defs.add($d.ast); })* EOF
      { $ast = new Program($start.getLine(), $start.getCharPositionInLine(), defs); }
    ;

definition returns [Definition ast]
    : vd=variableDefinition { $ast = $vd.ast; }
    | fd=functionDefinition { $ast = $fd.ast; }
    ;

variableDefinition returns [VariableDefinition ast]
    : 'let' id=IDENTIFIER ':' t=type END_SENTENCE
      { $ast = new VariableDefinition($id.getLine(), $id.getCharPositionInLine(), $t.ast, $id.text); }
    ;

functionDefinition returns [FunctionDefinition ast]
    : 'function' id=IDENTIFIER '(' p=parameters? ')' ':' t=type b=block
      { $ast = new FunctionDefinition($id.getLine(), $id.getCharPositionInLine(), $t.ast, $id.text,
        $p.ast != null ? $p.ast : new ArrayList<>(), $b.ast); }
    ;

parameters returns [List<VariableDefinition> ast]
    : { $ast = new ArrayList<>(); }
      p1=parameter { $ast.add($p1.ast); }
      (',' p2=parameter { $ast.add($p2.ast); } )*
    ;

parameter returns [VariableDefinition ast]
    : id=IDENTIFIER ':' t=type
      { $ast = new VariableDefinition($id.getLine(), $id.getCharPositionInLine(), $t.ast, $id.text); }
    ;

block returns [List<Statement> ast]
    : '{' { $ast = new ArrayList<>(); }
      (s=statement { $ast.add($s.ast); })* '}'
    ;

statement returns [Statement ast]
    : vd=variableDefinition { $ast = $vd.ast; }
    | as=assignment         { $ast = $as.ast; }
    | ifS=ifStatement       { $ast = $ifS.ast; }
    | whS=whileStatement    { $ast = $whS.ast; }
    | retS=returnStatement  { $ast = $retS.ast; }
    | inv=invocation END_SENTENCE { $ast = $inv.ast; }
    ;

assignment returns [Assignment ast]
    : e1=expression '=' e2=expression END_SENTENCE
      { $ast = new Assignment($e1.ast.getLine(), $e1.ast.getColumn(), $e1.ast, $e2.ast); }
    ;

ifStatement returns [If ast]
    : 'if' '(' cond=expression ')' b1=block ('else' b2=block)?
      { $ast = new If($start.getLine(), $start.getCharPositionInLine(), $cond.ast, $b1.ast, $b2 != null ? $b2.ast : new ArrayList<>()); }
    ;

whileStatement returns [While ast]
    : 'while' '(' cond=expression ')' b=block
      { $ast = new While($start.getLine(), $start.getCharPositionInLine(), $cond.ast, $b.ast); }
    ;

returnStatement returns [Return ast]
    : 'return' e=expression? END_SENTENCE
      { $ast = new Return($start.getLine(), $start.getCharPositionInLine(), $e != null ? $e.ast : null); }
    ;

// ------------------------------
// EXPRESIONES (Con Precedencia)
// ------------------------------

expression returns [Expression ast]
    : e=logicalOr { $ast = $e.ast; }
    ;

additive returns [Expression ast]
    : l=multiplicative { $ast = $l.ast; }
      ( op=('+'|'-') r=multiplicative
        { $ast = new Arithmetic($op.getLine(), $op.getCharPositionInLine(), $ast, $op.text, $r.ast); }
      )*
    ;

multiplicative returns [Expression ast]
    : l=unary { $ast = $l.ast; }
      ( op=('*'|'/'|'%') r=unary
        { $ast = new Arithmetic($op.getLine(), $op.getCharPositionInLine(), $ast, $op.text, $r.ast); }
      )*
    ;

// Simplificando para el ejemplo, pero sigue la misma lógica para logicalOr, logicalAnd, etc.
logicalOr returns [Expression ast] : e=logicalAnd { $ast = $e.ast; } ;
logicalAnd returns [Expression ast] : e=equality { $ast = $e.ast; } ;
equality returns [Expression ast] : e=relational { $ast = $e.ast; } ;
relational returns [Expression ast] : e=additive { $ast = $e.ast; } ;

unary returns [Expression ast]
    : op=('!'|'+'|'-') u=unary { $ast = new UnaryExpression($op.getLine(), $op.getCharPositionInLine(), $op.text, $u.ast); }
    | p=postfix { $ast = $p.ast; }
    ;

postfix returns [Expression ast]
    : base=primary { $ast = $base.ast; }
      ( '[' idx=expression ']' { /* Lógica para ArrayAccess */ }
      | '.' field=IDENTIFIER   { /* Lógica para RecordAccess */ }
      | '(' arg=arguments? ')' { $ast = new Invocation($start.getLine(), $start.getCharPositionInLine(), (Variable)$ast, $arg.ast != null ? $arg.ast : new ArrayList<>()); }
      )*
    ;

primary returns [Expression ast]
    : val=INT_CONSTANT  { $ast = new IntLiteral($val.getLine(), $val.getCharPositionInLine(), LexerHelper.lexemeToInt($val.text)); }
    | val=REAL_CONSTANT { $ast = new RealLiteral($val.getLine(), $val.getCharPositionInLine(), LexerHelper.lexemeToReal($val.text)); }
    | val=CHAR_CONSTANT { $ast = new CharLiteral($val.getLine(), $val.getCharPositionInLine(), LexerHelper.lexemeToChar($val.text)); }
    | id=IDENTIFIER     { $ast = new Variable($id.getLine(), $id.getCharPositionInLine(), $id.text); }
    | '(' e=expression ')' { $ast = $e.ast; }
    ;

arguments returns [List<Expression> ast]
    : { $ast = new ArrayList<>(); }
      e1=expression { $ast.add($e1.ast); }
      (',' e2=expression { $ast.add($e2.ast); } )*
    ;

invocation returns [Invocation ast]
    : id=IDENTIFIER '(' arg=arguments? ')'
      { $ast = new Invocation($id.getLine(), $id.getCharPositionInLine(), new Variable($id.getLine(), $id.getCharPositionInLine(), $id.text), $arg.ast != null ? $arg.ast : new ArrayList<>()); }
    ;

// ------------------------------
// TIPOS
// ------------------------------

type returns [Type ast]
    : 'int'  { $ast = new IntType($start.getLine(), $start.getCharPositionInLine()); }
    | 'char' { $ast = new CharType($start.getLine(), $start.getCharPositionInLine()); }
    | 'void' { $ast = new VoidType($start.getLine(), $start.getCharPositionInLine()); }
    | 'real' { $ast = new NumberType($start.getLine(), $start.getCharPositionInLine()); }
    | base=type '[' size=INT_CONSTANT ']'
      { $ast = new ArrayType($start.getLine(), $start.getCharPositionInLine(), LexerHelper.lexemeToInt($size.text), $base.ast); }
    | 'struct' '{' { List<RecordField> fields = new ArrayList<>(); }
      (f=recordField { fields.add($f.ast); })+ '}'
      { $ast = new RecordType($start.getLine(), $start.getCharPositionInLine(), fields); }
    ;

recordField returns [RecordField ast]
    : t=type id=IDENTIFIER END_SENTENCE
      { $ast = new RecordField($id.getLine(), $id.getCharPositionInLine(), $id.text, $t.ast); }
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