package week06d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BiscuitTest {

    @Test
    void of() {
        Biscuit pilota = Biscuit.of(BiscuitType.PILOTA, 500);
        assertEquals(pilota.getType(), new Biscuit(BiscuitType.PILOTA).getType());
    }

    @Test
    void testToString() {
    }
}