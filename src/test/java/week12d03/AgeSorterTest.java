package week12d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgeSorterTest {

    @Test
    void testSortAgesWithNull() {
        int[] ages = null;

        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> new AgeSorter().sortAges(ages));
        assertEquals("Ages must not be null.", iae.getMessage());
    }

    @Test
    void testSortAges() {
        int[] ages = {24, 56, 45, 33, 72, 2};
        int[] result = {2, 24, 33, 45, 56, 72};

        assertArrayEquals(result, new AgeSorter().sortAges(ages));
    }


}