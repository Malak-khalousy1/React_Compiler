lexer grammar Example1Lexer;

ARRAY:'array';
OPEN_B:'(' ->pushMode(ARRAY_MODE);
WS: [ \t]+ ->channel(HIDDEN);
NEWLINE: [\n\r]+ ->skip;
mode ARRAY_MODE;
COMMA:',';
CLOSE_B:')'->popMode;
ARRAY_INT: [0-9]+;
ARRAY_STRING: [a-zA-Z]+;
