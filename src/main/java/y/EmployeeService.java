package y;

import java.util.List;
import java.util.function.Predicate;


public class EmployeeService {

    public Employee findFirst(List<Employee> employees, Predicate<Employee> condition) {
        for (Employee employee : employees) {
            if (condition.test(employee)) {
                return employee;
            }
        }
        throw new IllegalArgumentException("Employee not found.");
    }

    public void printHello(List<Employee> employees, PrintHello printHello) {
        for (Employee employee : employees) {
            System.out.println(printHello.print(employee));
        }
    }
}

