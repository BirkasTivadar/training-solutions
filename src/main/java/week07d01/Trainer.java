package week07d01;

import java.util.ArrayList;
import java.util.List;

public class Trainer {

    public static void tryChangeValues(int yearOfBirth, String name, List<String> courses) {
        yearOfBirth = 1970;
        name = "John";
        courses.add("Java");
    }

    public static void main(String[] args) {


        List<String> courses = new ArrayList<>();
        int originalYearOfBirth = 1980;
        String originalName = "Jack";

        tryChangeValues(originalYearOfBirth, originalName, courses);
        System.out.println(originalYearOfBirth);
        System.out.println(originalName);
        System.out.println(courses.toString());
    }

}
