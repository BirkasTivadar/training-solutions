package controladvanced;

import java.util.ArrayList;
import java.util.List;

public class Duplicates {

    public List<Integer> findDuplicates(List<Integer> integers) {
        List<Integer> duplicates = new ArrayList<>();
        for (Integer number : integers) {
            List<Integer> subList = integers.subList(integers.indexOf(number) + 1, integers.size());
            if (subList.contains(number) && !duplicates.contains(number)) {
                duplicates.add(number);
            }
        }
        return duplicates;
    }


}
