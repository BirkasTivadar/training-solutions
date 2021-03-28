package ycomparator;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeServiceTest {

    private List<Employee> employees = Collections.unmodifiableList(Arrays.asList(
            new Employee("John Doe", 180_000, null),
            new Employee("Jane Doe", 200_000, "bbb-123"),
            new Employee("Joe Doe", 100_000, null),
            new Employee("John Smith", 100_000, "aaa-123")
    ));

    private EmployeeService employeeService = new EmployeeService();

    @Test
    void testSortByName() {
        List<Employee> sorted = employeeService.sortByName(new ArrayList<>(this.employees));

        assertEquals(Arrays.asList("Jane Doe", "Joe Doe", "John Doe", "John Smith"), toNames(sorted));
    }

    @Test
    void testSortBySalaryThanName() {
        List<Employee> sorted = employeeService.sortBySalaryThanName(new ArrayList<>(this.employees));

        assertEquals(Arrays.asList("Joe Doe", "John Smith", "John Doe", "Jane Doe"), toNames(sorted));
    }

    @Test
    void testSortByCardNumberNullsFirst() {
        List<Employee> sorted = employeeService.sortByCardNumberNullsFirst(new ArrayList<>(this.employees));
        assertEquals(Arrays.asList("Joe Doe", "John Doe", "John Smith", "Jane Doe"), toNames(sorted));
    }

    @Test
    void testSortByNameReversed() {
        List<Employee> sorted = employeeService.sortByNameReversed(new ArrayList<>(this.employees));

        assertEquals(Arrays.asList("John Smith", "John Doe", "Joe Doe", "Jane Doe"), toNames(sorted));
    }

    private List<String> toNames(List<Employee> employees) {
        List<String> names = new ArrayList<>();
        for (Employee employee : employees) {
            names.add(employee.getName());
        }
        return names;
    }
}