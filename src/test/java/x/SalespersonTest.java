package x;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalespersonTest {
    @Test
    public void testCreateSalesperson() {
        Salesperson salesperson = new Salesperson("Jack", 1500);
        assertEquals("Jack", salesperson.getName());
        assertEquals(1500, salesperson.getAmount());
    }

}