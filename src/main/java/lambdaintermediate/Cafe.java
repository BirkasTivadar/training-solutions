package lambdaintermediate;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Cafe {

    private List<CoffeeOrder> orders;

    public Cafe(List<CoffeeOrder> orders) {
        this.orders = new ArrayList<>(orders);
    }

    public List<CoffeeOrder> getOrders() {
        return new ArrayList<>(orders);
    }

    public void add(CoffeeOrder coffeeOrder) {
        orders.add(coffeeOrder);
    }

    public BigDecimal getTotalIncome() {
        return getOrders().stream()
                .flatMap(c -> c.getCoffeeList().stream())
                .map(p -> p.getPrice())
                .reduce(BigDecimal.ZERO, (i, p) -> i.add(p), (tp1, tp2) -> tp1.add(tp2)).setScale(2, RoundingMode.HALF_UP);
//        BigDecimal sum = new BigDecimal("0");
//        for (CoffeeOrder order : orders) {
//            for (Coffee coffee : order.getCoffees()) {
//               sum =  sum.add(coffee.getPrice()).setScale(2, RoundingMode.HALF_UP);
//            }
//        }
//        return sum;
    }

    public List<CoffeeOrder> getFirstFiveOrder(LocalDate date) {
        return getOrders().stream().filter(o -> o.getDateTime().toLocalDate().equals(date))
                .sorted(Comparator.comparing(o -> o.getDateTime().toLocalTime()))
                .limit(5).collect(Collectors.toList());
    }

    public List<CoffeeOrder> getOrdersAfter(LocalDateTime from) {
        return getOrders().stream().filter(o -> o.getDateTime().isAfter(from)).collect(Collectors.toList());
    }

    public BigDecimal getTotalIncome(LocalDate date) {
        return getOrders().stream().filter(o -> o.getDateTime().toLocalDate().equals(date))
                .flatMap(c -> c.getCoffeeList().stream())
                .map(p -> p.getPrice())
                .reduce(BigDecimal.ZERO, (i, p) -> i.add(p), (tp1, tp2) -> tp1.add(tp2)).setScale(2, RoundingMode.HALF_UP);

    }

    public long getNumberOfCoffee(CoffeeType type) {
        return getOrders().stream().flatMap(c -> c.getCoffeeList().stream()).filter(c -> c.getType() == type).count();

    }
}
