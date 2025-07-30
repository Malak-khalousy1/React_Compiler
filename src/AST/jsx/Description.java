package AST.jsx;

public class Description {
    String elementDescription;

    public String getElementDescription() {
        return elementDescription;
    }

    public void setElementDescription(String elementDescription) {
        this.elementDescription = elementDescription;
    }

    @Override
    public String toString() {
        return " Description{ " +
                elementDescription +
                " }";
    }

    public String generate(String trg)
    {
        return trg + ".description;";
    }
}
