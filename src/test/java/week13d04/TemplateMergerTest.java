package week13d04;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TemplateMergerTest {

    @Test
    void testTemplateMerge(){
        Path file = Path.of("blank.txt");
        Employee john = new Employee("John Doe", 1990);
        Employee jack = new Employee("Jack Doe", 2000);
        List<Employee> employees = new ArrayList<>(Arrays.asList(john, jack));
        TemplateMerger templateMerger = new TemplateMerger();
        System.out.println(templateMerger.merge(file, employees));
    }

}