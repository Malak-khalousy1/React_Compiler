package AST.useRefEffect;

public class OneParameterID extends OneParameter
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
        return "OneParameterID{" +
                "id=" + id +
                '}';
    }
}
