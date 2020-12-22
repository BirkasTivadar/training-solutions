package x;

import java.util.ArrayList;
import java.util.List;

public class Duplicates {

    public List<Integer> find(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < numbers.size(); i++){
            for(int j = i-1; j<i;j++){
                if(numbers.get(i) == numbers.get(j)){
                    result.add(numbers.get(i));
                    break;
                }
            }
        }
        return result;
    }
}
