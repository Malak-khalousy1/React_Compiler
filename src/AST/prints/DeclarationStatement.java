package AST.prints;

import AST.*;

public class DeclarationStatement extends Statement {
    String varLyric;
    String letLyric;
    String identifier;
    Value value;


    public String getVarLyric() {
        return varLyric;
    }

    public void setVarLyric(String varLyric) {
        this.varLyric = varLyric;
    }

    public String getLetLyric() {
        return letLyric;
    }

    public void setLetLyric(String letLyric) {
        this.letLyric = letLyric;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public String toString() {
        if (varLyric != null) {
            return "VarStatement{" +
                    "identifier='" + identifier + '\'' +
                    ", value=" + value +
                    '}';
        } else {
            return "LetStatement{" +
                    "identifier='" + identifier + '\'' +
                    ", value=" + value +
                    '}';
        }
    }

    public String generate(){
        return (letLyric != null ? letLyric : varLyric +
                " " + identifier) +
                ((value != null) ? " = " + value + ";" : ";");

    }
//    public String generate() {
//        if (letLyric != null)
//        {
//            if (value instanceof ValueBoolean)
//            {
//                return "let" + identifier+  "="  + ((ValueBoolean) value).generate() + ";"+
//                        "const imageContainer = document.getElementById('image-container');\n" +
//                        "const selectedImageElement = document.getElementById('selected-image');\n" +
//                        "const selectedImageImg = document.getElementById('selected-image-img');\n" +
//                        "const selectedImageTitle = document.getElementById('selected-image-title');\n" +
//                        "const selectedImageDescription = document.getElementById('selected-image-description');";
//            }
//            else if (value instanceof ValueNumber)
//            {
//                return "let" +identifier + "="  + ((ValueNumber) value).generate() + ";"+
//                        "const imageContainer = document.getElementById('image-container');\n" +
//                        "const selectedImageElement = document.getElementById('selected-image');\n" +
//                        "const selectedImageImg = document.getElementById('selected-image-img');\n" +
//                        "const selectedImageTitle = document.getElementById('selected-image-title');\n" +
//                        "const selectedImageDescription = document.getElementById('selected-image-description');";
//            }
//            else
//            {
//                return "let" + identifier+ "=" + ((ValueString) value).generate() + ";" +
//                        "const imageContainer = document.getElementById('image-container');\n" +
//                        "const selectedImageElement = document.getElementById('selected-image');\n" +
//                        "const selectedImageImg = document.getElementById('selected-image-img');\n" +
//                        "const selectedImageTitle = document.getElementById('selected-image-title');\n" +
//                        "const selectedImageDescription = document.getElementById('selected-image-description');";
//            }
//            //we should fix the constDeclaration rule so, it suits this kind of way because it would be better with more specifications
//        }
//        else
//        {
//            return null;
//        }

    }

