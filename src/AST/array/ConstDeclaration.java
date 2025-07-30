package AST.array;

import AST.Statement;

public class ConstDeclaration extends Statement {
    String nameArray;
    ArrayLiteral arrayLiteral;

    public String getNameArray() {
        return nameArray;
    }

    public void setNameArray(String nameArray) {
        this.nameArray = nameArray;
    }

    public ArrayLiteral getArrayLiteral() {
        return arrayLiteral;
    }

    public void setArrayLiteral(ArrayLiteral arrayLiteral) {
        this.arrayLiteral = arrayLiteral;
    }

    @Override
    public String toString() {
        return "Declare const |"
                + nameArray.toUpperCase() + "| = [\n"
                + arrayLiteral +
                "]\n";
    }

    public String generate()
    {
        return "const "
                + nameArray + " = [\n"
                + arrayLiteral .generate()+
                "];";
    }
}
