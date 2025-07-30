parser grammar ReactParser;

options {
    tokenVocab = ReactLexer;
}

// Define the main entry point
program: statement* EOF;

// Define statements
statement: importPackage| importFromPath| importhooks| constDeclaration|
arrayLiteral|objectLiteral|property|arrowclick|
function|functionArrow|functionReturnValue|divBody|div|
consoleLogStatement|declarationStatement|constStatement|variableValueAssignment|imageElements|returnImageElements|
propsFunction|conditionOrLoop|cssprogram|html|node|expression;

// Define individual statements
importFromPath  :
                IMPORT STRING SEMI_COLON
                ;

importPackage   :
                IMPORT OPEN_CURLY ID CLOSE_CURLY FROM STRING SEMI_COLON*
                ;

//import { useState,useRef,useEffect } from 'react'
importhooks     :
                IMPORT React? COMMA? OPEN_CURLY hooks+ CLOSE_CURLY FROM STRING_LITERAL SEMI_COLON*
                ;

hooks           :
                USEStateT COMMA*|USEREF COMMA*|USEFFECT COMMA*
                ;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////
property:
ID COLON (STRING | NUMBER | ID|PATH);

constDeclaration:
CONST ID EQUAL (arrayLiteral) SEMI_COLON;

arrayLiteral:
OPEN_BRACKET (objectLiteral (COMMA+ objectLiteral)* COMMA*)? CLOSE_BRACKET;

objectLiteral:
OPEN_CURLY property (COMMA property)* COMMA? CLOSE_CURLY;

///////////////////////////////////////////////////////////////////////////////////////////////////

value              : NUMBER | STRING;
arrayElement       : ID OPEN_BRACKET value CLOSE_BRACKET;

params             : (arrayElement| value |ID) COMMA?;
usestate           :CONST OPEN_BRACKET ID COMMA ID CLOSE_BRACKET EQUAL USEStateT OPEN_PAREN params* CLOSE_PAREN SEMI_COLON;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

arrowclick         :
                   CONST ID EQUAL OPEN_PAREN ID? CLOSE_PAREN ARROW OPEN_CURLY functionCall CLOSE_CURLY SEMI_COLON*;
functionCall       :
                   ID OPEN_PAREN params* CLOSE_PAREN SEMI_COLON;


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

elementProperties:
(KEY COLON ELEMENTID COMMA?)| (SRC COLON ELEMENTURL COMMA)|(ALT COLON ELEMENTTITLE COMMA);
imageElements:
CONST ID EQUAL MAPCALL OPEN_PAREN OPEN_PAREN ID CLOSE_PAREN ARROW OPEN_PAREN CREATE_ELEMENT OPEN_PAREN STRING COMMA OPEN_CURLY
    elementProperties* (ONCLICK COLON OPEN_PAREN CLOSE_PAREN ARROW ID OPEN_PAREN ID CLOSE_PAREN)?
  CLOSE_CURLY CLOSE_PAREN CLOSE_PAREN CLOSE_PAREN SEMI_COLON;

elementSecond:
(OPEN_CURLY ((CNAME COLON STRING) |((KEY| SRC| ALT) COLON (ELEMENTID|ELEMENTURL|ELEMENTTITLE|ELEMENTDESCRIPTION) COMMA?)*) CLOSE_CURLY)|ID|NULL;

elementThird:
 (ID|(createImageElements COMMA)*|ELEMENTID|ELEMENTURL|ELEMENTTITLE|ELEMENTDESCRIPTION) COMMA?;

createImageElements:
 CREATE_ELEMENT OPEN_PAREN STRING COMMA elementSecond COMMA elementThird CLOSE_PAREN?;

returnImageElements:
 createImageElements CLOSE_PAREN SEMI_COLON;
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//key={image.id}/>
key:
KEY EQUAL OPEN_CURLY ELEMENTID CLOSE_CURLY;

//src={image.url}
src:
 SRC EQUAL OPEN_CURLY ELEMENTURL CLOSE_CURLY;

//alt={image.title}
alt:
 ALT EQUAL OPEN_CURLY ELEMENTTITLE CLOSE_CURLY;

//onClick={() => handleImageClick(image)}
onClick:
 ONCLICK EQUAL OPEN_CURLY OPEN_PAREN CLOSE_PAREN ARROW (ID|ONCLICK) OPEN_PAREN ID CLOSE_PAREN CLOSE_CURLY;
image:
 OPENANGLEBRACKET ((IMG key? src alt onClick?)|(ID imageProperty*)) FORWARD_SLASH CLOSEANGLEBRACKET;

imageProperty: ((ID|ALT|SRC|ONCLICK) EQUAL OPEN_CURLY (ID) CLOSE_CURLY);

//{selectedImage.title}
title:
 OPEN_CURLY ELEMENTTITLE CLOSE_CURLY;
//<h2>tiltl</h2>
heading:
 OPENANGLEBRACKET H2 CLOSEANGLEBRACKET title OPENANGLEBRACKET FORWARD_SLASH H2 CLOSEANGLEBRACKET;

 //{selectedImage.description}
 description:
  OPEN_CURLY ELEMENTDESCRIPTION CLOSE_CURLY;

//<p>description</p>
paragraph:
 OPENANGLEBRACKET PARAGRAPH CLOSEANGLEBRACKET description OPENANGLEBRACKET FORWARD_SLASH PARAGRAPH CLOSEANGLEBRACKET;

//{images.map((image) => ())}
ll:
 OPEN_CURLY MAPCALL OPEN_PAREN OPEN_PAREN ID CLOSE_PAREN ARROW OPEN_PAREN image CLOSE_PAREN CLOSE_PAREN CLOSE_CURLY;

container:
 divBody | ll | image | heading | paragraph;

//ex: <div className="App">
div: divBody;
divBody:
 OPENANGLEBRACKET DIVO CNAME EQUAL STRING CLOSEANGLEBRACKET container* OPENANGLEBRACKET DIVC CLOSEANGLEBRACKET;

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

props: CONST OPEN_CURLY ID COMMA (ID|ONCLICK) CLOSE_CURLY EQUAL ID SEMI_COLON;

propsReturn:OPENANGLEBRACKET IMG propsElements* onClick? FORWARD_SLASH CLOSEANGLEBRACKET;
propsElements: ((ID|SRC|ALT) EQUAL OPEN_CURLY (ELEMENTID|ELEMENTURL|ELEMENTTITLE) CLOSE_CURLY);

propsBody: props RETURN OPEN_PAREN propsReturn CLOSE_PAREN SEMI_COLON;

propsFunction: FUNCTION ID OPEN_PAREN ID CLOSE_PAREN OPEN_CURLY propsBody CLOSE_CURLY ;

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
function:
         FUNCTION (ID|APP) OPEN_PAREN CLOSE_PAREN OPEN_CURLY  (usestate| useRef|useEffect)*arrowclick*imageElements?(declarationStatement|constStatement|consoleLogStatement|variableValueAssignment)* RETURN
         ((OPEN_PAREN div CLOSE_PAREN SEMI_COLON?)|returnImageElements) CLOSE_CURLY defaultStatement?;
functionArrow: CONST (ID | APP) EQUAL OPEN_PAREN CLOSE_PAREN ARROW OPEN_CURLY (usestate | useRef | useEffect)* arrowclick*imageElements?(declarationStatement|constStatement)*  RETURN
               ((OPEN_PAREN div CLOSE_PAREN SEMI_COLON?) | returnImageElements) CLOSE_CURLY defaultStatement?;
functionReturnValue:FUNCTION ID OPEN_PAREN ID* CLOSE_PAREN OPEN_CURLY
(functionReturnValue|declarationStatement|constStatement|consoleLogStatement|variableValueAssignment)*
(RETURN ID SEMI_COLON)* CLOSE_CURLY;


defaultStatement:
EXPORT DEFAULT (ID|APP) SEMI_COLON;

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

useEffect:USEFFECT OPEN_PAREN callback CLOSE_PAREN SEMI_COLON;
callback:ID+|ID+ dependencies|anonymous| anonymous dependencies;
anonymous:OPEN_PAREN CLOSE_PAREN ARROW OPEN_CURLY anonymousbody* CLOSE_CURLY;
anonymousbody:consoleLogStatement|for|if|while|do|declarationStatement|constStatement;
dependencies:empty|existent;
empty:COMMA OPEN_BRACKET CLOSE_BRACKET;//[]intial render
existent:COMMA OPEN_BRACKET parameter* CLOSE_BRACKET;//[firstname]or[firstname,lastname,age]
parameter:one|many;
one:ID|arrayElement;
many:( ID COMMA*);

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

useRef: CONST VARIABLE EQUAL USEREF OPEN_PAREN (ID|NUMBER|STRING) CLOSE_PAREN SEMI_COLON;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

declarationStatement:
(LET|Var) ID EQUAL? value? SEMI_COLON;
constStatement:
CONST ID EQUAL value SEMI_COLON;
//varStatement:Var ID EQUAL value SEMI_COLON;
printvalue: STRING | ID|consoleLogStatement;

consoleLogStatement:
CONSOLE_LOG OPEN_PAREN printvalue CLOSE_PAREN SEMI_COLON;
variableValueAssignment:ID EQUAL value SEMI_COLON;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////
conditionOrLoop:
    if
  | for
  | while
  | do;

for
: For forCondition forBody;
forCondition
: OPEN_PAREN (declarationStatement|constStatement) ID (OPENANGLEBRACKET|CLOSEANGLEBRACKET|GreaterThanEquals | LessThanEquals) (NUMBER | ID) SEMI_COLON ID (MinusMinus | PlusPlus) CLOSE_PAREN;
forBody
:OPEN_CURLY (ID | printvalue) CLOSE_CURLY;

while
: While whileCondition whileBody;

whileCondition
: OPEN_PAREN whileConditionFunction CLOSE_PAREN SEMI_COLON*;
whileConditionFunction
:(ID* (OPENANGLEBRACKET|CLOSEANGLEBRACKET|GreaterThanEquals | LessThanEquals| EQUAL| NOTEQUAL ) NUMBER* | ID | Not* TRUE | Not* FALSE);
whileBody
: OPEN_CURLY (ID | printvalue) whileBodyFunction* CLOSE_CURLY;

whileBodyFunction
: ID (PlusPlus | MinusMinus) SEMI_COLON;

do
: Do whileBody While whileCondition;

if
: If ifCondition ifBody elseIf* else*;

ifCondition
: OPEN_PAREN ( (ID | NUMBER)*) (OPENANGLEBRACKET|CLOSEANGLEBRACKET|GreaterThanEquals | LessThanEquals| EQUAL| NOTEQUAL|Equals_) (ID|NUMBER)* CLOSE_PAREN;

ifBody
: OPEN_CURLY (ID|printvalue) CLOSE_CURLY;

elseIf
: ELSEIF ifCondition ifBody;

else
: Else ifBody;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

width:WIDTH COLON NUMBER+ PX SEMI_COLON;
height:HEIGHT COLON NUMBER+ PX SEMI_COLON;
margin:MARGIN COLON NUMBER+ PX SEMI_COLON;
bodyImage: width|height|margin;
flexDirection:FLEXDIRECTION COLON COLUMN SEMI_COLON;
display:DISPLAY COLON FLEX SEMI_COLON;
justify:JS COLON SA SEMI_COLON ;
cssBody: display|justify|flexDirection;
css:DOT (ID|VARIABLE|APP) OPEN_CURLY cssBody* CLOSE_CURLY;
cssImg: DOT (ID|VARIABLE|APP) IMG OPEN_CURLY bodyImage* CLOSE_CURLY;
cssprogram:css+|cssImg+;
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
content: DIV_ROOT SCRIPT_START SCRIPT_SRC;
html: DOCTYPE HTML_START LANG_ATTRIBUTE HEAD_START
      (META_CHARSET LINK_ICON META_VIEWPORT TITLE_START HEAD_END)?
      BODY_START content BODY_END HTML_END;
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
app:OPENANGLEBRACKET APP FORWARD_SLASH  CLOSEANGLEBRACKET;

node:RDC OPEN_PAREN DDG OPEN_PAREN  ROOT CLOSE_PAREN CLOSE_PAREN DOT RENDER
     OPEN_PAREN
     OPENANGLEBRACKET  RDS CLOSEANGLEBRACKET app OPENANGLEBRACKET FORWARD_SLASH RDS CLOSEANGLEBRACKET COMMA CLOSE_PAREN ;


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
expression: logicalOrExpression;

logicalOrExpression: logicalAndExpression (Or logicalAndExpression)*;

logicalAndExpression: equalityExpression (And equalityExpression)*;

equalityExpression: relationalExpression ((Equals_ | NOTEQUAL) relationalExpression)*;

relationalExpression: additiveExpression ((OPENANGLEBRACKET | CLOSEANGLEBRACKET | LessThanEquals | GreaterThanEquals) additiveExpression)*;

additiveExpression: multiplicativeExpression ((Plus | DASH) multiplicativeExpression)*;

multiplicativeExpression: unaryExpression ((Multiply | FORWARD_SLASH) unaryExpression)*;

unaryExpression: (Plus | DASH | Not | BitNot) unaryExpression | primaryExpression;

primaryExpression: OPEN_PAREN expression CLOSE_PAREN
    | ID
    | NUMBER
    ;