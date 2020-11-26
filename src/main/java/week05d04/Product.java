package week05d04;

import java.time.LocalDate;

public class Product {
    private String nameProduct;
    private LocalDate expired;

    public Product(String nameProduct, int year, int month, int day) {
        this.nameProduct = nameProduct;
        this.expired = LocalDate.of(year, month, day);
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public LocalDate getExpired() {
        return expired;
    }
}
