package week06d02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {

    @Test
    void getProductByCategoryTest() {
        Product bread = new Product("bread", Category.BAKEDGOODS,120);
        Product butter = new Product("butter", Category.DAIRY,100);
        Product baguette = new Product("baguette", Category.BAKEDGOODS,150);
        Product milk = new Product("milk", Category.DAIRY,10);

        Store store = new Store(Arrays.asList(bread, butter, baguette, milk));

        assertEquals(2, store.getProductByCategory(Category.BAKEDGOODS));
    }
}