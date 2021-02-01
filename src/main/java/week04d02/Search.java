package week04d02;

import java.util.ArrayList;
import java.util.List;


public class Search {

    public List<Integer> getIndexesOfChar(String str, Character character) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == character) {
                result.add(i);
            }
        }
        return result;
    }


    public static void main(String[] args) {
        Search search = new Search();

        System.out.println(search.getIndexesOfChar("almafa", 'a'));
    }
}
