package week05d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void getFullNameTest() {
        User user = new User("Kiss", "Tamás", "kt@gmail.com");
        assertEquals("Kiss Tamás", user.getFullName());
    }

    @Test
    void isEmailTestArroba() {
        // User user = new User("Kiss", "Tamás", "ktgmail.com");
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> new User("Kiss", "Tamás", "ktgmail.com"));
        assertEquals("Email must be contain '@' and '.'", iae.getMessage());
    }

    @Test
    void isEmailTestPoint() {
        // User user = new User("Kiss", "Tamás", "ktgmail.com");
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> new User("Kiss", "Tamás", "kt@gmailcom"));
        assertEquals("Email must be contain '@' and '.'", iae.getMessage());
    }

}