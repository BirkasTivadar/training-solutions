package stringmethods.filename;

public class FileNameManipulator {

    public char findLastCharachter(String str) {
        return str.trim().charAt(str.trim().length() - 1);
    }

    public String findFileExtension(String fileName) {
        return fileName.substring(fileName.indexOf('.'), fileName.length());
    }

    public Boolean identifyFilesByExtension(String ext, String fileName) {
        return ext.trim().equals(fileName.trim().substring(fileName.indexOf('.') + 1, fileName.length()));
    }

    public Boolean compareFilesByName(String searchedFileName, String actualFileName) {
        return searchedFileName.trim().equalsIgnoreCase(actualFileName.trim());
    }

    public String changeExtensionToLowerCase(String fileName) {
        return fileName.trim().replace(this.findFileExtension(fileName.trim()), this.findFileExtension(fileName.trim()).toLowerCase());
    }

    public String replaceExtension(String fileName, String present, String target) {
        if (fileName.contains(present)) {
            return fileName.trim().replace(present, target);
        } else {
            return fileName.trim();
        }
    }


}
