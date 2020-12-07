package week07d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathAlgorithmsTest {
    MathAlgorithms mathAlgorithms = new MathAlgorithms();

    @Test
    void isPrime2() {
        assertTrue(mathAlgorithms.isPrime(2));
    }

     @Test
    void isPrime1() {
        assertFalse(mathAlgorithms.isPrime(1));
    }
    /*
     @Test
    void isPrime() {
        assertTrue(mathAlgorithms.isPrime(2));
    }
     @Test
    void isPrime() {
        assertTrue(mathAlgorithms.isPrime(2));
    }*/

}