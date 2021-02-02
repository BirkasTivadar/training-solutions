package week06d04.senior;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> items = new ArrayList<>();

    public void addItem(String name, int quantity) {
        for (Item item : items) {
            if (item.getName().equals(name)) {
                item.add(quantity);
                return;
            }
        }
        items.add(new Item(name, quantity));
    }

    public int getItem(String name) {
        for (Item item : items) {
            if (item.getName().equals(name)) {
                return item.getQuantity();
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem("mesa", 3);
        shoppingCart.addItem("sillon", 1);
        shoppingCart.addItem("ordenador", 6);
        shoppingCart.addItem("sillon", 12);

        System.out.println(shoppingCart.getItem("sillon"));
        System.out.println(shoppingCart.getItem("ordenador"));
        System.out.println(shoppingCart.getItem("puerta"));

    }
}
