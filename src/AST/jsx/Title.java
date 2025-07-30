package AST.jsx;

public class Title {
    String elementTitle;

    public String getElementTitle() {
        return elementTitle;
    }

    public void setElementTitle(String elementTitle) {
        this.elementTitle = elementTitle;
    }

    @Override
    public String toString() {
        return " Title{ " +
                elementTitle +
               " }";
    }

    public String generate(String trg)
    {
        return trg + ".title;";
    }
}
