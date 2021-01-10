package week10d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void findMinMaxSumWithEmpty() {
        Calculator calculator = new Calculator();
        int[] arr = new int[0];
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> calculator.findMinMaxSum(arr));
        assertEquals("Empty array.", iae.getMessage());
    }

    @Test
    void findMinMaxSumLessFour() {
        Calculator calculator = new Calculator();
        int[] arr = new int[]{1, 3, 5};
        assertEquals(9, calculator.findMinMaxSum(arr).getMin());
        assertEquals(9, calculator.findMinMaxSum(arr).getMax());
    }

    @Test
    void findMinMaxSum() {
        Calculator calculator = new Calculator();
        int[] arr = new int[]{1, 3, 5, 7, 9};
        assertEquals(16, calculator.findMinMaxSum(arr).getMin());
        assertEquals(24, calculator.findMinMaxSum(arr).getMax());
    }


}