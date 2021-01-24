package ioprintwriter.salary;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SalaryWriter {

    private List<String> names;

    public SalaryWriter(List<String> names) {
        this.names = new ArrayList<>(names);
    }

    private int salary(String name) {
        if (name.contains("Dr.")) {
            return 500_000;
        } else if (name.contains("Mrs.") || name.contains("Mr.")) {
            return 200_000;
        } else {
            return 100_000;
        }
    }

    public void writeNamesAndSalaries(Path path) {
        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(path))) {
            for (String name : names) {
                writer.print(name);
                writer.print(": ");
                writer.println(salary(name));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write this file: " + path, ioe);
        }
    }
}
