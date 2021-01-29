package x;

import org.junit.jupiter.api.Test;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {

    @Test
    void testQueue() {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);

        int i = q.element();
        assertEquals(1, i);

        i = q.remove();
        assertEquals(1, i);
        i = q.remove();
        assertEquals(2, i);
        assertEquals(1, q.size());
        i = q.remove();
        assertEquals(3, i);
        assertTrue(q.isEmpty());
    }

    @Test
    void testStack() {
        Deque<Integer> d = new LinkedList<>();
        d.push(3);
        d.push(2);
        d.push(1);
        int i = d.peek();
        assertEquals(3, i);

        i = d.pop();
        assertEquals(3, i);
        i = d.pop();
        assertEquals(2, i);
        i = d.pop();
        assertEquals(1, i);
        assertTrue(d.isEmpty());

    }
}
