package AST.prints;

import AST.Statement;
import AST.Value;

public class ConstStatement extends Statement {
    String constLyric;
    String identifierConst;
    Value valueConst;

    public String getConstLyric() {
        return constLyric;
    }

    public void setConstLyric(String constLyric) {
        this.constLyric = constLyric;
    }

    public String getIdentifierConst() {
        return identifierConst;
    }

    public void setIdentifierConst(String identifierConst) {
        this.identifierConst = identifierConst;
    }

    public Value getValueConst() {
        return valueConst;
    }

    public void setValueConst(Value valueConst) {
        this.valueConst = valueConst;
    }

    @Override
    public String toString() {
        return "ConstStatement{" +
                "identifier='" + identifierConst + '\'' +
                ", value=" + valueConst +
                '}';
    }

}
