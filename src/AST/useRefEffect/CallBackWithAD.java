package AST.useRefEffect;

public class CallBackWithAD extends CallBackWith
{
    private Dependencies dependencies;
    private Anonymous anonymous;

    public Dependencies getDependencies()
    {
        return dependencies;
    }

    public void setDependencies(Dependencies dependencies)
    {
        this.dependencies = dependencies;
    }

    public Anonymous getAnonymous()
    {
        return anonymous;
    }

    public void setAnonymous(Anonymous anonymous)
    {
        this.anonymous = anonymous;
    }

    @Override
    public String toString() {
        return "CallBackWithAD{" +
                "dependencies=" + dependencies +
                ", anonymous=" + anonymous +
                '}';
    }
}
