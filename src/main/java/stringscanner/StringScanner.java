package stringscanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringScanner {

    public int readAndSumValues(String intString, String delimiter) {
        if (isBlank(delimiter)) {
            return readAndSumValues(intString);
        }
        Scanner scanner = new Scanner(intString).useDelimiter(delimiter);
        int sum = 0;
        while (scanner.hasNext()) {
            sum += scanner.nextInt();
        }
        return sum;
    }

    public int readAndSumValues(String intString) {
        Scanner scanner = new Scanner(intString);
        int sum = 0;
        while (scanner.hasNext()) {
            sum += scanner.nextInt();
        }
        return sum;
    }

    public boolean isBlank(String string) {
        return string == null || string.isBlank();
    }
/*
    public static void main(String[] args) {
        Scanner scanner = new Scanner("12 13 14").useDelimiter(",");
        List<Integer> list = new ArrayList<>();
        while (scanner.hasNext()) {
            Integer s = scanner.nextInt();
            System.out.println(s);
            list.add(s);
            System.out.println(list);
        }
    }
*/
/*
    public String filterLinesWithWordOccurrences(String text, String word){

    }*/

}
