package AST.useRefEffect;

import java.util.List;

public class CallBackID extends CallBack
{
    private List<String> parameters;

    public List<String> getParameters()
    {
        return parameters;
    }

    public void setParameters(List<String> parameters)
    {
        this.parameters = parameters;
    }

    @Override
    public String toString()
    {
        return "CallBackID{" +
                "parameters=" + parameters +
                '}';
    }
}
