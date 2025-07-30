package AST.useRefEffect;

public class UseEffect
{
    private String useEffectLyric;
    private CallBack callBack;

    public String getUseEffectLyric() {
        return useEffectLyric;
    }

    public void setUseEffectLyric(String useEffectLyric) {
        this.useEffectLyric = useEffectLyric;
    }

    public CallBack getCallBack()
    {
        return callBack;
    }
    public void setCallBack(CallBack callBack)
    {
        this.callBack = callBack;
    }

    @Override
    public String toString()
    {
        return "(callback)" + callBack.toString();
    }
}
