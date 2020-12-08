package objectclass;

import introinheritance.basket.Item;

import java.util.ArrayList;
import java.util.List;

public class SimpleBag {
    private final int START = -1;
    private List<Object> items = new ArrayList<>();

    int cursor = START;

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

    public int getCursor() {
        return cursor;
    }

    public void beforeFirst() {
        cursor = START;
    }

    public Object next() {
        return items.get(++cursor);
    }

    public boolean hasNext() {
        return !isEmpty() && cursor < items.size() - 1;
    }

    public static void main(String[] args) {
        SimpleBag bag = new SimpleBag();
        //When
        bag.putItem(new Beer("Heineken", 250));
        bag.putItem(new Book("Rejtő Jenő", "Az ellopott cirkáló"));
        bag.putItem(new Book("Rejtő Jenő", "Az elveszett cirkáló"));
        bag.putItem(new Beer("Borsodi", 239));
        bag.putItem(new Beer("Krusovice", 239));

        System.out.println(bag.next().toString());
        System.out.println(bag.getCursor());
        System.out.println(bag.next().toString());
        System.out.println(bag.getCursor());
        while (bag.hasNext()) {
            System.out.println(bag.next().getClass().toString());
        }
        System.out.println();
       bag.beforeFirst();
        while (bag.hasNext()) {
            System.out.println(bag.next().toString());
            bag.cursor--;
            System.out.println(bag.next().getClass().toString());
            System.out.println(bag.getCursor());
            System.out.println();
        }

    }
}
