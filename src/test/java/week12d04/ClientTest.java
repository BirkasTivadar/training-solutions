package week12d04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    @Test
    void testCreateClientwithNull() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> new Client(null, "1234"));
        assertEquals("Both parameter must not be null or empty.", iae.getMessage());
    }

    @Test
    void testCreateClientwithEmptyString() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> new Client("John Doe", " "));
        assertEquals("Both parameter must not be null or empty.", iae.getMessage());
    }

    @Test
    void testCreateClient() {
        Client client = new Client("John Doe", "1234");
        assertEquals("John Doe", client.getName());
        assertEquals("1234", client.getRegNumber());
    }


}