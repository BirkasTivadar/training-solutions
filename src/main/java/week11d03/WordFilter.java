package week11d03;

import java.util.ArrayList;
import java.util.List;

public class WordFilter {

    public List<String> wordsWithChar(List<String> words, char c) {
        List<String> result = new ArrayList<>();
        String filter = String.valueOf(c);
        for (String word : words) {
            if (word.contains(filter)) {
                result.add(word);
            }
        }
        return result;
    }
}
