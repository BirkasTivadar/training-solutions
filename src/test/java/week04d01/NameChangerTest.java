package week04d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameChangerTest {

    @Test
    void getFullName() {

        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> new NameChanger(("")));
        assertEquals("Invalid Name: ", iae.getMessage());
    }

    @Test
    void changeFirstName() {
        NameChanger nameChanger = new NameChanger("Doe John");
        assertEquals("Doe Jack", nameChanger.changeFirstName("Jack"));

    }
    @Test
    void isTheSameTest(){
        NameChanger nameChanger = new NameChanger("Doe John");

        assertEquals(true, nameChanger.isTheSame("Doe John"));
        assertTrue(nameChanger.isTheSame("Doe John"));
    }
}