package AST.useRefEffect;

import java.util.List;

public class CallBackWithAnonymous extends CallBackWith
{
    private List<String> parameters;
    private Anonymous anonymous;
    public List<String> getParameters()
    {
        return parameters;
    }
    public void setParameters(List<String> parameters)
    {
        this.parameters = parameters;
    }

    public Anonymous getAnonymous() {
        return anonymous;
    }

    public void setAnonymous(Anonymous anonymous) {
        this.anonymous = anonymous;
    }

    @Override
    public String toString() {
        return "CallBackWithAnonymous{" +
                "parameters=" + parameters +
                ", anonymous=" + anonymous +
                '}';
    }
}
