package AST.prints;

public class PrintValueID extends PrintValue
{
   static private  String identifier;
    public String getIdentifier()
    {
        return identifier;
    }
    public void setIdentifier(String identifier)
    {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return "PrintValueID{" +
                "identifier='" + identifier + '\'' +
                '}';
    }
}
