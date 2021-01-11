package week11d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionFinderTest {

    @Test
    void findDivisors() {
        DivisionFinder divisionFinder = new DivisionFinder();
        assertEquals(1, divisionFinder.findDivisors(425));
        assertEquals(1, divisionFinder.findDivisors(4025));
        assertEquals(2, divisionFinder.findDivisors(45025));
        assertEquals(0, divisionFinder.findDivisors(29));
    }
}