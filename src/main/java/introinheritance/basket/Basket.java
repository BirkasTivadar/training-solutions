package introinheritance.basket;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private List<Item> items = new ArrayList<>();

    public List<Item> getItems() {
        return List.copyOf(items);
    }

    public void addItem(Item item){
        if(item == null){
            throw new IllegalArgumentException("Item must be not null.");
        }
        items.add(item);
    }

    public void removeItem(String barcode){
        if(barcode == null || barcode.isBlank()){
            throw new IllegalArgumentException("Barcode must not be empty.");
        }
        Item removeItem = null;
        for(Item item: items){
            if(item.getBarcode().equals(barcode)){
                removeItem = item;
            }
        }
        items.remove(removeItem);
    }

    public void clearBasket(){
        items.clear();
    }
}
