grammar TSmm;	

program: expression | variableDefinition EOF
       ;

       expression : INT_CONSTANT
       | expression ('+' | '-') expression
       | IDENTIFIER
       ;

       variableDefinition : IDENTIFIER  '=' expression END_SENTENCE
       ;

  //-------------------------------------


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

