package stringconcat.employee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void testCreate() {
        Employee employee = new Employee("Kis Géza", "minőségellenőr", 520000);

        assertEquals("Kis Géza", employee.getName());
        assertEquals("minőségellenőr", employee.getJob());
        assertEquals(520000, employee.getSalary());
    }

    @Test
    void testCreateWithEmptyName() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Employee("", "minőségellenőr", 520000));
        assertEquals("Name must not be empty.", ex.getMessage());
    }

    @Test
    void testCreateWithNullJob() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Employee("Kis Géza", null, 520000));
        assertEquals("Job must not be empty.", ex.getMessage());
    }

    @Test
    void testCreateWithNegativeSalary() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Employee("Kis Géza", "minőségellenőr", -520000));
        assertEquals("Salary must be positive.", ex.getMessage());
    }

    @Test
    void testToString() {
        Employee employee = new Employee("Kis Géza", "minőségellenőr", 520000);

        assertEquals("Kis Géza - minőségellenőr - 520000 Ft", employee.toString());
    }
}