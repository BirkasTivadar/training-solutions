package collectionslist.collectionsarraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lottery {

    public List<Integer> selectWinningNumbers(int lotteryType, int ballCount) {
        if (ballCount <= lotteryType) {
            throw new IllegalArgumentException("Balls must be more then the winning numbers!");
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= ballCount; i++) {
            result.add(i);
        }
        Collections.shuffle(result);
        return result.subList(0, lotteryType);
    }
}
