package AST;

public class ValueBoolean extends Value{
    boolean valueB;

    public boolean isValueB() {
        return valueB;
    }

    public void setValueB(boolean valueB) {
        this.valueB = valueB;
    }

    @Override
    public String toString() {
        return "(boolean)" + valueB;
    }

    @Override
    public String generate()
    {
        return String.valueOf(valueB);
    }
}
