package schoolrecords;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ClassRecords {
    private String className;
    private Random rnd;
    private List<Student> students = new ArrayList<>();

    public ClassRecords(String className, Random rnd) {
        if (isBlank(className)) {
            throw new IllegalArgumentException("Classname must not be empty!");
        }
        this.className = className;
        this.rnd = rnd;
    }

    public String getClassName() {
        return className;
    }

    private boolean isBlank(String string) {
        return string == null || string.isBlank();
    }

    public boolean addStudent(Student student) {
        for (Student studentInClass : students) {
            if (student.getName().equals(studentInClass.getName())) {
                return false;
            }
        }
        students.add(student);
        return true;
    }

    public boolean removeStudent(Student student) {
        boolean isStudent = false;
        Student removeStudent = null;
        for (Student studentInClass : students) {
            if (student.getName().equals(studentInClass.getName())) {
                removeStudent = studentInClass;
                isStudent = true;
            }
        }
        if (isStudent) {
            students.remove(removeStudent);
        }
        return isStudent;
    }

    public double calculateClassAverage() {
        if (students.size() == 0) {
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
        if (students.size() == 0) {
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }
        double sum = 0.0;
        int counter = 0;
        for (Student student : students) {
            if (student.calculateSubjectAverage(subject) > 0) {
                sum += student.calculateSubjectAverage(subject);
                counter++;
            }
        }
        return Math.round(sum / counter * 100) / 100.0;
    }

    public Student findStudentByName(String name) {
        if (isBlank(name)) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        if (students.size() == 0) {
            throw new IllegalStateException("No students to search!");
        }
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        throw new IllegalArgumentException("Student by this name cannot be found! " + name);
    }

    public Student repetition() {
        if (students.size() == 0) {
            throw new IllegalStateException("No students to select for repetition!");
        }
        int studentNumber = rnd.nextInt(students.size());
        return students.get(studentNumber);
    }

    public List<StudyResultByName> listStudyResults() {
        List<StudyResultByName> studyResultByNameList = new ArrayList<>();
        for (Student student : students) {
            studyResultByNameList.add(new StudyResultByName(student.getName(), student.calculateAverage()));
        }
        return studyResultByNameList;
    }

    public String listStudentNames() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Student student : students) {
            stringBuilder.append(student.getName());
            stringBuilder.append(", ");
        }
        stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
        return stringBuilder.toString();
    }

}
