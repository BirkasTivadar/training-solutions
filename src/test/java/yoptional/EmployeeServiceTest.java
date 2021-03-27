package yoptional;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeServiceTest {

    @Test
    void testFindFirst() {
        List<Employee> employees =
                Arrays.asList(
                        new Employee("John Doe"),
                        new Employee("Jane Doe"),
                        new Employee("Jack Doe")
                );

        Optional<Employee> result = new EmployeeService().findFirst(employees, e -> e.getName().startsWith("Jane"));

        assertTrue(result.isPresent());
        assertEquals("Jane Doe", result.get().getName());
    }

    @Test
    void testNotFound() {
        List<Employee> employees =
                Arrays.asList(
                        new Employee("John Doe"),
                        new Employee("Jane Doe"),
                        new Employee("Jack Doe")
                );

        new EmployeeService().findFirst(employees,
                e -> e.getName().startsWith("Joe")).orElseThrow(() -> new IllegalArgumentException("Not Found"));

    }

    @Test
    void testDefault() {
        List<Employee> employees =
                Arrays.asList(
                        new Employee("John Doe"),
                        new Employee("Jane Doe"),
                        new Employee("Jack Doe")
                );

        Employee result = new EmployeeService().findFirst(employees, e -> e.getName().startsWith("Joe")).orElse(new Employee("Bibi"));

        assertEquals("Bibi", result.getName());
    }

    @Test
    void testDefaultWithLambda() {
        List<Employee> employees =
                Arrays.asList(
                        new Employee("John Doe"),
                        new Employee("Jane Doe"),
                        new Employee("Jack Doe")
                );

        Employee result = new EmployeeService().findFirst(employees, e -> e.getName().startsWith("Joe")).orElseGet(() -> new Employee("Bibi"));

        assertEquals("Bibi", result.getName());
    }

}