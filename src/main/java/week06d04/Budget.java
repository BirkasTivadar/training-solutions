package week06d04;

import java.util.ArrayList;
import java.util.List;

public class Budget {
    private List<Item> items = new ArrayList<>();

    public Budget(List<Item> items) {
        this.items = new ArrayList<>(items);
    }

    public List<Item> getItemsByMonth(int month){
        List<Item> itemsByMonth = new ArrayList<>();
        for(Item item : items) {
            if(item.isMonth(month)){
                itemsByMonth.add(item);
            }
        }
        return itemsByMonth;
    }
}
