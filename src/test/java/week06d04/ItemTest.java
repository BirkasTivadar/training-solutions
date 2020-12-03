package week06d04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {
    @Test
    void emptyItemNameTest() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> new Item(5000, 10, ""));
        assertEquals("Name must be not empty.", iae.getMessage());
    }

    @Test
    void nullItemNameTest() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> new Item(5000, 10, null));
        assertEquals("Name must be not empty.", iae.getMessage());
    }

    @Test
    void priceLessThanZeroTest() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> new Item(-20, 10, "Car"));
        assertEquals("Price must be greater than 0.", iae.getMessage());
    }

    @Test
    void monthLessThanOneTest() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> new Item(200, 0, "Car"));
        assertEquals("Month must be between 1 and 12.", iae.getMessage());
    }

    @Test
    void monthGreaterThanTwelveTest() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> new Item(200, 15, "Car"));
        assertEquals("Month must be between 1 and 12.", iae.getMessage());
    }

}