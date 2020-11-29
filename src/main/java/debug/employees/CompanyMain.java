package debug.employees;

import java.util.ArrayList;

public class CompanyMain {

    public static void main(String[] args) {
        Employee worker = new Employee("Lajos", 1980);
        Employee accountant = new Employee("Piroska", 1999);
        Employee secretary = new Employee("Gizike", 2001);
        Employee director = new Employee("Ferenc", 1973);

        Company company = new Company(new ArrayList<>());
        company.addEmployee(worker);
        company.addEmployee(accountant);
        company.addEmployee(secretary);
        company.addEmployee(director);

        System.out.println(company.listEmployedNames());

    }
}
