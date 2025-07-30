package AST.jsx;

import AST.Statement;

public class FunctionDev extends Statement {
    String nameFunction;
    Div div;

    public Div getDiv() {
        return div;
    }

    public void setDiv(Div div) {
        this.div = div;
    }

    public String getNameFunction() {
        return nameFunction;
    }

    public void setNameFunction(String nameFunction) {
        this.nameFunction = nameFunction;
    }

    @Override
    public String toString() {
        return "\n  FunctionDev { " +
                "\n " + nameFunction + '\'' +
                "\n " + div +
                "\n }";
    }
}
