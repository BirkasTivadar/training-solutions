package ioreader.grades;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SchoolRecordsManager {

    List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public void readGradesFromFile(String file) {
        Path path = Path.of(file);
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String name = line.substring(0, line.indexOf(" "));
                String gradesString = line.substring(line.indexOf(" ") + 1);
                List<Integer> grades = gradesToList(gradesString);
                students.add(new Student(name, grades));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file.", ioe);
        }
    }

    private List<Integer> gradesToList(String gradesString) {
        List<Integer> grades = new ArrayList<>();
        String[] gradesArray = gradesString.split(" ");
        for (String grade : gradesArray) {
            grades.add(Integer.parseInt(grade));
        }
        return grades;
    }

    public double classAverage() {
        double sum = 0;
        for (Student student : students) {
            sum += student.average();
        }
        return sum / students.size();
    }
}
