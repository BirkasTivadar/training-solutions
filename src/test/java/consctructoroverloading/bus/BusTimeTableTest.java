package consctructoroverloading.bus;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BusTimeTableTest {
    private static final List<consctructoroverloading.bus.SimpleTime> TIME_TABLE = Arrays.asList(
            new consctructoroverloading.bus.SimpleTime(9, 15),
            new consctructoroverloading.bus.SimpleTime(12, 45),
            new consctructoroverloading.bus.SimpleTime(14, 15),
            new consctructoroverloading.bus.SimpleTime(16, 15),
            new consctructoroverloading.bus.SimpleTime(18, 15)
    );

    private static final List<consctructoroverloading.bus.SimpleTime> NEW_TIME_TABLE = Arrays.asList(
            new consctructoroverloading.bus.SimpleTime(10, 20),
            new consctructoroverloading.bus.SimpleTime(9, 15),
            new consctructoroverloading.bus.SimpleTime(12, 45),
            new consctructoroverloading.bus.SimpleTime(14, 15),
            new consctructoroverloading.bus.SimpleTime(16, 15),
            new consctructoroverloading.bus.SimpleTime(18, 15)
    );

    @Test
    public void constructorTestList() {
        consctructoroverloading.bus.BusTimeTable timetable = new consctructoroverloading.bus.BusTimeTable(TIME_TABLE);
        assertEquals(5, timetable.getTimeTable().size());
        assertEquals(9, timetable.getTimeTable().get(0).getHours());
        assertEquals(15, timetable.getTimeTable().get(4).getMinutes());
    }

    @Test
    public void constructorTestHours() {
        consctructoroverloading.bus.BusTimeTable timetable = new consctructoroverloading.bus.BusTimeTable(14, 16, 30);
        assertEquals(3, timetable.getTimeTable().size());
        assertEquals(14, timetable.getTimeTable().get(0).getHours());
        assertEquals(30, timetable.getTimeTable().get(0).getMinutes());
        assertEquals(16, timetable.getTimeTable().get(2).getHours());
    }

    @Test
    public void testNextBus() {
        consctructoroverloading.bus.BusTimeTable timetable = new consctructoroverloading.bus.BusTimeTable(TIME_TABLE);
        assertEquals("14:15", timetable.nextBus(new consctructoroverloading.bus.SimpleTime(13, 15)).toString());
    }

    @Test
    public void nextBusShouldThrowExceptionIfNone() throws IllegalStateException {
        consctructoroverloading.bus.BusTimeTable timetable = new consctructoroverloading.bus.BusTimeTable(TIME_TABLE);
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> timetable.nextBus(new SimpleTime(18, 16)));
        assertEquals("No more buses today!", iae.getMessage());
    }

    @Test
    public void testFisttBus() {
        consctructoroverloading.bus.BusTimeTable timetable = new BusTimeTable(NEW_TIME_TABLE);
        assertEquals("9:15", timetable.firstBus().toString());
    }
}
