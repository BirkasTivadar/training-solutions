package week09d03;

import java.util.ArrayList;
import java.util.List;

public class SantaClaus {
    List<Person> persons = new ArrayList<>();

    public SantaClaus(List<Person> persons) {
        this.persons = persons;
    }

    public void getThroughChimneys() {
        for (Person person : persons) {
            if (person.getAge() <= 14) {
                while (person.getPresent() != Present.TOY) {
                    person.setPresent();
                }
            }
        }
    }}
