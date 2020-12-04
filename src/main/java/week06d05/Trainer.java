package week06d05;

import java.util.ArrayList;
import java.util.List;

public class Trainer {

    private String name;
    private int age;

    private List<String> courses = new ArrayList<>();


    public Trainer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void addCourses(String course, int index) {
        courses.add(index, course);
    }

    public void addCourses(int index, String course) {
        courses.add(index, course);
    }

    public void addCourses(String course) {
        courses.add(course);
    }

    public static void main(String[] args) {
        Trainer trainer = new TrainerBuilder()
                .withName("Bibi")
                .withAge(20)
                .build();

        trainer.addCourses("java");
        trainer.addCourses("python");
        trainer.addCourses("c++");
        trainer.addCourses("pascal");
        System.out.println(trainer.getCourses().toString());
        trainer.addCourses(2, "c#");
        System.out.println(trainer.getCourses().toString());
        trainer.addCourses("basic", 1);
        System.out.println(trainer.getCourses().toString());

    }

}
