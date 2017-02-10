grammar VYPe12;

// stuff that is placed at the top of <all> generated files
@parser::header {
package vype12;

import vype12.ste.*;
import vype12.tac.*;
}

@lexer::header {
package vype12;

import vype12.ste.*;
import vype12.tac.*;
}


@parser::members {
    public void displayRecognitionError(String[] tokenNames,
                                        RecognitionException e) {
        String hdr = getErrorHeader(e);
        String msg = getErrorMessage(e, tokenNames);
        // Now do something with hdr and msg...
        throw new SyntaxException("Syntax exception: "+hdr+" "+msg+".");
    }
}


@lexer::members {
    public void displayRecognitionError(String[] tokenNames,
                                        RecognitionException e) {
        String hdr = getErrorHeader(e);
        String msg = getErrorMessage(e, tokenNames);
        // Now do something with hdr and msg...
        throw new LexicalException("Lexical exception: "+hdr+" "+msg+".");
    }
}

// gramar

vype12	:	global* EOF;
global	:	functions;

functions
	:	definition
	|	declaration;

declaration
	:	dt=dataType ID LBRACKET {SymbolTable.getInstance().pushLevel();} (declarationDataTypes) RBRACKET {SymbolTable.getInstance().addFunctionDeclaration($dt.dt, $ID.text);} SEMICOLON;

declarationDataTypes
	:	dt=dataType {SymbolTable.getInstance().addVariable($dt.dt);} (COMMA dataType {SymbolTable.getInstance().addVariable($dt.dt);})*;

definition
	:	dt=dataType ID LBRACKET {SymbolTable.getInstance().pushLevel();} (functionArguments|TYPE_VOID) RBRACKET {STEFunction el = SymbolTable.getInstance().addFunctionDefinition($dt.dt, $ID.text); TACTable.getInstance().addFunction(el);} codeBlock {ParserFactory.addEndFunction(el);};

functionArguments returns [SymbolTable value]
	:	dt=dataType v=ID {SymbolTable.getInstance().addVariable($dt.dt, $v.text);} (COMMA dt2=dataType v2=ID {SymbolTable.getInstance().addVariable($dt2.dt, $v2.text);})*;

dataType returns [DataTypes dt]
	:	TYPE_CHAR { $dt = DataTypes.CHAR; }
	|	TYPE_INT { $dt = DataTypes.INT; }
	|	TYPE_STRING { $dt = DataTypes.STRING; }
	|	TYPE_VOID { $dt = DataTypes.VOID; }
	;

variables
	:	dt=dataType v=ID { STEVariable el = SymbolTable.getInstance().addVariable($dt.dt, $v.text); TACTable.getInstance().addVariable(el); } (COMMA v=ID { el = SymbolTable.getInstance().addVariable($dt.dt, $v.text); TACTable.getInstance().addVariable(el); })* SEMICOLON;

codeBlock returns [SymbolTableLevel value]
	:	LBRACE {SymbolTable.getInstance().pushLevel();} statement* RBRACE {$value = SymbolTable.getInstance().popLevel();};

statement
	:	variables
	|	whileStmt
	|	doWhileStmt
	|	ifElseStmt
	|	returnStmt
	|	assignStmt
	|	procedureStmt
	|	codeBlock
	;

whileStmt
	:	WHILE LBRACKET {String label = TACTable.createLabel(); STEVariable compare = TACTable.getInstance().addWhileStart(label);} e=expression {String label2 = TACTable.getInstance().addWhileCondition((STEVariable)$e.value, compare);} RBRACKET codeBlock {TACTable.getInstance().addWhileEnd(label, label2);};

doWhileStmt
	:	DO {String label = TACTable.createLabel(); STEVariable compare = TACTable.getInstance().addWhileStart(label);} codeBlock WHILE LBRACKET e=expression {String label2 = TACTable.getInstance().addWhileCondition((STEVariable)$e.value, compare);} {TACTable.getInstance().addWhileEnd(label, label2);} RBRACKET SEMICOLON;

ifElseStmt
	:	IF LBRACKET e=expression {String label = ParserFactory.addIf((STEVariable)$e.value);} RBRACKET a=codeBlock ELSE {String label2 = TACTable.getInstance().addElse(label);} b=codeBlock {TACTable.getInstance().addIfElseEnd(label2);};

returnStmt
	:	RETURN e=expression SEMICOLON {ParserFactory.addReturn((STEVariable)$e.value);}
	|	RETURN SEMICOLON {ParserFactory.addReturn(null);};

assignStmt
	:	ID EQUAL e=expression SEMICOLON {ParserFactory.assignVariable($ID.text, $e.value);};

expression returns [SymbolTableElement value]
	:	a=andExpr {$value = $a.value;} (
			'||' b=andExpr {$value = ParserFactory.orExpr($a.value, $b.value);}
		)*;

andExpr returns [SymbolTableElement value]
	:	e=eqExpr {$value = $e.value;} (
			'&&' e=eqExpr {$value = ParserFactory.andExpr($value, $e.value);}
		)*;

eqExpr returns [SymbolTableElement value]
	:	e=cmpExpr {$value = $e.value;} (
			'==' e=cmpExpr {$value = ParserFactory.eqExpr($value, $e.value);}
		|	'!=' e=cmpExpr {$value = ParserFactory.notEqExpr($value, $e.value);}
		)?;

cmpExpr returns [SymbolTableElement value]
	:	a=plusExpr {$value = $a.value;} (
			'<' b=plusExpr {$value = ParserFactory.lessExpr($a.value, $b.value);}
		|	'<=' b=plusExpr {$value = ParserFactory.lessEqExpr($a.value, $b.value);}
		|	'>' b=plusExpr {$value = ParserFactory.greaterExpr($a.value, $b.value);}
		|	'>=' b=plusExpr {$value = ParserFactory.greaterEqExpr($a.value, $b.value);}
		)*;


plusExpr returns [SymbolTableElement value]
	:	e=multExpr {$value = $e.value;} (
			PLUS e=multExpr {$value = ParserFactory.plusExpr($value, $e.value);}
		|	MINUS e=multExpr {$value = ParserFactory.minusExpr($value, $e.value);}
		)*;

multExpr returns [SymbolTableElement value]
	:	e=notExpr {$value = $e.value;} (
			MULTIPLY e=notExpr {$value = ParserFactory.multExpr($value, $e.value);}
		|	'/' e=notExpr {$value = ParserFactory.divideExpr($value, $e.value);}
		|	'%' e=notExpr {$value = ParserFactory.moduloExpr($value, $e.value);}
		)*;

notExpr returns [SymbolTableElement value]
	:	'!' a=reTypeExpr {$value = ParserFactory.notExpr($a.value);}
	|	a=reTypeExpr {$value = $a.value;};

reTypeExpr returns [SymbolTableElement value]
	:	LBRACKET dataType RBRACKET e=atom {$value = ParserFactory.reType($dataType.dt, $e.value);}
	|	atom {$value = $atom.value;}
	;

atom returns [SymbolTableElement value]
	:	INT {$value = ParserFactory.addInt(Integer.parseInt($INT.text));}
	|	c=customFunctionStmt {$value=$c.value;}
	|	ID {$value = SymbolTable.getInstance().findAndReturn($ID.text);}
	|	STRING {$value = ParserFactory.addString($STRING.text);}
	|	CHAR {$value = ParserFactory.addChar($CHAR.text);}
	|	'read_char()' {$value = ParserFactory.addReadChar();}
	|	'read_int()' {$value = ParserFactory.addReadInt();}
	|	'read_string()' {$value = ParserFactory.addReadString();}
	|	'get_at' LBRACKET ID COMMA e=expression RBRACKET {$value = ParserFactory.addGetAt($ID.text, $e.value);}
	|	'strcat' LBRACKET a=expression COMMA b=expression RBRACKET {$value = ParserFactory.addStrcat($a.value, $b.value);}
	|	LBRACKET e=expression RBRACKET {$value = $e.value;}
	;

procedureStmt
	:	'print' LBRACKET e=expression {TACTable.getInstance().addPrint((STEVariable)$e.value);} (COMMA e=expression {TACTable.getInstance().addPrint((STEVariable)$e.value);})* RBRACKET SEMICOLON
	|	'set_at' LBRACKET ID COMMA e=expression COMMA CHAR RBRACKET {ParserFactory.addSetAt($ID.text, $e.value, $CHAR.text);}	SEMICOLON
	|	customProcedureStmt SEMICOLON
	;

customFunctionStmt returns [SymbolTableElement value]
	:	ID {$value = SymbolTable.getInstance().findFunctionAndReturn($ID.text);} LBRACKET (e=expression {SymbolTable.getInstance().addFunctionParam((STEFunction)$value, $e.value);} (COMMA e=expression {SymbolTable.getInstance().addFunctionParam((STEFunction)$value, $e.value);})*)? RBRACKET {$value = TACTable.getInstance().addFunctionCall((STEFunction)$value);}
	;

customProcedureStmt returns [SymbolTableElement value]
	:	ID {$value = SymbolTable.getInstance().findFunctionAndReturn($ID.text);} LBRACKET (e=expression {SymbolTable.getInstance().addFunctionParam((STEFunction)$value, $e.value);} (COMMA e=expression {SymbolTable.getInstance().addFunctionParam((STEFunction)$value, $e.value);})*)? RBRACKET {TACTable.getInstance().addProcedureCall((STEFunction)$value); $value = null;}
	;

// Build-in data types
TYPE_STRING
	:	'string';
TYPE_CHAR
	:	'char';
TYPE_INT:	'int';
TYPE_VOID:	'void';

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