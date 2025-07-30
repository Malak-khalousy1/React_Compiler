package AST.function;

import AST.Statement;
import AST.UseState;
import AST.arrowClick.ArrowClick;
import AST.jsx.Div;
import AST.pureReact.ImageElement;
import AST.pureReact.ReturnImageElements;
import AST.useRefEffect.UseEffect;
import AST.useRefEffect.UseRef;

import java.util.List;

public class FunctionArrow extends Statement {
    private String functionName;
    private String returnLyric;
    private List<UseState> useStateList;
    private List<UseEffect> useEffectList;
    private List<UseRef> useRefList;
    private List<ArrowClick> arrowClick;
    private ImageElement imageElements;
    private Div functionDiv;
    private ReturnImageElements functionReturnImageElements;
    private Default aDefault;

    public Default getaDefault() {
        return aDefault;
    }

    public void setaDefault(Default aDefault) {
        this.aDefault = aDefault;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public String getReturnLyric() {
        return returnLyric;
    }

    public void setReturnLyric(String returnLyric) {
        this.returnLyric = returnLyric;
    }

    public List<UseState> getUseStateList() {
        return useStateList;
    }

    public void setUseStateList(List<UseState> useStateList) {
        this.useStateList = useStateList;
    }

    public List<UseEffect> getUseEffectList() {
        return useEffectList;
    }

    public void setUseEffectList(List<UseEffect> useEffectList) {
        this.useEffectList = useEffectList;
    }

    public List<UseRef> getUseRefList() {
        return useRefList;
    }

    public void setUseRefList(List<UseRef> useRefList) {
        this.useRefList = useRefList;
    }


    public List<ArrowClick> getArrowClick() {
        return arrowClick;
    }

    public void setArrowClick(List<ArrowClick> arrowClick) {
        this.arrowClick = arrowClick;
    }

    public ImageElement getImageElements() {
        return imageElements;
    }

    public void setImageElements(ImageElement imageElements) {
        this.imageElements = imageElements;
    }

    public Div getFunctionDiv() {
        return functionDiv;
    }

    public void setFunctionDiv(Div functionDiv) {
        this.functionDiv = functionDiv;
    }

    public ReturnImageElements getFunctionReturnImageElements() {
        return functionReturnImageElements;
    }

    public void setFunctionReturnImageElements(ReturnImageElements functionReturnImageElements) {
        this.functionReturnImageElements = functionReturnImageElements;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Declare FunctionArrow -name: |").append(functionName.toUpperCase()).append("|-{\n\t");

        if (useStateList != null) {
            if (!useStateList.isEmpty())
                sb.append("UseState: ").append(useStateList.toString()).append("\n\t");
        }
        if(aDefault!=null)
        {
            sb.append("DefaultStatement: ").append(aDefault.toString()).append("\n\t");

        }
        if (useEffectList != null) {
            if (!useEffectList.isEmpty())
                sb.append("UseEffect: ").append(useEffectList.toString()).append("\n\t");
        }

        if (useRefList != null) {
            if (!useRefList.isEmpty())
                sb.append("UseRef: ").append(useRefList.toString()).append("\n\t");
        }

        if (arrowClick != null) {
            sb.append("ArrowClick: ").append(arrowClick.toString()).append("\n\t");
        }

        if (imageElements != null) {
            sb.append("ImageElement: ").append(imageElements.toString()).append("\n\t");
        }

        if (functionDiv != null) {
            sb.append("Div: ").append(functionDiv.toString()).append("\n\t");
        }

        if (functionReturnImageElements != null) {
            sb.append("ReturnImageElements: ").append(functionReturnImageElements.toString()).append("\n\t");
        }
        sb.append("\n}end of FunctionArrow |").append(functionName.toUpperCase()).append("|\n");
        return sb.toString();
    }

}
