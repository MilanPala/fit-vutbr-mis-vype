grammar vype12;

vype12	:	global+;
global	:	functions
	|	variables;

functions
	:	definition
	|	declaration;
	
declaration
	:	dataType ID LBRACKET declarationDataTypes RBRACKET SEMICOLON;

declarationDataTypes
	:	dataType (COMMA dataType)*;

definition
	:	dataType ID LBRACKET functionArguments RBRACKET codeBlock;
	
functionArguments
	:	dataType ID (COMMA dataType ID)*;
	
dataType:	TYPE_CHAR
	|	TYPE_INT
	|	TYPE_STRING;

variables
	:	dataType ID (COMMA ID)*;

codeBlock
	:	LBRACE statement* RBRACE;

statement
	:	variables
	|	whileStmt
	|	doWhileStmt
	|	ifElseStmt
	|	returnStmt
	|	assignStmt;
	
whileStmt
	:	WHILE LBRACKET expression RBRACKET codeBlock;
	
doWhileStmt
	:	DO codeBlock WHILE LBRACKET expression RBRACKET SEMICOLON;
	
ifElseStmt
	:	IF LBRACKET expression RBRACKET codeBlock ELSE codeBlock;

returnStmt
	:	RETURN SEMICOLON;

assignStmt
	:	ID EQUAL expression SEMICOLON;

expression
	:	multExpr (
			PLUS multExpr
		|	MINUS multExpr
		)*;
		
multExpr:	atom ( MULTIPLY atom )*;

atom	:	INT
	|	ID
	|	LBRACKET expression RBRACKET;

// Build-in data types
TYPE_STRING
	:	'string';
TYPE_CHAR
	:	'char';
TYPE_INT:	'int';

WHILE	:	'while';
DO	:	'do';
IF	:	'if';
ELSE	:	'else';
RETURN	:	'return';
// Identificators
ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT :	'0'..'9'+
    ;

FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT
    ;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

CHAR:  '\'' ( ESC_SEQ | ~('\''|'\\') ) '\''
    ;

fragment
EXPONENT : ('e'|'E') (PLUS|MINUS)? ('0'..'9')+ ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

SEMICOLON
	:	';';

COMMA	:	',';

LBRACE:	'{';
RBRACE:	'}';




LBRACKET
	:	'('
	;

RBRACKET
	:	')'
	;

EQUAL
	:	'='
	;

PLUS
	:	'+'
	;

MINUS
	:	'-'
	;

MULTIPLY
	:	'*'
	;