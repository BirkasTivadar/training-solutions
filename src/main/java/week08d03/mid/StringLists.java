package week08d03.mid;

import java.util.ArrayList;
import java.util.List;

public class StringLists {

    public List<String> stringListsUnion(List<String> first, List<String> second){
        List<String> union = new ArrayList<>();
        union.addAll(first);
        for(String str: second){
            if(!union.contains(str)){
                union.add(str);
            }
        }
        return union;
    }
}
