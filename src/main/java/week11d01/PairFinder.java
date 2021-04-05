package week11d01;


import java.util.HashMap;
import java.util.Map;

public class PairFinder {

    public int findPairs(int[] arr) {
        int countpairs = 0;
        Map<Integer, Integer> pairs = new HashMap<>();
        for (int i : arr) {
            if (!pairs.containsKey(i)) {
                pairs.put(i, 0);
            }
            pairs.put(i, pairs.get(i) + 1);
        }
        return getCountpairs(countpairs, pairs);
    }

    private int getCountpairs(int countpairs, Map<Integer, Integer> pairs) {
        for (int i : pairs.values()) {
            countpairs += i / 2;
        }
        return countpairs;
    }
}

