package consctructoroverloading.bus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleTimeTest {
    @Test
    public void constructorTest2Parameters() {
        SimpleTime time = new SimpleTime(15, 16);
        assertEquals(15, time.getHours());
        assertEquals(16, time.getMinutes());
    }

    @Test
    public void constructorTest1Parameter() {
        SimpleTime time = new SimpleTime(15);
        assertEquals(15, time.getHours());
        assertEquals(0, time.getMinutes());
    }

    @Test
    public void constructorTestSimpleTimeParameter() {
        SimpleTime time = new SimpleTime(new SimpleTime(15, 16));
        assertEquals(15, time.getHours());
        assertEquals(16, time.getMinutes());
    }

    @Test
    public void differenceAfter() {
        SimpleTime time = new SimpleTime(new SimpleTime(15, 16));
        SimpleTime anotherTime = new SimpleTime(new SimpleTime(14, 10));
        assertEquals(66, time.difference(anotherTime));
    }

    @Test
    public void differenceIfEqual() {
        SimpleTime time = new SimpleTime(new SimpleTime(15, 16));
        SimpleTime anotherTime = new SimpleTime(new SimpleTime(15, 16));
        assertEquals(0, time.difference(anotherTime));
    }

    @Test
    public void differenceEarlier() {
        SimpleTime time = new SimpleTime(new SimpleTime(15, 16));
        SimpleTime anotherTime = new SimpleTime(new SimpleTime(17, 26));
        assertEquals(-130, time.difference(anotherTime));
    }

    @Test
    public void toStringTest() {
        SimpleTime time = new SimpleTime(new SimpleTime(15, 16));
        assertEquals("15:16", time.toString());
    }
}