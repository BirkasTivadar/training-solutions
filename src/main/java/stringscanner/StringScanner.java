package stringscanner;


import java.util.InputMismatchException;
import java.util.Scanner;

public class StringScanner {

    public int calculateWithScanner(Scanner sc) {
        int sum = 0;
        try {
            while (sc.hasNext()) {
                sum += sc.nextInt();
            }
        } catch (InputMismatchException ex) {
            throw new IllegalArgumentException("Incorrect parameter string!", ex);
        }
        return sum;
    }


    public int readAndSumValues(String intString, String delimiter) {
        try (Scanner scanner = new Scanner(intString)) {
            if (!isBlank(delimiter)) {
                scanner.useDelimiter(delimiter);
            }
            return calculateWithScanner(scanner);
        }
    }

    public int readAndSumValues(String intString) {
        return readAndSumValues(intString, null);
    }

    public String filterLinesWithWordOccurrences(String text, String word) {
        if (isBlank(text) || word == null || "".equals(word)) {
            throw new IllegalArgumentException("Incorrect parameter string!");
        }
        try (Scanner scanner = new Scanner(text)) {
            StringBuilder newText = new StringBuilder();
            while (scanner.hasNextLine()) {
                String s = scanner.nextLine();
                if (s.contains(word)) {
                    newText.append(s);
                    newText.append("\n");
                }
            }
            return newText.toString().trim();
        }
    }
    public boolean isBlank(String string) {
        return string == null || string.isBlank();
    }
}
