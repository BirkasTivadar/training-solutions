package week05d03;

import java.util.ArrayList;
import java.util.List;

public class ListCounter {

    public int counterStartA(List<String> textList){
        int counter = 0;
        for(String text : textList){
            if(text.toLowerCase().startsWith("a")){
                counter ++;
            }
        }
        return counter;
    }

}
