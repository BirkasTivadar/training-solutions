package ycomparator;

import java.util.*;

public class EmployeeService {

    public List<Employee> sortByName(List<Employee> employees) {
        employees.sort(Comparator.comparing(Employee::getName));
        return employees;
    }

    public List<Employee> sortBySalaryThanName(List<Employee> employees) {
        employees.sort(Comparator.comparingInt(Employee::getSalary).thenComparing(Employee::getName));
        return employees;
    }

    public List<Employee> sortByCardNumberNullsFirst(List<Employee> employees) {
        employees.sort(Comparator.comparing(Employee::getCardNumber, Comparator.nullsFirst(Comparator.naturalOrder())).thenComparing(Employee::getName));
        return employees;
    }

    public List<Employee> sortByNameReversed(List<Employee> employees) {
        employees.sort(Comparator.comparing(Employee::getName).reversed());
        return employees;
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John Doe", 180_000, null),
                new Employee("Jane Doe", 200_000, "bbb-123"),
                new Employee("Joe Doe", 100_000, null),
                new Employee("John Smith", 100_000, "aaa-123")
        );

        EmployeeService employeeService = new EmployeeService();
        employeeService.sortBySalaryThanName(employees);
        System.out.println(employees);
    }
}
