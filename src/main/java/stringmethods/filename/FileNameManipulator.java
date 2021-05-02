package stringmethods.filename;

public class FileNameManipulator {

    private static final String INVALID_ARGUMENT = "Invalid argument!";

    private static final String EMPTY_STRING = "Empty string!";

    public Character findLastCharacter(String str) {

        if (isEmpty(str)) {
            throw new IllegalArgumentException(EMPTY_STRING);
        }

        String strClean = str.trim();

        return strClean.charAt(strClean.length() - 1);
    }


    public String findFileExtension(String fileName) {

        if (!isEmpty(fileName)) {
            for (int i = 1; i < fileName.length() - 1; i++) {
                if (fileName.charAt(i) == '.') {
                    return fileName.substring(i);
                }
            }
        }

        throw new IllegalArgumentException("Invalid file name!");
    }


    public boolean identifyFilesByExtension(String ext, String filename) {

        if (isEmpty(filename) || isEmpty(ext) || filename.charAt(0) == '.') {
            throw new IllegalArgumentException(INVALID_ARGUMENT);
        }

        return findFileExtension(filename).substring(1).equals(ext);
    }


    public boolean compareFilesByName(String searchedFileName, String actualFileName) {

        if (isEmpty(searchedFileName) || isEmpty(actualFileName)) {
            throw new IllegalArgumentException(INVALID_ARGUMENT);
        }

        String searchedName = searchedFileName.substring(0, searchedFileName.indexOf(findFileExtension(searchedFileName)));
        String actualName = actualFileName.substring(0, actualFileName.indexOf(findFileExtension(actualFileName)));

        return searchedName.equals(actualName);
    }


    public String changeExtensionToLowerCase(String filename) {

        if (isEmpty(filename)) {
            throw new IllegalArgumentException(EMPTY_STRING);
        }

        if (filename.charAt(0) == '.') {
            throw new IllegalArgumentException(INVALID_ARGUMENT);
        }

        String ext = findFileExtension(filename).toLowerCase();

        return filename.substring(0, filename.indexOf(findFileExtension(filename))).concat(ext);
    }

    public String replaceStringPart(String fileName, String present, String target) {

        if (isEmpty(fileName)) {
            throw new IllegalArgumentException(EMPTY_STRING);
        }

        String result = fileName;

        if (findFileExtension(fileName).substring(1).equals(present)) {
            result = fileName.replace(present, target);
        } else if (fileName.contains(present)) {
            String[] file = fileName.split(present);
            result = String.join(target, file);
        }

        return result;
    }

    private boolean isEmpty(String str) {
        return str == null || str.isBlank();
    }

}
