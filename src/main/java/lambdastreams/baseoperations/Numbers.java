package lambdastreams.baseoperations;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers {

    private List<Integer> numbers;

    public Numbers(List<Integer> numbers) {
        this.numbers = new ArrayList<>(numbers);
    }

    public Optional<Integer> min() {
        return numbers.stream().min(Comparator.comparingInt(n -> n));
    }

    public int sum() {
        return numbers.stream().reduce(0, Integer::sum, (i1, i2) -> i1 + i2);
    }

    public Set<Integer> getDistinctElements() {
        return numbers.stream().collect(Collectors.toSet());
    }

    public boolean isAllPositive() {
        return numbers.stream().allMatch(e -> e >= 0);
    }
}
