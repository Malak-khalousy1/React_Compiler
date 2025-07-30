package AST.array;

import AST.Statement;

import java.util.List;
//objectLiteral:
//OPEN_CURLY property (COMMA property)* COMMA? CLOSE_CURLY;
public class ObjectLiteral extends Statement
{
    List<Property>properties;
    public List<Property> getProperties()
    {
        return properties;
    }

    public void setProperties(List<Property> properties)
    {
        this.properties = properties;
    }

    public String print(List<Property> pros){
        String out = "";
        for(int i=0; i<pros.size();i++){
            out += "\t" + pros.get(i);
            if(i!= pros.size()-1)
                out+= ", ";
        }
        return out;
    }

    @Override
    public String toString()
    {
        return "properties:\n\t{\n\t" + print(properties) +
                "\n\t}";
    }

    public String generate() {
        StringBuilder result = new StringBuilder("{\n");

        for (Property property : properties) {
            result.append("  ")
                    .append(property.generate())
                    .append(",\n");
        }

        if (!properties.isEmpty()) {
            result.setLength(result.length() - 2);
        }

        result.append("\n}");
        return result.toString();
    }
}
