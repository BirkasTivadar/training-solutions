package collectionslist.collectionsarraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lottery {

    public List<Integer> selectWinningNumbers(int lotteryType, int ballCount) {
        if (lotteryType >= ballCount) {
            throw new IllegalArgumentException("Balls must be more then the winning numbers!");
        }
        List<Integer> result = new ArrayList<>();
        Random rnd = new Random();
        while (result.size() < lotteryType) {
            int oneBall = rnd.nextInt(ballCount) + 1;
            if (!result.contains(oneBall)) {
                result.add(oneBall);
            }
        }
        Collections.sort(result);
        return result ;
    }
}
