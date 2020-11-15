package controladvanced.duplicates;

import controladvanced.duplicates.Duplicates;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DuplicatesTest {

    @Test
    void findDuplicates() {
        assertEquals(Arrays.asList(), new Duplicates().findDuplicates(Arrays.asList(1, 2, 3)));
        assertEquals(Arrays.asList(2), new Duplicates().findDuplicates(Arrays.asList(1, 2, 2, 3)));
        assertEquals(Arrays.asList(2, 3), new Duplicates().findDuplicates(Arrays.asList(1, 2, 2, 3, 3, 4)));
        assertEquals(Arrays.asList(3), new Duplicates().findDuplicates(Arrays.asList(1, 2, 3, 3, 3)));
        assertEquals(Arrays.asList(2, 3, 4), new Duplicates().findDuplicates(Arrays.asList(1, 2, 2, 3, 3, 2, 4, 4, 3)));


    }
}