package week07d03;

import java.util.ArrayList;
import java.util.List;

public class NumberList {

    public boolean isIncreasing(List<Integer> numberList){
        if(numberList == null){
            throw new IllegalArgumentException("List is null.");
        }
        if(numberList.size() < 2){
            return true;
        }
        int numberFormerIndex = numberList.get(0);
        for(int i = 1; i<numberList.size(); i++){
            if(numberList.get(i) < numberFormerIndex){
                return false;
            }
            numberFormerIndex = numberList.get(i);
        }
        return true;
    }
}
