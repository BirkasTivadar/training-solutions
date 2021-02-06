package x;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntegerOperations {

    public List<Integer> createList(int... numbers) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : numbers) {
            result.add(number);
        }
        return result;
    }


    public int sumIntegerList(List<Integer> integerList) {
        int result = 0;
        for (Integer number : integerList) {
            result += number;
        }
        return result;
    }


    public int sumIntegerObjects(Integer... integers) {
        int result = 0;
        for (Integer number : integers) {
            result += number;
        }
        return result;
    }
}
