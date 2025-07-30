package AST;

public class ValueNumber extends Value{
    int valNum;

    public int getValNum() {
        return valNum;
    }
  

    public void setValNum(int valNum) {
        this.valNum = valNum;
    }

    @Override
    public String toString() {
        return "(integer)" + valNum;
    }

    @Override
    public String generate()
    {
        return String.valueOf(valNum);
    }
}
