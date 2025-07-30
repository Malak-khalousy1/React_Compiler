package AST.pureReact;

import AST.Statement;

public class ReturnImageElements extends Statement {
    CreateImageElements createImageElements;

    public CreateImageElements getCreateImageElements() {
        return createImageElements;
    }

    public void setCreateImageElements(CreateImageElements createImageElements) {
        this.createImageElements = createImageElements;
    }

    @Override
    public String toString() {
        return "Display elements: { " +
                "\n " + createImageElements +
                "\t }";
    }
}
