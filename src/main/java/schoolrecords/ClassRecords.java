package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {

    private String className;

    private Random rnd;

    private List<Student> students = new ArrayList<>();


    public ClassRecords(String className, Random rnd) {
        if (isEmpty(className)) {
            throw new IllegalArgumentException("Classname must not be empty!");
        }
        this.className = className;
        this.rnd = rnd;
    }

    private boolean isEmpty(String string) {
        return string == null || string.isBlank();
    }

    public String getClassName() {
        return className;
    }

    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }

    public boolean addStudent(Student student) {

        for (Student studentInClass : students) {

            if (student.equals(studentInClass)) {
                return false;
            }
        }

        students.add(student);
        return true;
    }


    public double calculateClassAverage() {

        if (students.isEmpty()) {
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }

        double sum = 0.0;

        for (Student student : students) {

            if (student.calculateAverage() == 0) {
                throw new ArithmeticException("No marks present, average calculation aborted!");
            }

            sum += student.calculateAverage();
        }

        return Math.round(sum / students.size() * 100) / 100.0;
    }


    public double calculateClassAverageBySubject(Subject subject) {

        if (students.isEmpty()) {
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }

        double average = students.stream().filter(e -> e.calculateSubjectAverage(subject) > 0).mapToDouble(e -> e.calculateSubjectAverage(subject)).average().getAsDouble();

        return Math.round(average * 100) / 100.0;
    }


    public Student findStudentByName(String name) {

        if (isEmpty(name)) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }

        if (students.isEmpty()) {
            throw new IllegalStateException("No students to search!");
        }

        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }

        throw new IllegalArgumentException("Student by this name cannot be found! " + name);
    }


    public String listStudentNames() {

        StringBuilder sb = new StringBuilder();

        students.forEach(e -> sb.append(e.getName()).append(", "));

        sb.delete(sb.length() - 2, sb.length());

        return sb.toString();
    }


    public List<StudyResultByName> listStudyResults() {

        List<StudyResultByName> studyResultByNameList = new ArrayList<>();

        students.forEach(e -> studyResultByNameList.add(new StudyResultByName(e.calculateAverage(), e.getName())));

        return studyResultByNameList;
    }


    public boolean removeStudent(Student student) {

        boolean result = students.contains(student);

        if (result) {
            students.remove(student);
        }

        return result;
    }


    public Student repetition() {

        if (students.isEmpty()) {
            throw new IllegalStateException("No students to select for repetition!");
        }

        int studentNumber = rnd.nextInt(students.size());

        return students.get(studentNumber);
    }
}
