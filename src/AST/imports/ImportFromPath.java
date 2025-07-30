package AST.imports;

import AST.Statement;

public class ImportFromPath extends Statement {

    String importString;
    String importLyric;

    public String getImportString() {
        return importString;
    }

    public String getImportLyric() {
        return importLyric;
    }

    public void setImportLyric(String importLyric) {
        this.importLyric = importLyric;
    }

    public void setImportString(String importString) {
        this.importString = importString;
    }

    @Override
    public String toString() {
        return "ImportFile "
                + importString + "\n";
    }
}


