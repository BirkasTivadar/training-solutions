package defaultconstructor.date;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleDateTest {

    @Test
    public void incorrectParameterShouldThrowExceptionNotALeapYear() throws IllegalArgumentException {
        SimpleDate sd = new SimpleDate();
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> sd.setDate(1914, 2, 29));
        assertEquals("One or more given parameter cannot be applied!", iae.getMessage());
    }

    @Test
    public void incorrectParameterShouldThrowExceptionDayIncorrect() throws IllegalArgumentException {
        // Given
        SimpleDate sd = new SimpleDate();
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> sd.setDate(2000, 4, 31));
        assertEquals("One or more given parameter cannot be applied!", iae.getMessage());
    }

    @Test
    public void incorrectParameterShouldThrowExceptionYearIncorrect() throws IllegalArgumentException {
        // Given
        SimpleDate sd = new SimpleDate();
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> sd.setDate(1848, 3, 15));
        assertEquals("One or more given parameter cannot be applied!", iae.getMessage());
    }

    @Test
    public void incorrectParameterShouldThrowExceptionMonthIncorrect() throws IllegalArgumentException {
        // Given
        SimpleDate sd = new SimpleDate();
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> sd.setDate(2014, 13, 15));
        assertEquals("One or more given parameter cannot be applied!", iae.getMessage());
    }

    @Test
    public void testSetDate() {
        SimpleDate date = new SimpleDate();
        date.setDate(2016, 2, 29);
        assertEquals(2016, date.getYear());
        assertEquals(2, date.getMonth());
        assertEquals(29, date.getDay());
    }

}