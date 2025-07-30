package AST.jsx;

import AST.Statement;

public class Div extends Statement {
    DivBody divBody;

    public DivBody getDivBody() {
        return divBody;
    }

    public void setDivBody(DivBody divBody) {
        this.divBody = divBody;
    }

    @Override
    public String toString() {
        return "" +
                "\n\t\t " + divBody +
                "\n }";
    }

    public String htmlGen(){
        return divBody.htmlGen();
    }
    public String generate()
    {
        return divBody.generate();
    }
}
