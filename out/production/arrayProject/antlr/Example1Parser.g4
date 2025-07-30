parser grammar Example1Parser;

options {tokenVocab=Example1Lexer;}

array: arrayDef+ EOF;

arrayDef: ARRAY OPEN_B arraybody CLOSE_B;

arraybody: ARRAY_INT(COMMA ARRAY_INT)* #arrayInt
         | ARRAY_STRING(COMMA ARRAY_STRING)* #arrayString
         ;



