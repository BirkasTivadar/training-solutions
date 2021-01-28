package x;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class ListTest {

    @Test
    void testList(){
        List<String> l = new LinkedList<>();
        l.add("Joe");
        l.add("Jack");
        l.add("John");
        assertTrue(l.equals(Arrays.asList("Joe","Jack","John")));

        Collection<String> c = l;
        c.add("Jane");
        assertTrue(l.equals(Arrays.asList("Joe","Jack","John", "Jane")));
        c.remove("Jack");
        assertTrue(l.equals(Arrays.asList("Joe","John", "Jane")));
        assertFalse(l.isEmpty());
        assertEquals(3, l.size());
        assertTrue(c.contains("John"));
        assertFalse(c.contains("Jack"));
        c.clear();
        assertTrue(l.isEmpty());
    }
}
