package stringmethods.filename;

public class FileNameManipulator {

    public char findLastCharachter(String str) {
        if (isBlank(str)) {
            throw new IllegalArgumentException("Empty string!");
        }
        return str.trim().charAt(str.trim().length() - 1);
    }

    public String findFileExtension(String fileName) {
        if (isBlank(fileName)) {
            throw new IllegalArgumentException("Invalid file name!");
        }
        if (fileName.indexOf('.') < 1 || fileName.indexOf('.') == fileName.length() - 1) {
            throw new IllegalArgumentException("Invalid file name!");
        }
        return fileName.substring(fileName.indexOf('.'), fileName.length());
    }

    public boolean identifyFilesByExtension(String ext, String fileName) {
        if (isBlank(fileName) || isBlank(ext)) {
            throw new IllegalArgumentException("Invalid argument!");
        }
        if (fileName.indexOf('.') < 1 || fileName.indexOf('.') == fileName.length() - 1) {
            throw new IllegalArgumentException("Invalid argument!");
        }
        return ext.trim().equals(fileName.trim().substring(fileName.indexOf('.') + 1, fileName.length()));
    }

    public boolean compareFilesByName(String searchedFileName, String actualFileName) {
        if (isBlank(searchedFileName) || isBlank(actualFileName)) {
            throw new IllegalArgumentException("Invalid argument!");
        }
        return searchedFileName.trim().equalsIgnoreCase(actualFileName.trim());
    }

    public String changeExtensionToLowerCase(String fileName) {
        if (isBlank(fileName)) {
            throw new IllegalArgumentException("Empty string!");
        }
        if (fileName.indexOf('.') < 1 || fileName.indexOf('.') == fileName.length() - 1) {
            throw new IllegalArgumentException("Invalid argument!");
        }
        return fileName.trim().replace(this.findFileExtension(fileName.trim()), this.findFileExtension(fileName.trim()).toLowerCase());
    }

    public String replaceExtension(String fileName, String present, String target) {
        if (isBlank(fileName)) {
            throw new IllegalArgumentException("Empty string!");
        }
        if (fileName.contains(present)) {
            return fileName.trim().replace(present, target);
        } else {
            return fileName.trim();
        }
    }

    private boolean isBlank(String string) {
        return string == null || string.isBlank();
    }


}
