package week06d02;

import java.util.ArrayList;
import java.util.List;

public class Store {
    List<Product> products = new ArrayList<>();

    public int getProductByCategory(Category category) {
        int db = 0;
        for (Product product : products){
            if(product.getCategory() == category){
                db++;
            }
        }
        return db;
    }
}

