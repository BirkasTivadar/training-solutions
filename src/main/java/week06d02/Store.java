package week06d02;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> products = new ArrayList<>();

    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }

    public Store(List<Product> products) {
        this.products = products;
    }

    public int getProductByCategory(Category category) {
        int db = 0;
        for (Product product : products) {
            if (product.getCategory() == category) {
                db++;
            }
        }
        return db;
    }
}

