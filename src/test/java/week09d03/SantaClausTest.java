package week09d03;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SantaClausTest {

    @Test
    void testSanta() {
        Person man = new Person("Joe", 25);
        Person woman = new Person("Jane", 20);
        Person boy = new Person("Johnny", 12);
        Person girl = new Person("Joe", 13);
        SantaClaus santaClaus = new SantaClaus(List.of(man, woman, boy, girl));
    }

}