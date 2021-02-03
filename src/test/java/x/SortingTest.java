package x;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class SortingTest {

    @Test
    void testSortArray() {
        int[] i = {3, 1, 6, 9, 5, 3};
        Arrays.sort(i);
        int[] j = {1, 3, 3, 5, 6, 9};
        assertArrayEquals(j, i);
    }

    @Test
    void testSortList() {
        List<Integer> i = Arrays.asList(3, 1, 6, 9, 5, 3);
        Collections.sort(i);
        System.out.println(i);
        assertEquals(Arrays.asList(1, 3, 3, 5, 6, 9), i);
        i.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
    }

    @Test
    void testSortListWithComparator() {
        List<Integer> i = Arrays.asList(3, 1, 6, 9, 5, 3);
        i.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println(i);
        assertEquals(Arrays.asList(1, 3, 3, 5, 6, 9), i);
    }

    @Test
    void testSet() {
        Set<Trainer> s = new TreeSet<>(new Comparator<Trainer>() {
            @Override
            public int compare(Trainer o1, Trainer o2) {
                return o1.getSalary() - o2.getSalary();
            }
        });
        s.add(new Trainer("Jack", 3));
        s.add(new Trainer("Joe", 2));
        s.add(new Trainer("Jane", 1));

        System.out.println(s);
    }


}
