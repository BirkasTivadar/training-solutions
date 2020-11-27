package week05d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void getFullNameTest() {
        User user = new User("Kiss", "Tamás", "kt@gmail.com");
        assertEquals("Kiss Tamás", user.getFullName());
    }

    void isEmailTest() {
        User user = new User("Kiss", "Tamás", "kt@gmail.com");
        assertEquals();
    }
}