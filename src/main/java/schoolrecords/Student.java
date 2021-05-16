package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {

    private List<Mark> marks = new ArrayList<>();

    private String name;

    public Student(String name) {
        if (isBlank(name)) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private boolean isBlank(String string) {
        return string == null || string.isBlank();
    }


    public double calculateAverage() {

        double sum = 0.0;

        for (Mark mark : marks) {
            sum += mark.getMarkType().getValue();
        }

        return marks.isEmpty() ? 0 : Math.round(sum / marks.size() * 100) / 100.0;
    }


    public double calculateSubjectAverage(Subject subject) {

        double sum = 0;

        int counter = 0;

        for (Mark mark : marks) {

            if (subject.getSubjectName().equals(mark.getSubject().getSubjectName())) {

                sum += mark.getMarkType().getValue();

                counter++;
            }
        }

        return counter == 0 ? 0 : Math.round(sum / counter * 100) / 100.0;
    }


    public void grading(Mark mark) {

        if (mark == null) {
            throw new NullPointerException("Mark must not be null!");
        }

        marks.add(mark);
    }


    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append(name).append(" marks: ");

        marks.forEach(e -> sb.append(e.getSubject().getSubjectName()).append(": ").append(e.toString()));

        return sb.toString();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
