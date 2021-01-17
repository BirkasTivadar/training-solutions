package x;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class EmployeeService {

    public void writeEmployeesToFile(List<String> employees, Path file) {
        try (BufferedWriter writer = Files.newBufferedWriter(file)) {
            for (String employee : employees) {
                writer.write(employee + "\n");
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write", ioe);
        }
    }
}
