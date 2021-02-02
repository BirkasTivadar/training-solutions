package week14d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OnlineShoppingTest {
    @Test
    void loadFile() {
        OnlineShopping on = new OnlineShopping();

        on.loadFile("bevasarlas.txt");

        assertEquals(9, on.getShoppingMap().size());


    }


    @Test
    void search() {
        OnlineShopping on = new OnlineShopping();

        on.loadFile("bevasarlas.txt");

        assertEquals("[corn, hot_dog, rolls]", on.search("A10").toString());


    }

    @Test
    void numberOfProducts() {
        OnlineShopping on = new OnlineShopping();

        on.loadFile("bevasarlas.txt");

        assertEquals(3, on.numberOfProducts("A10"));

    }

    @Test
    void productCounter() {
        OnlineShopping on = new OnlineShopping();

        on.loadFile("bevasarlas.txt");

        assertEquals(2, on.productCounter("tomato"));
    }

    @Test
    void listOfProduct() {
        OnlineShopping on = new OnlineShopping();

        on.loadFile("bevasarlas.txt");

        assertEquals(27, on.listOfProduct().size());



    }

}