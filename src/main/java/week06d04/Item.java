package week06d04;

public class Item {
    private int price;
    private int month;

    public int getPrice() {
        return price;
    }

    public int getMonth() {
        return month;
    }

    public String getName() {
        return name;
    }

    private String name;

    public Item(int price, int month, String name) {
        if (price < 1) {
            throw new IllegalArgumentException("Price must be greater than 0.");
        }
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Month must be between 1 and 12.");
        }
        if (isEmpty(name)) {
            throw new IllegalArgumentException("Name must be not empty.");
        }
        this.price = price;
        this.month = month;
        this.name = name;
    }

    public boolean isEmpty(String str) {
        return str == null || str.isBlank();
    }

    public boolean isMonth(int month) {
        return this.month == month;
    }

}
