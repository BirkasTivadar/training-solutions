package week08d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathAlgorithmsTest {
    @Test
    void greatestCommonDivisorTest() {
        MathAlgorithms mathAlgorithms = new MathAlgorithms();
        assertEquals(12, mathAlgorithms.greatestCommonDivisor(24,60));
        assertEquals(2, mathAlgorithms.greatestCommonDivisor(8,6));
        assertEquals(9, mathAlgorithms.greatestCommonDivisor(27,36));
    }



}