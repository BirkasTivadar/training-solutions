package week09d03;

import java.util.Random;

public class Person {
    private String name;
    private int age;
    private Present present;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Present getPresent() {
        return present;
    }

    public void setPresent() {
        Random rnd = new Random();
        int i = rnd.nextInt(4);
        System.out.println(i);
        present = Present.values()[i];
    }

    public static void main(String[] args) {
    }


}
