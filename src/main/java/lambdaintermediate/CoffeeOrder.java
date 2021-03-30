package lambdaintermediate;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CoffeeOrder {

    private List<Coffee> coffeeList;

    private LocalDateTime dateTime;

    public CoffeeOrder(List<Coffee> coffeeList, LocalDateTime dateTime) {
        this.coffeeList = new ArrayList<>(coffeeList);
        this.dateTime = dateTime;
    }

    public List<Coffee> getCoffeeList() {
        return new ArrayList<>(coffeeList);
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
}
