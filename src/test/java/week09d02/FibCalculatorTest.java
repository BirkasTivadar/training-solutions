package week09d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibCalculatorTest {
    @Test
    void sumEvensTest(){
        FibCalculator fibCalculator = new FibCalculator();
        assertEquals(0, fibCalculator.sumEvens(1));
        assertEquals(2, fibCalculator.sumEvens(8));
        assertEquals(188, fibCalculator.sumEvens(500));
    }


}