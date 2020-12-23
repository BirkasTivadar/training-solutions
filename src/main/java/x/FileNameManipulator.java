package x;

public class FileNameManipulator {

    private boolean isEmpty(String str) {
        return str == null || str.isBlank();
    }

    public Character findLastCharachter(String str) {
        if (isEmpty(str)) {
            throw new IllegalArgumentException("Empty string!");
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
        if (isEmpty(filename) || isEmpty(ext) || filename.charAt(0) == '.'){
            throw new IllegalArgumentException("Invalid argument!");
        }
        return findFileExtension(filename).substring(1).equals(ext);
    }

    public static void main(String[] args) {
        FileNameManipulator fileNameManipulator = new FileNameManipulator();
        System.out.println(fileNameManipulator.findLastCharachter("abcdef \t  \n "));
    }


}