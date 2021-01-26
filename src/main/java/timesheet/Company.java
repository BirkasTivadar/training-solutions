package timesheet;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Company {
    private final List<Employee> employees;
    private List<Project> projects;
    private List<TimeSheetItem> timeSheetItems = new ArrayList<>();

    public Company(InputStream employeesFile, InputStream projectsFile) {
        employees = loadEmployees(employeesFile);
        projects = loadProjects(projectsFile);
    }

    public List<Employee> getEmployees() {
        return new ArrayList<>(employees);
    }

    public List<Project> getProjects() {
        return new ArrayList<>(projects);
    }

    private List<TimeSheetItem> validTimeSheets(String name, int year, int month) {
        List<TimeSheetItem> result = new ArrayList<>();
        for (TimeSheetItem timeSheetItem : timeSheetItems) {
            if (timeSheetItem.getEmployee().getName().equals(name) &&
                    timeSheetItem.getBeginDate().getYear() == year &&
                    timeSheetItem.getBeginDate().getMonthValue() == month) {
                result.add(timeSheetItem);
            }
        }
        return result;
    }

    private boolean isInvalidName(String name) {
        if (name.split(" ").length == 2) {
            return false;
        }
        return true;
    }

    private String sumProject(String name, int year, int month) {
        int sumResult = 0;
        StringBuilder str = new StringBuilder();
        List<ReportLine> reportLines = calculateProjectByNameYearMonth(name, year, month);
        for (ReportLine reportLine : reportLines) {
            if (reportLine.getTime() > 0) {
                str.append(reportLine.getProject().getName()).append("\t").append(reportLine.getTime()).append("\n");
            }
            sumResult += reportLine.getTime();
        }
        return sumResult + "\n" + str.toString();
    }

    public String createStringTofile(String name, int year, int month) {
        String sumProject = sumProject(name, year, month);
        StringBuilder str = new StringBuilder();
        str.append(name).append("\t").append(year).append("-").append(String.format("%02d", month)).append("\t").append(sumProject);
        return str.toString();
    }

    public void printToFile(String name, int year, int month, Path fileName) {
        String fileContent = createStringTofile(name, year, month);
        try (BufferedWriter writer = Files.newBufferedWriter(fileName)) {
            writer.write(fileContent);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write", ioe);
        }
    }

    public List<ReportLine> calculateProjectByNameYearMonth(String name, int year, int month) {
        if (isInvalidName(name)) {
            throw new IllegalArgumentException();
        }
        List<ReportLine> result = new ArrayList<>();
        for (Project project : projects) {
            result.add(new ReportLine(project, 0));
        }
        List<TimeSheetItem> validTImeSheetsList = validTimeSheets(name, year, month);
        for (TimeSheetItem timeSheetItem : validTImeSheetsList) {
            for (ReportLine reportLine : result) {
                if (timeSheetItem.getProject().getName().equals(reportLine.getProject().getName())) {
                    reportLine.addTime(timeSheetItem.hoursBetweenDates());
                }
            }
        }
        return result;
    }

    public void addTimeSheetItem(Employee employee, Project project, LocalDateTime begin, LocalDateTime end) {
        timeSheetItems.add(new TimeSheetItem(employee, project, begin, end));
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
