package week07d03;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class NumberListTest {
    @Test
    void numberListIsNull() {
        NumberList numberList = new NumberList();
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> numberList.isIncreasing(null));
        assertEquals("List is null.", iae.getMessage());
    }

    @Test
    void numberListTest() {
        NumberList numberList = new NumberList();
        assertTrue(numberList.isIncreasing(Arrays.asList(1, 2, 2, 3, 3, 5)));
        assertTrue(numberList.isIncreasing(Arrays.asList(1)));
        assertTrue(numberList.isIncreasing(Arrays.asList(1, 1, 1, 1)));
        assertFalse(numberList.isIncreasing(Arrays.asList(1, 3, 2, 5)));
    }


}