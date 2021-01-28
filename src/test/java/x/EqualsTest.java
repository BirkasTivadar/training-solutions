package x;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EqualsTest {

    @Test
    void testEquals() {

        Trainer trainer = new Trainer("John Doe", 2000);
        Trainer trainer2 = new Trainer("John Doe", 1990);
        assertFalse(trainer.equals(trainer2));

        Trainer trainer3 = new Trainer("John Doe", 2000);
        assertTrue(trainer.equals(trainer3));

        List<Integer> l = Arrays.asList(1, 2, 3);
        List<Integer> l2 = Arrays.asList(1, 2, 3);
        assertTrue(l.equals(l2));
    }

    @Test
    void testHashCode(){
        Trainer trainer = new Trainer("John Doe", 2000);
        Trainer trainer2 = new Trainer("John Doe", 2000);
        assertFalse(trainer == trainer2);
        assertTrue(trainer.equals(trainer2));
        assertTrue(trainer.hashCode() == trainer2.hashCode());

    }

}