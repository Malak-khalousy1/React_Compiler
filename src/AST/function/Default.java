package AST.function;

public class Default
{
      static String exportN;
    static String exportDe;
    static String nameDef;
    static String nameDefId;

    public static  String getExportN() {
        return exportN;
    }

    public void setExportN(String exportN) {
        this.exportN = exportN;
    }

    public static String getExportDe() {
        return exportDe;
    }

    public void setExportDe(String exportDe) {
        this.exportDe = exportDe;
    }

    public static String getNameDef() {
        return nameDef;
    }

    public void setNameDef(String nameDef) {
        this.nameDef = nameDef;
    }

    public static String getNameDefId() {
        return nameDefId;
    }

    public void setNameDefId(String nameDefId) {
        this.nameDefId = nameDefId;
    }
    public String generatedFunction;
    public String generate(){
        return generatedFunction +"();";
    }

}

