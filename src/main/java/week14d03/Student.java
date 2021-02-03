package week14d03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {

    private String name;

    private Map<String , List<Integer>> marks = new HashMap<>();

    public Student(String name) {
        this.name = name;
    }

    public void addMark(String subject, int mark){
        if(!marks.containsKey(subject)){
            marks.put(subject, new ArrayList<>());
        }
            marks.get(subject).add(mark);
    }

    public String getName() {
        return name;
    }

    public Map<String, List<Integer>> getMarks() {
        return marks;
    }

    public static void main(String[] args) {
        Student john = new Student("John");
        john.addMark("math", 3);
        john.addMark("literature", 2);
        john.addMark("math", 3);
        System.out.println(john.getMarks());
    }
}
