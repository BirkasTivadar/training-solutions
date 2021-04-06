package week11d04;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NameLengthTest {
    @Test
    void getLengths() {
        List<String> names = List.of("Joe", "Jack", "Jane", "Jake", "George", "William");
        NameLength nameLength = new NameLength();
        assertEquals(Arrays.asList(3, 4), nameLength.getLengths(names));
    }

    @Test
    void getLengthsWithEmptyList() {
        List<String> names = new ArrayList<>();
        NameLength nameLength = new NameLength();
        assertEquals(new ArrayList<>(), nameLength.getLengths(names));
    }

    @Test
    void getLengthsWithNull() {
        List<String> names = null;
        NameLength nameLength = new NameLength();
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> nameLength.getLengths(names));
        assertEquals("Names must not be null", iae.getMessage());
    }

}