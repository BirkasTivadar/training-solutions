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
        for (int i = 0; i < students.size(); i++) {
            if (student.getName().equals(students.get(i).getName())) {
                students.remove(i);
                return true;
            }
        }
        return false;
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

    public Student findStudentByName(String name){
        if(isBlank(name)){
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        if(students.size() == 0){
            throw new IllegalStateException("No students to search!");
        }
        for(Student student : students){
            if(student.getName().equals(name)){
                return student;
            }
        }
        throw new IllegalArgumentException("Student by this name cannot be found! " + name);
    }




/*

    public static void main(String[] args) {
        ClassRecords classRecords;
        Tutor tutor = new Tutor("Nagy Csilla",
                Arrays.asList(new Subject("földrajz"),
                        new Subject("matematika"),
                        new Subject("biológia"),
                        new Subject("zene"),
                        new Subject("fizika"),
                        new Subject("kémia")));
        classRecords = new ClassRecords("Fourth Grade A", new Random(5));
        Student firstStudent = new Student("Kovács Rita");
        Student secondStudent = new Student("Nagy Béla");
        Student thirdStudent = new Student("Varga Márton");
        firstStudent.grading(new Mark(MarkType.A, new Subject("földrajz"), tutor));
        firstStudent.grading(new Mark(MarkType.C, new Subject("matematika"), tutor));
        firstStudent.grading(new Mark(MarkType.D, new Subject("földrajz"), tutor));
        secondStudent.grading(new Mark(MarkType.A, new Subject("biológia"), tutor));
        secondStudent.grading(new Mark(MarkType.C, new Subject("matematika"), tutor));
        secondStudent.grading(new Mark(MarkType.D, new Subject("zene"), tutor));
        thirdStudent.grading(new Mark(MarkType.A, new Subject("fizika"), tutor));
        thirdStudent.grading(new Mark(MarkType.C, new Subject("kémia"), tutor));
        thirdStudent.grading(new Mark(MarkType.D, new Subject("földrajz"), tutor));
        classRecords.addStudent(firstStudent);
        classRecords.addStudent(secondStudent);
        classRecords.addStudent(thirdStudent);

        System.out.println(firstStudent.toString());
        System.out.println(classRecords.students.toString());
        classRecords.addStudent(new Student("Kovács Rita"));
        System.out.println(classRecords.students.toString());
        classRecords.addStudent(new Student("Kovács Béla"));
        System.out.println(classRecords.students.toString());
        classRecords.removeStudent(new Student("Nagy Béla"));
        System.out.println(classRecords.students.toString());
        classRecords.removeStudent(new Student("Kovács Béla"));
        System.out.println(classRecords.students.toString());
        System.out.println(classRecords.calculateClassAverage());
        System.out.println(classRecords.calculateClassAverageBySubject(new Subject("földrajz")));

    }*/
}
