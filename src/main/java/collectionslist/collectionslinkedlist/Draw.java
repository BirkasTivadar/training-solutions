package collectionslist.collectionslinkedlist;

import java.util.*;

public class Draw {
    public Set<Integer> drawNumbers(int drawCount, int maxNumber){
        if(drawCount >= maxNumber){
            throw new IllegalArgumentException(String.format("drawCount must be less then %d!", maxNumber));
        }
        List<Integer> tempList = new LinkedList<>();
        for(int i = 1 ; i <= maxNumber; i++){
            tempList.add(i);
        }
        Collections.shuffle(tempList);
        return new TreeSet<>(tempList.subList(0,drawCount));
    }
}
