package app;

import AST.Program;
import SemanticError.SemanticErrorCheck;
import Visitor.Visitor;
import antlr.ReactLexer;
import antlr.ReactParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {

    public static void main(String[] args) throws IOException {
        String source = "tests/functionalComponent.txt";
        CharStream charStream = fromFileName(source);
        ReactLexer ReactExampleLexer = new ReactLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(ReactExampleLexer);
        ReactParser ReactExampleParser = new ReactParser(tokens);
        ParseTree ast = ReactExampleParser.program();
        Visitor ReactExample = new Visitor();
        Program program = (Program) ReactExample.visit(ast);
        System.out.println(program);

        if(SemanticErrorCheck.isError){
            System.out.println("there were errors cannot generate code");
        }
        else{

        }
    }
}