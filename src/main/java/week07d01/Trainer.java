package week07d01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Trainer extends Human {

    private List<String> courses = new ArrayList<>();

    public Trainer(List<String> courses) {
        this.courses = courses;
    }

    public static void main(String[] args) {
        Trainer trainer = new Trainer(Arrays.asList("java", "python"));
        Human human = new Trainer(Arrays.asList("java"));

        trainer.setAge(25);
        trainer.setName("Bibi");

        System.out.println(trainer.getName());
        System.out.println(trainer.getAge());
        System.out.println(trainer.courses.get(1));
        System.out.println(human.getAge());
    }




}
