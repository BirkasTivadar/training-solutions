package controlselection.week;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayOfWeeksTest {

    @Test
    void weekMessage() {
        DayOfWeeks dayOfWeeks = new DayOfWeeks();

        assertEquals("hét eleje", dayOfWeeks.weekMessage("hétfő"));
        assertEquals("hét közepe", dayOfWeeks.weekMessage("SZERDA"));
        assertEquals("hét vége", dayOfWeeks.weekMessage("Szombat"));
    }
}