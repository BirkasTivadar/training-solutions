package week13d05;

import java.util.HashSet;
import java.util.Set;

public class LetterCounter {


    public int countLettersOfWord(String str) {
        Set<Character> abcSet = new HashSet<>();
        for (Character c = 'a'; c <= 'z'; c++) {
            abcSet.add(c);
        }

        String strLower = str.toLowerCase();
        char[] strArr = strLower.toCharArray();

        Set<Character> strSet = new HashSet<>();
        for (Character c : strArr) {
            strSet.add(c);
        }

        abcSet.retainAll(strSet);

        return abcSet.size();
    }

}
