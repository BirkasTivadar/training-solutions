package week05d03;

import java.util.ArrayList;
import java.util.List;

public class ListCounter {

    public int counterStartA(List<String> textList){
        String a = String.valueOf('a');
        String aU = String.valueOf('A');
        int counter = 0;
        for(String text : textList){
            if(text.indexOf(a) == 0 || text.indexOf(aU) == 0){
                counter ++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        ListCounter listCounter = new ListCounter();
        List<String> list = new ArrayList<>();
        list.add("asde");
        list.add("bsde");
        list.add("zsde");
        list.add("Asde");
        System.out.println(listCounter.counterStartA(list));
    }
}
