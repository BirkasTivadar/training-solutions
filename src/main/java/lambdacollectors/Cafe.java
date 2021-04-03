package lambdacollectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Cafe {

    private List<CoffeeOrder> orders;

    public Cafe(List<CoffeeOrder> orders) {
        this.orders = new ArrayList<>(orders);
    }

    public void add(CoffeeOrder order) {
        orders.add(order);
    }

    public Map<CoffeeType, Long> getCountByCoffeeType() {
        return orders.stream().flatMap(o -> o.getCoffeeList().stream())
                .collect(Collectors.groupingBy(Coffee::getType, Collectors.counting()));
    }

    public double getAverageOrder() {
        return orders.stream().mapToInt(o -> o.getCoffeeList().size()).summaryStatistics().getAverage();
    }
}
