package stringscanner;

import java.util.Scanner;

public class StringScanner {

    public int readAndSumValues(String intString, String delimiter) {
        if (isBlank(delimiter)) {
            return readAndSumValues(intString);
        }
        Scanner scanner = new Scanner(intString).useDelimiter(delimiter);
        int sum = 0;
        try {
            while (scanner.hasNext()) {
                sum += scanner.nextInt();
            }
        } catch (IllegalArgumentException iae) {
            throw new IllegalArgumentException("Incorrect parameter string!", iae);
        }
        return sum;
    }

    public int readAndSumValues(String intString) {
        Scanner scanner = new Scanner(intString);
        int sum = 0;
        try {
            while (scanner.hasNext()) {
                sum += scanner.nextInt();
            }
        } catch (IllegalArgumentException iae) {
            throw new IllegalArgumentException("Incorrect parameter string!", iae);
        }
        return sum;
    }

    public String filterLinesWithWordOccurrences(String text, String word) {
        Scanner scanner = new Scanner(text);
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

    public boolean isBlank(String string) {
        return string == null || string.isBlank();
    }

}
