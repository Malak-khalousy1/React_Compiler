package AST.useRefEffect;

import java.util.List;

public class CallBackWithDependencies extends CallBackWith
{
    private List<String> parameters;
    private Dependencies dependencies;
    public List<String> getParameters()
    {
        return parameters;
    }
    public void setParameters(List<String> parameters)
    {
        this.parameters = parameters;
    }

    public Dependencies getDependencies() {
        return dependencies;
    }

    public void setDependencies(Dependencies dependencies) {
        this.dependencies = dependencies;
    }

    @Override
    public String toString() {
        return "CallBackWithDependencies{" +
                "parameters=" + parameters +
                ", dependencies=" + dependencies +
                '}';
    }
}
