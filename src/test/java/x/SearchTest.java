package x;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;


import static org.junit.jupiter.api.Assertions.*;

public class SearchTest {

    @Test
    void testArraySearch() {
        int[] i = {1, 3, 5, 6, 7, 9, 12, 4};
        Arrays.sort(i);
        assertEquals(3, Arrays.binarySearch(i, 5));
        assertEquals(-9, Arrays.binarySearch(i, 15));
    }

    @Test
    void testListSearch() {
        List<Integer> i = Arrays.asList(1, 3, 5, 6, 7, 9, 12, 4);
        Collections.sort(i);
        assertEquals(4, Collections.binarySearch(i, 6));

        assertTrue(i.contains(6));
        assertFalse(i.contains(16));

        assertTrue(i.containsAll(Arrays.asList(1, 7)));
        assertFalse(i.containsAll(Arrays.asList(1, 17)));

        assertEquals(4, i.indexOf(6));
        assertEquals(-1, i.indexOf(16));

        assertEquals(1, Collections.min(i));
        assertEquals(12, Collections.max(i));

        List<Trainer> trainers = Arrays.asList(
                new Trainer("John", 3),
                new Trainer("Jack", 2),
                new Trainer("Jane", 1)
        );
        assertEquals("Jack", Collections.min(trainers).getName());  // Trainer.class-ban a compareTo name-re rendez

        assertEquals("Jane", Collections.min(trainers,
                new Comparator<Trainer>() {
                    @Override
                    public int compare(Trainer o1, Trainer o2) {
                        return o1.getSalary() - o2.getSalary();
                    }
                }
        ).getName());

    }
}
