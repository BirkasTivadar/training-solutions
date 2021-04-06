package week11d03;

import java.util.*;

public class CharCounter {

    public int countChars(String[] chars) {
        if (chars == null || chars.length == 0) {
            throw new IllegalArgumentException("Chars must not be empty");
        }
        String longestStr = Arrays.stream(chars).max(Comparator.comparing((s -> s.length()))).get();
        int counter = 0;
        for (char c : longestStr.toCharArray()) {
            boolean inAll = isInAll(chars, c);
            if (inAll) {
                counter++;
            }
        }
        return counter;
    }

    private boolean isInAll(String[] chars, char c) {
        for (String str : chars) {
            if (!str.contains(String.valueOf(c))) {
                return false;
            }
        }
        return true;
    }


}
