package week06d01;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ListSelectorTest {

    @Test
    void concatEvenIndexElementsTest() {
        ListSelector listSelector = new ListSelector();

        assertEquals("[almakörte]", listSelector.concatEvenIndexElements(Arrays.asList("alma","b")));
    }
}