package collectionslist.collectionslinkedlist;

import java.util.*;

public class Draw {

    private List<Integer> createList(int maxNumber) {
        List<Integer> mixList = new LinkedList<>();
        for (int i = 1; i <= maxNumber; i++) {
            mixList.add(i);
        }
        Collections.shuffle(mixList);
        return mixList;
    }

    public Set<Integer> drawNumbers(int drawCount, int maxNumber) {
        if (drawCount >= maxNumber) {
            throw new IllegalArgumentException(String.format("drawCount must be less then %d!", maxNumber));
        }
        List<Integer> result = createList(maxNumber);
        result = result.subList(0, maxNumber);
        Collections.sort(result);
        return new TreeSet<>(result);
    }
}
