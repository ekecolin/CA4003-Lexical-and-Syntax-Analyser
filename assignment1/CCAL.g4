grammar CCAL;

// Parser rules
prog: (decl_list function_list main) | EOF;

decl_list: (decl SEMICOLON decl_list)?;
decl: var_decl | const_decl;
var_decl: VAR ID COLON type;
const_decl: CONST ID COLON type EQUAL expression;

function_list: (function function_list)?;

function:
	type ID LB parameter_list RB LCB decl_list statement_block RETURN (
		expression
	)? SEMICOLON LCB;

type: NUMBERER | BOOLEAN | VOID;

parameter_list: nemp_parameter_list |;
nemp_parameter_list:
	ID COLON type
	| ID COLON type COMMA nemp_parameter_list;
main: MAIN LCB decl_list statement_block RCB;

statement_block: (statement statement_block)?;

statement:
	ID EQUAL expression SEMICOLON
	| ID LB arg_list RB SEMICOLON
	| LCB statement_block RCB
	| IF condition LCB statement_block RCB ELSE LCB statement_block RCB
	| WHILE condition LCB statement_block RCB
	| SKIPS SEMICOLON;

expression:
	fragm binary_arith_op fragm
	| LB expression RB
	| ID LB arg_list RB
	| fragm;

binary_arith_op: PLUS | MINUS;

fragm: ID | MINUS ID | NUMBER | TRUE | FALSE | LB expression RB;
condition:
	TILDA condition
	| LB condition RB
	| expression comp_op expression
	| condition (OR | AND) condition;
comp_op: EQUALTO | NOTEQUALTO | LT | GT | LTE | GTE;

arg_list: nemp_arg_list |;

nemp_arg_list: ID | ID COMMA nemp_arg_list;

// Alphabet of upper/lowercase letters
fragment Letter: [A-Za-z];
fragment Digit: [0-9];
fragment UnderScore: '_';
fragment A: [Aa];
fragment B: [Bb];
fragment C: [Cc];
fragment D: [Dd];
fragment E: [Ee];
fragment F: [Ff];
fragment G: [Gg];
fragment H: [Hh];
fragment I: [Ii];
fragment J: [Jj];
fragment K: [Kk];
fragment L: [Ll];
fragment M: [Mm];
fragment N: [Nn];
fragment O: [Oo];
fragment P: [Pp];
fragment Q: [Qq];
fragment R: [Rr];
fragment S: [Ss];
fragment T: [Tt];
fragment U: [Uu];
fragment V: [Vv];
fragment W: [Ww];
fragment X: [Xx];
fragment Y: [Yy];
fragment Z: [Zz];

// Keywords
MAIN: M A I N;
VAR: V A R;
CONST: C O N S T;
TRUE: T R U E;
FALSE: F A L S E;
NUMBERER: I N T E G E R;
BOOLEAN: B O O L E A N;
VOID: V O I D;
IF: I F;
ELSE: E L S E;
WHILE: W H I L E;
RETURN: R E T U R N;
SKIPS: 'skip';

// Operators
EQUAL: '=';
PLUS: '+';
MINUS: '-';
TILDA: '~';
OR: '||';
AND: '&&';
EQUALTO: '==';
NOTEQUALTO: '!=';
LT: '<';
GT: '>';
LTE: '<=';
GTE: '>=';

// Tokens
COMMA: ',';
SEMICOLON: ';';
COLON: ':';
LCB: '{';
RCB: '}';
LB: '(';
RB: ')';

//Complex Tokens
BOOLVAL: 'true' | 'false';
ID: Letter (Letter | Digit | UnderScore)*;
NUMBER: '-'? [1-9][0-9]* | [0];

// Whitespace
WS: [ \t\n\r]+ -> skip;

// Comments 
NESTEDCOMMENTS:
	'/*' ('/'*? NESTEDCOMMENTS | ('/'* | '*'*) ~[/*])*? '*'*? '*/' -> skip;
SINGLINECOMMENT: '//' ~[\r\n]* -> skip;