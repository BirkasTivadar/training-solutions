package week11d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PairFinderTest {

    @Test
    void testFindPairs() {
        int[] smallArray = {5, 1, 4, 5};
        int[] largeArray = {7, 1, 5, 7, 3, 3, 5, 7, 6, 7};
        int[] empty = {};
        assertEquals(1, new PairFinder().findPairs(smallArray));
        assertEquals(4, new PairFinder().findPairs(largeArray));
        assertEquals(0, new PairFinder().findPairs(empty));
    }
}