package controlselection.month;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayInMonthTest {

    @Test
    void dayNumber() {
        DayInMonth dayInMonth = new DayInMonth();

        assertEquals(28, dayInMonth.dayNumber(1800, "február"));
        assertEquals(29, dayInMonth.dayNumber(1804, "február"));
        assertEquals(29, dayInMonth.dayNumber(1600, "február"));
        assertEquals(28, dayInMonth.dayNumber(1983, "február"));
        assertEquals(31, dayInMonth.dayNumber(1980, "Május"));
        assertEquals(30, dayInMonth.dayNumber(1960, "SZEPTEMBER"));
    }
}