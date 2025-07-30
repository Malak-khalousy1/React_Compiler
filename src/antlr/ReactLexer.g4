lexer grammar ReactLexer;
//main tokens
REACTDOM:'ReactDOM';
CREATEROOT:'createRoot';
STRICT:'StrictMode';
APP:'App';
RENDER:'render';
DOCUMENT:'document';
GET:'getElementById';
ROOT:'\'' 'root' '\'';
ARROW: '=>';
DOT: '.';
SINGLE_QUOTE: '\'';
DOUBLE_QUOTE: '"';
FORWARD_SLASH: '/';
BACKSLASH: '\\';

//React tokens
IMPORT: 'import';
FROM: 'from';
React:'React';
USEStateT : 'useState';
STRING_LITERAL : '\'' 'react' '\'';
CONST: 'const';
USEFFECT:'useEffect';
USEREF:'useRef';
CURRENT:'current';
FOCUS:'focus';
FUNCTION: 'function';
RETURN: 'return';
EXPORT: 'export';
DEFAULT: 'default';
JSX:'jsx';
MAPCALL:ID DOT 'map';
CREATE_ELEMENT: 'React.createElement';
ELEMENTID:ID DOT 'id';
ELEMENTURL:ID DOT 'url';
ELEMENTTITLE:ID DOT 'title';
ELEMENTDESCRIPTION:ID DOT 'description';
RDC:REACTDOM DOT CREATEROOT ;
DDG:DOCUMENT DOT GET;
RDS:React DOT STRICT;
ELEMENTONCLICK:ONCLICK COLON OPEN_PAREN CLOSE_PAREN ARROW ID OPEN_PAREN ID CLOSE_PAREN;
CONSOLE_LOG: 'console.log';
ELEMENT:ID DOT ID;
DIVO:'div';
CNAME:'className';
DIVC:'/div';
ONCLICK:'onClick';
PARAGRAPH:'p';
H2:'h2';
MAP: 'map';
IMG:'img';
SRC:'src';
KEY:'key';
ALT:'alt';
LET        : 'let';
For        : 'for';
While      : 'while';
Do         : 'do';
If         : 'if';
ELSEIF : 'else if';
Else       : 'else';
TRUE : 'true';
FALSE : 'false';

/// Keywords
Switch     : 'switch';
Case       : 'case';
Break      : 'break';
Instanceof : 'instanceof';
Typeof     : 'typeof';
New        : 'new';
Var        : 'var';
Catch      : 'catch';
Finally    : 'finally';
Void       : 'void';
Continue   : 'continue';
Debugger   : 'debugger';
This       : 'this';
With       : 'with';
Throw      : 'throw';
Delete     : 'delete';
In         : 'in';
Try        : 'try';
As         : 'as';
NULL: 'null';


/// Future Reserved Words
Class   : 'class';
Enum    : 'enum';
Extends : 'extends';
Super   : 'super';
Async : 'async';
Await : 'await';
Implements   : 'implements' ;
Private      : 'private'    ;
Public       : 'public'     ;
Interface    : 'interface'  ;
Package      : 'package'    ;
Protected    : 'protected'  ;
Static       : 'static'     ;
Yield        : 'yield'      ;

//CSS tokens
DISPLAY:'display';
JS:'justify-content';
FLEX:'flex';
SA:'space-around';
WIDTH:'width';
HEIGHT:'height';
MARGIN:'margin-bottom';
PX:'px';
COLUMN:'column';
FLEXDIRECTION:'flex-direction';

//html tokens
DOCTYPE: '<!doctype html>';
HTML_START: '<html';
LANG_ATTRIBUTE: 'lang' '=' '"' [a-zA-Z]+ '">';
HEAD_START: '<head>';
META_CHARSET: '<meta' WS+ 'charset="UTF-8" />';
LINK_ICON: '<link' WS+ 'rel="icon"' WS+ 'type="image/svg+xml"' WS+ 'href="/vite.svg" />';
META_VIEWPORT: '<meta' WS+ 'name="viewport"' WS+ 'content="width=device-width, initial-scale=1.0" />';
TITLE_START: '<title>' WS?'Vite + React'+WS?'</title>';
HTML_END: '</html>';
HEAD_END: '</head>';
BODY_START: '<body>';
BODY_END: '</body>';
DIV_ROOT: '<div' WS+ 'id="root"></div>';
SCRIPT_START: '<script' WS+ 'type="module"';
SCRIPT_SRC: 'src="/src/main.jsx"></script>';

//Identifiers
ID: [a-zA-Z]+;
STRING: DOUBLE_QUOTE (ID|LETTER |INT|WS |VARIABLE| FORWARD_SLASH |BACKSLASH|DASH|COMMA|MARKS )* DOUBLE_QUOTE
      | SINGLE_QUOTE (ID|LETTER |WS| INT |VARIABLE|FORWARD_SLASH |BACKSLASH|DASH|COMMA|MARKS )* SINGLE_QUOTE
      |SINGLE_QUOTE (ID|LETTER |WS| INT |VARIABLE|FORWARD_SLASH |BACKSLASH|DOT|DASH|COMMA|MARKS )* SINGLE_QUOTE
      | DOUBLE_QUOTE(ID|LETTER |WS| INT |VARIABLE|FORWARD_SLASH |BACKSLASH|DOT|DASH|COMMA|MARKS )* DOUBLE_QUOTE
      ;
PATH:SINGLE_QUOTE (FORWARD_SLASH | ID)+ DOT ID SINGLE_QUOTE SEMI_COLON;
VARIABLE:[a-zA-Z][a-zA-Z0-9_-]*;
LETTER: [a-zA-Z];
NUMBER: [0-9]+;
INT: [0-9]+;
BOOLEAN : TRUE| FALSE;
WS: [ \t\r\n]+ -> skip;

COMMENT: '/*' .*? '*/' -> skip;

LINE_COMMENT: '//' ~[\r\n]* -> skip;
// Define symbols
SEMI_COLON: ';';
OPEN_PAREN: '(';
CLOSE_PAREN: ')';
OPEN_CURLY: '{';
CLOSE_CURLY: '}';
OPEN_BRACKET: '[';
CLOSE_BRACKET: ']';
OPENANGLEBRACKET:'<';
CLOSEANGLEBRACKET:'>';
EQUAL: '=';
NOTEQUAL:'!=';
COLON: ':';
COMMA: ',';
DASH:'-';
QuestionMark               : '?';
Ellipsis                   : '...';
PlusPlus                   : '++';
MinusMinus                 : '--';
Plus                       : '+';
BitNot                     : '~';
Not                        : '!';
Multiply                   : '*';
Modulus                    : '%';
Power                      : '**';
NullCoalesce               : '??';
Hashtag                    : '#';
LessThanEquals             : '<=';
GreaterThanEquals          : '>=';
Equals_                    : '==';
IdentityEquals             : '===';
IdentityNotEquals          : '!==';
BitAnd                     : '&';
BitXOr                     : '^';
BitOr                      : '|';
And                        : '&&';
Or                         : '||';
MultiplyAssign             : '*=';
DivideAssign               : '/=';
ModulusAssign              : '%=';
PlusAssign                 : '+=';
MinusAssign                : '-=';
LeftShiftArithmeticAssign  : '<<=';
RightShiftArithmeticAssign : '>>=';
RightShiftLogicalAssign    : '>>>=';
BitAndAssign               : '&=';
BitXorAssign               : '^=';
BitOrAssign                : '|=';
PowerAssign                : '**=';
MARKS:'!'|'?'|'&'|'^'|'%'|'#'|'@'|'*';




