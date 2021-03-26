package lambdaintro;

import java.io.File;
import java.util.*;

public class OfficeDocumentReader {

    public static final String DOCX = ".docx";
    public static final String PPTX = ".pptx";
    public static final String XLSX = ".xlsx";

    private boolean isValidFile(File file) {
        return file.getName().toLowerCase().endsWith(DOCX) || file.getName().toLowerCase().endsWith(PPTX) || file.getName().toLowerCase().endsWith(XLSX);
    }

    public List<File> listOfficeDocuments(File path) {
        List<File> result = Arrays.asList(path.listFiles(file -> file.isFile() && isValidFile(file)));
        result.sort(Comparator.comparing(File::getName));
        return result;
    }
}
