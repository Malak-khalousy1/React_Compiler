package AST.props;

public class ElementID extends Element
{
    private String id;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    @Override
    public String toString()
    {
        return "ElementID{" +
                "id=" + id +
                '}';
    }
}
