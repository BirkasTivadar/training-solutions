package week06d03;

import java.util.Scanner;

public class WordEraser {

    public String eraseWord(String words, String word) {
        StringBuilder result = new StringBuilder();
        Scanner scanner = new Scanner(words);
        while (scanner.hasNext()) {
            String str = scanner.next();
            if (!str.equals(word)) {
                result.append(str);
                result.append(" ");
            }
        }
        return result.toString().trim();
    }


    public static void main(String[] args) {
        WordEraser wordEraser = new WordEraser();
        System.out.println(wordEraser.eraseWord("alma körte barack alma szilva körte birsalma", "alma"));
    }
}



