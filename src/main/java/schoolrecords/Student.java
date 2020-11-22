package schoolrecords;

import java.util.ArrayList;
import java.util.List;

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

    public void grading(Mark mark) {
        if (mark == null) {
            throw new NullPointerException("Mark must not be null!");
        }
        marks.add(mark);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(name + " marks: ");
        for (int i = 0; i < marks.size(); i++) {
            stringBuilder.append(marks.get(i).getSubject().getSubjectName());
            stringBuilder.append(": ");
            stringBuilder.append(marks.get(i).toString());

        }
        return stringBuilder.toString();
    }

    public double calculateAverage() {
        double sum = 0.0;
        for (Mark mark : marks) {
            sum += mark.getMarkType().getValue();
        }
        return Math.round(sum / marks.size() * 100) / 100.0;
    }

    public double calculateSubjectAverage(Subject subject) {
        double sum = 0.0;
        int counter = 0;
        for (Mark mark : marks) {
            if (subject.getSubjectName().equals(mark.getSubject().getSubjectName())) {
                sum += mark.getMarkType().getValue();
                counter++;
            }
        }
        return Math.round(sum / counter * 100) / 100.0;
    }

}
