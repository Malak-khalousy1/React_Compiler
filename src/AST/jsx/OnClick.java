package AST.jsx;

//import SemanticError.SemanticErrorCheck;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class OnClick {

    String onClickLyric;
    static String nameFunctionClick;
    String argumentFunctionClick;


    public String getOnClickLyric() {
        return onClickLyric;
    }

    public void setOnClickLyric(String onClickLyric) {
        this.onClickLyric = onClickLyric;
    }

    public String getArgumentFunctionClick() {
        return argumentFunctionClick;
    }

    public void setArgumentFunctionClick(String argumentFunctionClick) {
        this.argumentFunctionClick = argumentFunctionClick;
    }

    public  String getNameFunctionClick() {
        return nameFunctionClick;
    }

    public void setNameFunctionClick(String nameFunctionClick) {
        this.nameFunctionClick = nameFunctionClick;
    }

    @Override
    public String toString() {
        return "(function) " + nameFunctionClick + '(' +
                "(parameter)" + argumentFunctionClick + ')' +
                "}";
    }

    public String generate(String element, String arrayElement, String mode)
    {
        return element +".addEventListener('click', () =>" + nameFunctionClick +"(" + argumentFunctionClick +"));\n";

    }


}