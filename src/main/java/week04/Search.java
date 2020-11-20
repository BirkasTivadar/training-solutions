package week04;

import java.util.ArrayList;
import java.util.List;

public class Search {

    public List<Integer> getIndexesOfChar(String str, char c){
        List<Integer> result = new ArrayList<>();
        int nextIndex;

        while(str.indexOf(c) > -1){
            result.add(str.indexOf(c));
            str = str.substring(str.indexOf(c)+1);
        }
        return result;
    }


}
