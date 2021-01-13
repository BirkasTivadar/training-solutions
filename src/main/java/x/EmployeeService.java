package x;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class EmployeeService {

    public static void main(String[] args) {
        Path file = Path.of("employees.txt");
        List<String> content = null;
        try {
            content = Files.readAllLines(file);
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file", e);
        }
        System.out.println(content);
    }

}
