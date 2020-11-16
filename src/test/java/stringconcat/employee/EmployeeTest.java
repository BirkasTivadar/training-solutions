package stringconcat.employee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void testToString() {
        Employee kissGeza = new Employee("Kiss Géza", "minőségellenőr", 152000);

        assertEquals("Kiss Géza - minőségellenőr - 152000 Ft", kissGeza.toString());

    }

    @Test
    void getDatas() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> new Employee("john", "doctor", 123456));
        assertEquals("Invalid salary: 123456", iae.getMessage());
    }
}