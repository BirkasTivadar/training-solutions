package week08d02;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Lottery {

    public List<Integer> getNumbers(int interval, int numbers) {
        List<Integer> draws = new ArrayList<>();
        Random rnd = new Random(5);
        while (draws.size() < numbers) {
            int nextNumber = rnd.nextInt(interval) + 1;
            if (!draws.contains(nextNumber)) {
                draws.add(nextNumber);
            }
        }
        return draws;
    }

    public static void main(String[] args) {
        Lottery lottery = new Lottery();

        List<Integer> list = lottery.getNumbers(90, 5);
        for(int i =0; i<5; i++){

        System.out.println(list.get(i));
        }
    }
}


