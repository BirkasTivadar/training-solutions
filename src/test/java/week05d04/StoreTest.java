package week05d04;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {

    @Test
    void addProductTest() {
        Store store = new Store();
        store.addProduct(new Product("milk", 2020, 12, 5));
        store.addProduct(new Product("bread", 2020, 11, 5));
        store.addProduct(new Product("vine", 2022, 10, 1));
        store.addProduct(new Product("cheese", 2020, 11, 23));
        store.addProduct(new Product("vine", 2021, 1, 15));
        assertEquals(2, store.products.size());

    }

    @Test
    void getNumberOfExpiredTest() {
        List<Product> products = Arrays.asList(
                new Product("milk", 2020, 12, 5),
                new Product("bread", 2020, 11, 5),
                new Product("vine", 2022, 10, 1),
                new Product("cheese", 2020, 11, 23)
        );
        Store store = new Store(products);
        assertEquals(2, store.getNumberOfExpired());
    }
}