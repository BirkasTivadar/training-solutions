package x;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.*;

public class CollectionsTest {
    @Test
    void testCollections() {
        List<Integer> elements = new ArrayList<>();
        elements.add(1);
        elements.add(2);
        List<Integer> l = Collections.unmodifiableList(elements);
        assertEquals(Arrays.asList(1, 2), l);

        elements.add(3);
        assertEquals(Arrays.asList(1, 2, 3), l);
    }

    @Test
    void testReverse() {
        List<Integer> l = Arrays.asList(1, 2, 3, 4);
        Collections.reverse(l);
        assertEquals(Arrays.asList(4, 3, 2, 1), l);
    }

    @Test
    void testShuffle() {
        List<Integer> l = Arrays.asList(1, 2, 3, 4);
        Random rnd = new Random(5);
        Collections.shuffle(l, rnd);

        assertEquals(Arrays.asList(4, 1, 2, 3), l);
    }
}
