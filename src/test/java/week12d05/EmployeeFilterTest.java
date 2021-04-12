package week12d05;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeFilterTest {

    @Test
    void testCountSeniorDevs() {
        EmployeeFilter employeeFilter = new EmployeeFilter();

        List<Employee> employees = Arrays.asList(
                new Employee(25, 4, "John", Arrays.asList("java", "programming")),
                new Employee(28, 2, "Jack", Arrays.asList("python", "programming")),
                new Employee(35, 3, "Jane", Arrays.asList("c++", "programming")),
                new Employee(25, 4, "Joe", Arrays.asList("java", "python"))
        );
        assertEquals(2, employeeFilter.countSeniorDevs(employees).size());
        assertEquals("John", employeeFilter.countSeniorDevs(employees).get(0).getName());
    }

}