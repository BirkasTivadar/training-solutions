package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialCalculatorTest {

    @Test
    void simplestCase() {
        FactorialCalculator factorialCalculator = new FactorialCalculator();
        assertEquals(1, factorialCalculator.getFactorial(1));
    }

    @Test
    void greaterNumber() {
        FactorialCalculator factorialCalculator = new FactorialCalculator();
        assertEquals(120, factorialCalculator.getFactorial(5));
    }

}