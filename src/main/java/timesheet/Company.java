package timesheet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Company {
    private final List<Employee> employees;
    private List<Project> projects;

    public Company(InputStream employeesFile, InputStream projectsFile) {
        employees = loadEmployees(employeesFile);
        projects = loadProjects(projectsFile);
    }

    private List<Employee> loadEmployees(InputStream employeesFile) {
        List<Employee> employeeList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(employeesFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fullName = line.split(" ");
                employeeList.add(new Employee(fullName[0], fullName[1]));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read employeesFile.", ioe);
        }
        return employeeList;
    }

    private List<Project> loadProjects(InputStream projectsFile) {
        List<Project> projectList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(projectsFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                projectList.add(new Project(line));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read projectsFile.", ioe);
        }
        return projectList;
    }


}
