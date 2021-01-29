package week13d05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LetterCounter {


    public int letterOfWordCounter(String str) {
        char[] abc = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
        };
        Set<Character> abcSet = new HashSet<>();
        for (Character c : abc) {
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
