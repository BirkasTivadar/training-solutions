package stringmethods.filename;

public class FileNameManipulator {

    public char findLastCharachter(String str) {
        return str.trim().charAt(str.trim().length() - 1);
    }

    public String findFileExtension(String fileName) {
        return fileName.substring(fileName.indexOf('.'), fileName.length());
    }

    public Boolean identifyFilesByExtension(String ext, String fileName) {
        return ext.equals(fileName.substring(fileName.indexOf('.')+1, fileName.length()));
    }


}
