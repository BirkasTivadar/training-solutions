package debug.numbers;

import java.util.ArrayList;
import java.util.List;

public class NumberStatistics {

    private List<Integer> numbers;

    public NumberStatistics(List<Integer> numbers) {
        this.numbers = new ArrayList<>(numbers);
    }

    public int sumPositives() {
        return numbers.stream().filter(e -> e > 0).mapToInt(e -> e).sum();
//        int sum = 0;
//        for (int n : numbers) {
//            if (n > 0) {
//                sum += n;
//            }
//        }
//        return sum;
    }

    public int minDifferenceBetweenNeighbours() {
        int minDifference = numbers.get(0) - numbers.get(1) >= 0 ? numbers.get(0) - numbers.get(1) : numbers.get(1) - numbers.get(0);
        for (int i = 1; i < numbers.size() - 1; i++) {
            int actDifference = numbers.get(i) - numbers.get(i + 1);
            if (Math.abs(actDifference) < minDifference) {
                minDifference = Math.abs(actDifference);
            }
        }
        return minDifference;
    }
}
