package AST.useRefEffect;

import java.util.List;

public class DependenciesExistent extends Dependencies
{
    private List<Parameter> parameters;
    public List<Parameter> getParameters()
    {
        return parameters;
    }
    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }

    @Override
    public String toString()
    {
        return "Dependencies Existent{" +
                "parameters=" + parameters +
                '}';
    }
}
