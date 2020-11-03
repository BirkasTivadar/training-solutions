package debug.employees;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private List<Employee> company = new ArrayList<>();

    public Company(List<Employee> company) {
        this.company = company;
    }

    public void addEmployee(Employee employee){
        company.add(employee);
    }

    public Employee findEmployeeByName(String name){
        for(Employee employee : company){
            if(name.equals(employee.getName())){
                return employee;
            }
        }
        return null;
    }

    public List<String> listEmployedNames(){
        List<String> employeeNames = new ArrayList<>();
        for(Employee employee : company){
            employeeNames.add(employee.getName());
        }
        return employeeNames;
    }




}
