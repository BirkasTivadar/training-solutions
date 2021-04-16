package week11d03;

import java.util.*;

public class CharCounter {

    public int countChars(String[] chars) {
        if (chars == null || chars.length == 0) {
            throw new IllegalArgumentException("Chars must not be empty");
        }
        String temp = chars[0];
        int counter = 0;
        for (char c : temp.toCharArray()) {
            boolean isTrue = Arrays.stream(chars).allMatch(s -> s.contains(String.valueOf(c)));
            if(isTrue){
                counter++;
            }
        }
        return counter;
    }
}
