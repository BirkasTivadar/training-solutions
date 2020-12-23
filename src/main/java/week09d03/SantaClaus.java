package week09d03;

import java.util.ArrayList;
import java.util.List;

public class SantaClaus {
    List<Person> people = new ArrayList<>();

    public SantaClaus(List<Person> people) {
        this.people = List.copyOf(people);
    }

    public List<Person> getPeople() {
        return people;
    }

    public void getThroughChimneys() {
        for (Person person : people) {
            person.setPresent();
            if (person.getAge() >= 14) {
                while (person.getPresent() == Present.TOY) {
                    person.setPresent();
                }
            }
        }
    }


    public static void main(String[] args) {
        Person man = new Person("Joe", 25);
        Person woman = new Person("Jane", 20);
        Person boy = new Person("Johnny", 12);
        Person girl = new Person("Noemi", 13);
        SantaClaus santaClaus = new SantaClaus(List.of(man, woman, boy, girl));
        santaClaus.getThroughChimneys();

        for(Person person: santaClaus.getPeople()){
            System.out.println(person.getName());
            System.out.println(person.getAge());
            System.out.println(person.getPresent());
            System.out.println();
        }
    }
}
