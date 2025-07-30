grammar Expr;
// the grammar name and file name must match

@header {
    package antlr;

}

//start variable of my grammer
prog:(decl|expr)+EOF  #program
    ;

decl: ID ':' INT_TYPE '=' NUM #declaration
    ;

//Antlr resolves ambiguities in favor of alternative given first
expr: expr'*'expr #Multiplication
    |expr'+'expr  #Addition
    |ID           #Variable
    |NUM          #Number
    ;

// Tokens

ID:[a-z][a-zA-Z0-9_]*; //identifiers
NUM:'0'|'-'?[1-9][0-9]*;
INT_TYPE: 'INT';
COMMENT:'--'~[\r\n]* ->skip;
WS:[ \t\n]+ ->skip;
NEWLINE:[\n\r]->skip;