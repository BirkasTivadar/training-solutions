package interfaces.simplethread;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SimpleThreadTest {
    @Test
    void runWithNullTasks() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> new SimpleThread(null));
        assertEquals("Tasks must not be null.", iae.getMessage());
    }

    @Test
    public void runWithEmptyTasks() {
        List<String> tasks = new ArrayList<>();
        SimpleThread simpleThread = new SimpleThread(tasks);
        assertEquals(0, simpleThread.getTasks().size());

        simpleThread.run();

        assertEquals(0, simpleThread.getTasks().size());
    }

    @Test
    public void runWithTasks() {
        List<String> tasks = new ArrayList<>();
        tasks.add("sut");
        tasks.add("foz");
        tasks.add("takarit");
        SimpleThread simpleThread = new SimpleThread(tasks);
        assertEquals(tasks.size(), simpleThread.getTasks().size());

        simpleThread.run();

        assertEquals(0, simpleThread.getTasks().size());
    }


}