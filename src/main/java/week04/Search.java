package week04;

import java.util.ArrayList;
import java.util.List;

public class Search {

    public List<Integer> getIndexesOfChar(String str, char c){
        List<Integer> result = new ArrayList<>();
        String substr = str;

        while(str.indexOf(c) > -1){
            result.add(substr.indexOf(c));
            substr = substr.substring(substr.indexOf(c)+1);
        }
        return result;
    }

    public static void main(String[] args) {
        Search
        System.out.println();
    }


}
