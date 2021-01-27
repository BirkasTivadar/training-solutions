package x;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GenericUsageTest {

    @Test
    void testGenericUsage() {

        List<String> l = new ArrayList();
        l.add("John Doe");
        l.add("Jane Doe");
        assertEquals("John Doe", l.get(0));

        List<String> l2 = new ArrayList<>();
        Collection<String> c = l2;
    }

}