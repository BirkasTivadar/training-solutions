package week07d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathAlgorithmsTest {


    @Test
    void isPrimeMinus() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> MathAlgorithms.isPrime(-2));
        assertEquals("Number must be greater than zero.", iae.getMessage());

    }

    @Test
    void isPrimeZero() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> MathAlgorithms.isPrime(0));
        assertEquals("Number must be greater than zero.", iae.getMessage());

    }

    @Test
    void isPrime2() {
        assertTrue(MathAlgorithms.isPrime(2));
        assertTrue(MathAlgorithms.isPrime(31));
        assertTrue(MathAlgorithms.isPrime(13));
        assertTrue(MathAlgorithms.isPrime(71));
    }



}