package week06d04.senior;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {

    @Test
    void testShoppingCart(){
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem("mesa", 3);
        shoppingCart.addItem("sillon", 1);
        shoppingCart.addItem("ordenador", 6);
        shoppingCart.addItem("sillon", 12);

        assertEquals(13,shoppingCart.getItem("sillon"));
        assertEquals(6,shoppingCart.getItem("ordenador"));
        assertEquals(0,shoppingCart.getItem("puerta"));
    }

}