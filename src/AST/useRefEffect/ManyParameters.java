package AST.useRefEffect;

import java.util.List;

public class ManyParameters
{
    private List<String> parameters;

    public List<String> getId()
    {
        return parameters;
    }

    public void setId(List<String> id)
    {
        this.parameters = id;
    }

    @Override
    public String toString()
    {
        return "ManyParameters{" +
                "parameters=" + parameters +
                '}';
    }
}
