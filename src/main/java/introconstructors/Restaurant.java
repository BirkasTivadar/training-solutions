package introconstructors;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    List<String> menu = new ArrayList<>();
    String name;
    int capacity;

    public Restaurant(String name, int numberOfTables) {
        this.name = name;
        this.capacity = numberOfTables * 4;
        this.menu = generateMenu();
    }

    private List<String> generateMenu() {
        menu.add("Hamburger");
        menu.add("Cheeseburger");
        menu.add("Big Mac");
        return menu;
    }

    public List<String> getMenu() {
        return menu;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }
}
