package intromethods.employee;

public class EmployeeMain {

    public static void main(String[] args) {
        Employee employee = new Employee("Lali", 1980, 340_000);
        System.out.println(employee.toString());
        System.out.println();

        employee.raiseSalary(10000);
        System.out.println(employee.toString());
    }
}
