package x;

import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class SetTest {

    @Test
    void testSet() {
        Set<Trainer> s = new HashSet<>();
        Collection<Trainer> c = s;
        c.add(new Trainer("Alma"));
        c.add(new Trainer("Alma"));
        c.add(new Trainer("Körte"));

        assertEquals(2, s.size());
        System.out.println(s.toString());
    }

    @Test
    void testSetOrder() {
        Set<Trainer> s = new LinkedHashSet<>();
        Collection<Trainer> c = s;
        c.add(new Trainer("Jack"));
        c.add(new Trainer("Jane"));
        c.add(new Trainer("Jack"));

        System.out.println(s.toString());

        for (Trainer t : s) {
            System.out.println(t.getName());
        }
    }

}
