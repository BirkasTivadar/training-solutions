package x;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ListTest {

    @Test
    void testList(){
        List<String> l = new ArrayList<>();
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
