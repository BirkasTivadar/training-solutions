package week08d03.senior;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringListsTest {

    @Test
    void testShortestWordsWithNull() {
        List<String> strings = null;
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> new StringLists().shortestWords(strings));
        assertEquals("Words must not be null.", iae.getMessage());
    }

    @Test
    void testShortestWords() {
        List<String> strings = Arrays.asList("aaa", "aa", "bb", "cccc", "dd");
        assertEquals(Arrays.asList("aa", "bb", "dd"), new StringLists().shortestWords(strings));
    }

    @Test
    void testShortestWordsWithEmptyList() {
        List<String> strings = new ArrayList<>();
        assertEquals(Collections.EMPTY_LIST, new StringLists().shortestWords(strings));
    }


}