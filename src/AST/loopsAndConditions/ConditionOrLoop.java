package AST.loopsAndConditions;

import AST.Statement;

import java.util.List;

public class ConditionOrLoop extends Statement
{
    private List<If> ifList;
    private List<For> forList;
    private List<While>whileList;
    private List<DoWhile>doWhileList;

    public List<If> getIfList() {
        return ifList;
    }

    public void setIfList(List<If> ifList) {
        this.ifList = ifList;
    }

    public List<For> getForList() {
        return forList;
    }

    public void setForList(List<For> forList) {
        this.forList = forList;
    }

    public List<While> getWhileList() {
        return whileList;
    }

    public void setWhileList(List<While> whileList) {
        this.whileList = whileList;
    }

    public List<DoWhile> getDoWhileList() {
        return doWhileList;
    }

    public void setDoWhileList(List<DoWhile> doWhileList) {
        this.doWhileList = doWhileList;
    }

    @Override
    public String toString() {
        return "ConditionOrLoop{" +
                "ifList=" + ifList +
                ", forList=" + forList +
                ", whileList=" + whileList +
                ", doWhileList=" + doWhileList +
                '}';
    }
}
