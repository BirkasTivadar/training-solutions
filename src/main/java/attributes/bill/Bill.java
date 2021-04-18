package attributes.bill;

import java.util.ArrayList;
import java.util.List;

public class Bill {

    private List<Item> items = new ArrayList<>();

    public List<Item> getItems() {
        return new ArrayList<>(items);
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public double calculateTotalPrice() {
        return items.stream().mapToDouble(e -> e.getPrice() * e.getQuantity()).sum();
//        double sum = 0;
//        for (Item item : items) {
//            double itemTotal = item.getPrice() * item.getQuantity();
//            sum += itemTotal;
//        }
//        return sum;
    }
}
