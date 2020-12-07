package week07d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathAlgorithmsTest {
    MathAlgorithms mathAlgorithms = new MathAlgorithms();

    @Test
    void isPrimeMinus() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> mathAlgorithms.isPrime(-2));
        assertEquals("Number must be greater than zero.", iae.getMessage());

    }

    @Test
    void isPrimeZero() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> mathAlgorithms.isPrime(0));
        assertEquals("Number must be greater than zero.", iae.getMessage());

    }

    @Test
    void isPrime2() {
        assertTrue(mathAlgorithms.isPrime(2));
    }

    @Test
    void isPrime1() {
        assertFalse(mathAlgorithms.isPrime(1));
    }

    @Test
    void isPrime13() {
        assertTrue(mathAlgorithms.isPrime(13));
    }

    @Test
    void isPrime31() {
        assertTrue(mathAlgorithms.isPrime(31));
    }

    @Test
    void isPrime10() {
        assertFalse(mathAlgorithms.isPrime(10));
    }

    @Test
    void isPrime21() {
        assertFalse(mathAlgorithms.isPrime(21));
    }

    @Test
    void isPrime150() {
        assertFalse(mathAlgorithms.isPrime(150));
    }

}