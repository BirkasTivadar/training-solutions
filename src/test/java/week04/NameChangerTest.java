package week04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameChangerTest {

    @Test
    void getFullName() {

    }

    @Test
    void changeFirstName() {
        NameChanger nameChanger = new NameChanger("Doe John");
        assertEquals("Doe Jack", nameChanger.changeFirstName("Jack"));

    }
}