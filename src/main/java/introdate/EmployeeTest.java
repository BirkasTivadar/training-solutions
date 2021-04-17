package introdate;

import java.util.Scanner;

public class EmployeeTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Az új kolléga neve?");
        String newEmployeeName = scanner.nextLine();

        System.out.println("Az új kolléga születési éve?");
        int newEmployeeYear = scanner.nextInt();

        System.out.println("Az új kolléga születési hónapja?");
        int newEmployeeMonth = scanner.nextInt();

        System.out.println("Az új kolléga születési napja?");
        int newEmployeeDay = scanner.nextInt();

        Employee employee = new Employee(newEmployeeYear, newEmployeeMonth, newEmployeeDay, newEmployeeName);

        System.out.println("Az új kolléga neve: " + employee.getName());

        System.out.println("Az új kolléga születési dátuma: " + employee.getDateOfBirth());

        System.out.println("Az új kolléga munkába állásának időpontja: " + employee.getBeginEmployment());

    }
}
