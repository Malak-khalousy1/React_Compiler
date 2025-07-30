package AST;

import java.util.ArrayList;
import java.util.List;
public class Program {
    List<Statement> statements;

    public Program(){
        this.statements = new ArrayList<Statement>();
    }

    public  void addStatement(Statement s){
        statements.add(s);
    }

    public String print(List<Statement> s){
        String out = "";
        for(Statement st : s)
             out += st + "\n";
        return out;
    }

    @Override
    public String toString() {
        return "Program:\n" +
                print(statements) +
                "\n end Program";
    }
}
