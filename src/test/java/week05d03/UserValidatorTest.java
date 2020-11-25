package week05d03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTest {

    @Test
    void validateTest() {
        UserValidator userValidator = new UserValidator();
        List<User> users = Arrays.asList(
                new User("Joe", 45),
                new User("Jack", 15),
                new User("Bill", 0),
                new User("Mukaki", 120)
        );
        assertTrue(userValidator.validate(users));
    }

    @Test
    void validateTestEmptyName() {
        UserValidator userValidator = new UserValidator();
        List<User> users = Arrays.asList(
                new User("Joe", 45),
                new User("Jack", 15),
                new User("", 0),
                new User("Mukaki", 120)
        );
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, ()-> userValidator.validate(users));
        assertEquals("Name must not be empty.", iae.getMessage());
    }

   @Test
    void validateTestInvalidAge() {
        UserValidator userValidator = new UserValidator();
        List<User> users = Arrays.asList(
                new User("Joe", 45),
                new User("Jack", 150),
                new User("Bill", 0),
                new User("Mukaki", 120)
        );
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, ()-> userValidator.validate(users));
        assertEquals("Age must be between 0 and 120.", iae.getMessage());
    }


}