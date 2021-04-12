package week12d04;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientsTest {
    private Clients clients = new Clients();

    @BeforeEach
    void init() {
        clients.add(
                new Client("John", "1234"),
                new Client("Jack", "1114"),
                new Client("Jane", "1212"),
                new Client("Joe", "7834")
        );
    }

    @AfterEach
    void destroyClients() {
        clients = null;
    }

    @Test
    void testFindByRegNumber() {
        assertEquals("Jane", clients.findByRegNumber("1212").getName());
        assertEquals("Joe", clients.findByRegNumber("7834").getName());
    }

    @Test
    void testFindByName() {
        assertEquals(2, clients.findByName("Jo").size());
        assertEquals(1, clients.findByName("an").size());
        assertEquals(0, clients.findByName("jo").size());
    }
}