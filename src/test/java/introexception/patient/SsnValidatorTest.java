package introexception.patient;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SsnValidatorTest {

    @Test
    void testSsnLength() {
        assertFalse(new SsnValidator().isValidSsn("1234"));
    }

    @Test
    void testSsnLetters() {
        assertFalse(new SsnValidator().isValidSsn("abc"));
    }

    @Test
    void testSsnInvalidCrc() {
        assertFalse(new SsnValidator().isValidSsn("123456789"));
    }

    @Test
    void testSsnValidCrc() {
        assertTrue(new SsnValidator().isValidSsn("123456788"));
    }

}