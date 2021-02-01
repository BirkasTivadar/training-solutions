package week06d02;

import java.util.*;
import java.util.concurrent.Callable;

public class StoreSenior {

    private List<Product> products = new ArrayList<>();

    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }

    public StoreSenior(List<Product> products) {
        this.products = products;
    }

    public Map<Category, Integer> getProductsByCategory() {
        Map<Category, Integer> result = new HashMap<>();
        for (Category category : Category.values()) {
            int temp = getProductByOneCategory(category);
            result.put(category, temp);
        }
        return result;
    }


    private int getProductByOneCategory(Category category) {
        int db = 0;
        for (Product product : products) {
            if (product.getCategory() == category) {
                db++;
            }
        }
        return db;
    }

    public static void main(String[] args) {
        Product bread = new Product("bread", Category.BAKEDGOODS, 120);
        Product butter = new Product("butter", Category.DAIRY, 100);
        Product baguette = new Product("baguette", Category.BAKEDGOODS, 150);
        Product milk = new Product("milk", Category.DAIRY, 10);
        Product sugar = new Product("sugar", Category.OTHER, 20);

        StoreSenior storeSenior = new StoreSenior(Arrays.asList(bread, butter, baguette, milk, sugar));
        System.out.println(storeSenior.getProductsByCategory());
    }
}
