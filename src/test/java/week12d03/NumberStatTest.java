package week12d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumberStatTest {

    @Test
    void smallestUniqueTest() {
        List<Integer> numbers = Arrays.asList(2, 3, 4, 2, 4, 4, 3, 7, 8, 3, 8, 5);
        NumberStat numberStat = new NumberStat(numbers);
        assertEquals(5, numberStat.smallestUnique());
    }

    @Test
    void smallestUniqueTestWithWrongList() {
        List<Integer> numbers = Arrays.asList(2, 3, 4, 2, 4, 4, 3, 7, 8, 3, 8, 5, 5, 7);
        NumberStat numberStat = new NumberStat(numbers);
        IllegalStateException ise = assertThrows(IllegalStateException.class, () -> numberStat.smallestUnique());
        assertEquals("Wrong list.", ise.getMessage());
    }

    @Test
    void smallestUniqueTestWithEmptyList() {
        List<Integer> numbers = new ArrayList<>();
        NumberStat numberStat = new NumberStat(numbers);
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> numberStat.smallestUnique());
        assertEquals("List is empty.", iae.getMessage());
    }


}