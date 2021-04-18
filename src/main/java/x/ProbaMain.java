package x;

import java.util.ArrayList;
import java.util.List;

public class ProbaMain {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(0,3);
        System.out.println(numbers.toString());

        numbers.add(4);

        numbers.remove(0);
        System.out.println(numbers);
        numbers.remove(numbers.size()-1);
        System.out.println(numbers);

     }
}
