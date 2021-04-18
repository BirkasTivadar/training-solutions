package debug.employees;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Company {

    private List<Employee> employees;

    public Company(List<Employee> employees) {
        this.employees = new ArrayList<>(employees);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public Employee findEmployeeByName(String name) {
        for (Employee employee : employees) {
            if (name.equals(employee.getName())) {
                return employee;
            }
        }
        throw new IllegalArgumentException("Wrong name");
    }

    public List<String> listEmployedNames() {
        return employees.stream().map(Employee::getName).collect(Collectors.toList());
//        List<String> employeeNames = new ArrayList<>();
//        for (Employee employee : employees) {
//            employeeNames.add(employee.getName());
//        }
//        return employeeNames;
    }
}
