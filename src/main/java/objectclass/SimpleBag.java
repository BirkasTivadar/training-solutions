package objectclass;

import introinheritance.basket.Item;

import java.util.ArrayList;
import java.util.List;

public class SimpleBag {
    private List<Object> items = new ArrayList<>();

    public SimpleBag() {
    }

    public boolean isEmpty() {
        return items.size() > 0 ? false : true;
    }

    public int size() {
        return items.size();
    }

    public void putItem(Object item) {
        items.add(item);
    }

    public boolean contains(Object item) {
        return items.contains(item);
    }
}
