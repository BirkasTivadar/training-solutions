package week06d04;

import java.time.LocalDate;

public class Item {
    private int price;
    private LocalDate buyDate;

    public int getPrice() {
        return price;
    }

    public LocalDate getBuyDate() {
        return buyDate;
    }


    public String getName() {
        return name;
    }

    private String name;

    public Item(int price, LocalDate buyDate, String name) {
        if (price < 1) {
            throw new IllegalArgumentException("Price must be greater than 0.");
        }
        if (isEmpty(name)) {
            throw new IllegalArgumentException("Name must be not empty.");
        }
        this.price = price;
        this.buyDate = buyDate;
        this.name = name;
    }

    public boolean isEmpty(String str) {
        return str == null || str.isBlank();
    }

    public boolean isMonth(LocalDate date) {
        return this.buyDate.getMonth() == date.getMonth();
    }

}
