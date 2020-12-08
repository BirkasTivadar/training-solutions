package objectclass;

public class Beer {
    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Beer(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
