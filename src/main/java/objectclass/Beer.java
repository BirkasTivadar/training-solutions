package objectclass;

public class Beer {
    private String name;
    private int price;

    public Beer(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public boolean equals(Object o) {
        return o instanceof Beer && name.equals(((Beer) o).getName()) && price == ((Beer) o).getPrice();
    }
}
