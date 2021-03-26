package y;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeServiceTest {

    @Test
    void testFindFirst() {
        List<Employee> employees = Arrays.asList(
                new Employee("Lili"),
                new Employee("Bá"),
                new Employee("Marci"),
                new Employee("Lóri")
        );

        Employee result = new EmployeeService().findFirst(employees, employee -> employee.getName().startsWith("Li"));

        assertEquals("Lili", result.getName());

    }

    @Test
    void testPrintHello() {
        List<Employee> employees = Arrays.asList(
                new Employee("Lili"),
                new Employee("Bá"),
                new Employee("Marci"),
                new Employee("Lóri")
        );

        new EmployeeService().printHello(employees, employee -> "Hello ".concat(employee.getName()));

    }

}
