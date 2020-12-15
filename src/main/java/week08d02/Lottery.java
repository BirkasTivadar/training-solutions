package week08d02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {

    public List<Integer> getNumbers(int interval, int numbers) {
        List<Integer> draws = new ArrayList<>();
        Random rnd = new Random();
        while (draws.size() < numbers) {
            Integer nextNumber = rnd.nextInt(interval) + 1;
            if (draws.contains(nextNumber)) {
                draws.add(nextNumber);
            }
        }
        return draws;
    }
}


