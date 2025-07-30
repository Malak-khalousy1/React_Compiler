package AST.loopsAndConditions;

import AST.prints.DeclarationStatement;

public class ForCondition
{
    private DeclarationStatement declarationStatement;
    private String var;
    private int comparisonValue;
    private char operation;

    public DeclarationStatement getDeclarationStatement() {
        return declarationStatement;
    }

    public void setDeclarationStatement(DeclarationStatement declarationStatement) {
        this.declarationStatement = declarationStatement;
    }

    public String getVar() {
        return var;
    }

    public void setVar(String var) {
        this.var = var;
    }

    public int getComparisonValue() {
        return comparisonValue;
    }
    public void setComparisonValue(int comparisonValue) {
        this.comparisonValue = comparisonValue;
    }

    public char getCounter() {
        return operation;
    }

    public void setCounter(char operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
       if(operation=='+')
       {
           return "ForCondition{" +
                   "letStatement=" + declarationStatement +
                   ", variable from " + var + '\'' +
                   " to " + comparisonValue +
                   ", operation= increment'" + '\'' +
                   '}';
       }
       else if (operation=='-')
       {
           return "ForCondition{" +
                   "letStatement=" + declarationStatement +
                   ", variable='" + var + '\'' +
                   ", comparisonValue=" + comparisonValue +
                   ", operation= Minus'" + '\'' +
                   '}';
       }

        return  "ForCondition{" +
                "letStatement=" + declarationStatement +
                ", variable='" + var + '\'' +
                ", comparisonValue=" + comparisonValue +
                '}';
    }
}
