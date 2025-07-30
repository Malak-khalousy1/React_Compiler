package AST.imports;

import AST.Statement;

import java.util.List;

public class ImportPackage extends Statement {
    List<String> idImportPackage;
    String stringImportPackage;
    String importLyric;
    String fromLyric;

    public String getStringImportPackage() {
        return stringImportPackage;
    }

    public void setStringImportPackage(String stringImportPackage) {
        this.stringImportPackage = stringImportPackage;
    }

    public List<String> getIdImportPackage() {
        return idImportPackage;
    }

    public void setIdImportPackage(List<String> idImportPackage) {
        this.idImportPackage = idImportPackage;
    }

    public String getImportLyric() {
        return importLyric;
    }

    public void setImportLyric(String importLyric) {
        this.importLyric = importLyric;
    }

    public String getFromLyric() {
        return fromLyric;
    }

    public void setFromLyric(String fromLyric) {
        this.fromLyric = fromLyric;
    }

    @Override
    public String toString() {
        return " \n ImportPackage { " +
                "\n " + idImportPackage +
                "\n " + stringImportPackage + '\'' +
                "\n }";
    }
}
