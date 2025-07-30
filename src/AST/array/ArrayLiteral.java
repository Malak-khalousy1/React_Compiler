package AST.array;

import AST.Statement;

import java.util.List;

public class ArrayLiteral extends Statement {
List<ObjectLiteral> arrayObjects;

    public List<ObjectLiteral> getArrayLiterals()
    {
        return arrayObjects;
    }

    public void setArrayLiterals(List<ObjectLiteral> arrayLiterals)
    {
        this.arrayObjects = arrayLiterals;
    }

    public String print(List<ObjectLiteral> ols){
        String out = "{\n";
        for(int i=0;i<ols.size();i++){
            out += "\n\t" + ols.get(i);
        }
        out += "\nend of Objects\n";
        return out;
    }

    @Override
    public String toString() {
        return "Objects:\n" +
                print(arrayObjects);
    }

    public String generate() {
        StringBuilder result = new StringBuilder("\n");

        for (ObjectLiteral object : arrayObjects) {
            result.append("  ")
                    .append(object.generate())
                    .append(",\n");
        }


        if (!arrayObjects.isEmpty()) {
            result.setLength(result.length() - 2);
        }

        result.append("\n");
        return result.toString();
    }
}
