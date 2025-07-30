package AST.jsx;

public class LL {
    String mapCall;
    String argumentArrow;
    Image image;

    public String getArgumentArrow() {
        return argumentArrow;
    }

    public void setArgumentArrow(String argumentArrow) {
        this.argumentArrow = argumentArrow;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public String getMapCall() {
        return mapCall;
    }

    public void setMapCall(String mapCall) {
        this.mapCall = removeDotetc(mapCall);
    }

    @Override
    public String toString() {
        return "{ " +
                "\n\t\t\t  map through: " + mapCall.substring(0,6) + ',' +
                "\n\t\t\t  Arrow Click Function:{ Function Argument: |" + argumentArrow + '|' +
                ", \n\t\t\t Function body: \n\t\t\t\t" + image +
                "\n\t\t } end of ll";
    }

    String htmlGen(){

        return "";
    }

    public String generate()
    {
        return  mapCall + ".forEach(" + argumentArrow + "=>{\n" +
                image.generate(argumentArrow, "", "dec") +
                "});";
    }

    public String removeDotetc(String input){
        int lastDotIndex = input.lastIndexOf('.');
        if (lastDotIndex != -1) {
            // Get the substring before '.'
            return input.substring(0, lastDotIndex);
        } else {
            return input;
        }
    }
}
