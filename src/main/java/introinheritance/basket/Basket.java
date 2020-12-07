package introinheritance.basket;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Item> items = new ArrayList<>();

    public List<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(String barcode) {
        Item findItem = null;
        for (Item item : items) {
            if (item.getBarcode().equals(barcode)) {
                findItem = item;
            }
        }
        items.remove(findItem);
    }

    public void clearBasket() {
        items.removeAll(items);
    }
}
