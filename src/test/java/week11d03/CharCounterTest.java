package week11d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharCounterTest {

    @Test
    void testCountChars() {
        String[] chars = {"abc", "cba", "ab"};
        String[] chars2 = {"abc", "cba", "abc", "daecfb", "dartcggfb"};
        CharCounter charCounter = new CharCounter();
        assertEquals(2, charCounter.countChars(chars));
        assertEquals(3, charCounter.countChars(chars2));
    }

    @Test
    void testCountCharsWithEmptyString() {
        String[] chars = {""};
        CharCounter charCounter = new CharCounter();
        assertEquals(0, charCounter.countChars(chars));
    }

    @Test
    void testCountCharsWithEmptyArray() {
        String[] chars = {};
        CharCounter charCounter = new CharCounter();
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> charCounter.countChars(chars));
        assertEquals("Chars must not be empty", iae.getMessage());
    }

    @Test
    void testCountCharsWithNull() {
        String[] chars = null;
        CharCounter charCounter = new CharCounter();
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> charCounter.countChars(chars));
        assertEquals("Chars must not be empty", iae.getMessage());
    }


}