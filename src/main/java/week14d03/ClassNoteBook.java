package week14d03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ClassNoteBook {

    private List<Student> studentList = new ArrayList<>();

    public List<Student> sortNoteBook() {
        List<Student> result = new ArrayList<>(studentList);
        Collections.sort(result, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        return result;
    }
}
