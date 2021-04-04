package week08d03.senior;

import java.util.List;
import java.util.stream.Collectors;

public class StringLists {

    public List<String> shortestWords(List<String> words) {
        if (words == null) {
            throw new IllegalArgumentException("Words must not be null.");
        }
        int min = words.stream().mapToInt(String::length).summaryStatistics().getMin();
        return words.stream().filter(s -> s.length() == min).collect(Collectors.toList());
    }
}
