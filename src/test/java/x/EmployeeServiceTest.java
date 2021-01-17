package x;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeServiceTest {


    @TempDir
    public File folder;

    @Test
    void testWrite() throws IOException {
        Path file = new File(folder, "employees.txt").toPath();
        System.out.println(file);
        List<String> employees = List.of("John Doe", "Jane Doe", "Jack Doe");
        new EmployeeService().writeEmployeesToFile(employees, file);

        List<String> content = Files.readAllLines(file);
        assertEquals(3, content.size());
        assertEquals("Jane Doe", content.get(1));
    }

}
