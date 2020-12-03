package week06d04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import week06d04.Item;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    LocalDate date = LocalDate.of(2017, 12, 22);

    @Test
    void emptyItemNameTest() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> new Item(5000, date, ""));
        assertEquals("Name must be not empty.", iae.getMessage());
    }

    @Test
    void nullItemNameTest() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> new Item(5000, date, null));
        assertEquals("Name must be not empty.", iae.getMessage());
    }

    @Test
    void priceLessThanOneTest() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> new Item(-20, date, "Car"));
        assertEquals("Price must be greater than 0.", iae.getMessage());
    }
}