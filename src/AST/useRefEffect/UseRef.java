package AST.useRefEffect;

public class UseRef
{
    private String variable;
    private static String useRefLyric;
    private Object initialValue;

    public String getVariable()
    {
        return variable;
    }

    public void setVariable(String variable)
    {
        this.variable = variable;
    }


    public static String getUseRefLyric() {
        return useRefLyric;
    }

    public void setUseRefLyric(String useRefLyric) {
        this.useRefLyric = useRefLyric;
    }

    public Object getInitialValue()
    {
        return initialValue;
    }
    public void setInitialValue(Object initialValue)
    {
        this.initialValue = initialValue;
    }

    @Override
    public String toString()
    {
        return " (variable)" + variable +
                " , initialValue: " + initialValue;
    }
}
