package AST.useRefEffect;

import java.util.List;

public class Anonymous
{
    private List<AnonymousBody> anonymousBodyList;

    public Anonymous(List<AnonymousBody> anonymousBodyList)
    {
        this.anonymousBodyList = anonymousBodyList;
    }

    public List<AnonymousBody> getAnonymousBodyList()
    {
        return anonymousBodyList;
    }

    public void setAnonymousBodyList(List<AnonymousBody> anonymousBodyList)
    {
        this.anonymousBodyList = anonymousBodyList;
    }

    @Override
    public String toString()
    {
        return "Anonymous{" +
                "anonymousBodyList=" + anonymousBodyList.toString() +
                '}';
    }
}
