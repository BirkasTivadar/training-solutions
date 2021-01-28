package week13d04;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class TemplateMerger {

    public String merge(Path file, List<Employee> employees) {

        String sablon;
        try (BufferedReader reader = Files.newBufferedReader(file)) {
            sablon = reader.readLine();
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read.", ioe);
        }
        return createString(sablon, employees);
    }

    private String createString(String sablon, List<Employee> employees) {
        StringBuilder str = new StringBuilder();
        for (Employee employee : employees) {
            String name = employee.getName();
            String year = String.valueOf(employee.getYear());
            String employeeString = sablon.replace("{nev}", name).replace("{ev}", year);
            str.append(employeeString).append("\n");
        }
        return str.toString();
    }
}
