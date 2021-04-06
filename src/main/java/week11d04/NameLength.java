package week11d04;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NameLength {

    public List<Integer> getLengths(List<String> names) {
        if(names == null){
            throw new IllegalArgumentException("Names must not be null");
        }
        Map<Integer, List<String>> temp = names.stream().filter(n -> n.startsWith("J")).collect(Collectors.groupingBy(String::length));
        return new ArrayList<>(temp.keySet());
    }

}


