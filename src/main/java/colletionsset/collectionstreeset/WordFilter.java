package colletionsset.collectionstreeset;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class WordFilter {

    public Set<String> filterWords(String[] randomStrings){
        return new TreeSet<String>(Arrays.asList(randomStrings));
    }
}
