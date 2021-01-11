package x;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrainerTest {
    @Test
    void TrainerTestWithInvalidAge(){
        InvalidAgeException iae = assertThrows(InvalidAgeException.class, ()-> new Trainer("Bibo", 17));
        assertEquals("Invalid age by creating a trainer.", iae.getMessage());
    }

}