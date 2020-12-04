package week06d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BiscuitTest {

    @Test
    void testOf() {
        Biscuit pilota = Biscuit.of(BiscuitType.PILOTA, 500);
        assertEquals(pilota.getTpye(), new Biscuit(BiscuitType.PILOTA).getTpye());
    }

    @Test
    void testToString() {
        Biscuit pilota = Biscuit.of(BiscuitType.PILOTA, 500);
        assertEquals("Type: PILOTA, amount: 500 gr", pilota.toString());
    }

@Test
    void testNullType() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, ()-> new Biscuit(null, 300));
        assertEquals("Invalid data.", iae.getMessage());
    }
@Test
    void testMinusAmount() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, ()-> new Biscuit(BiscuitType.OREO, -10));
        assertEquals("Amount must be greater than zero.", iae.getMessage());
    }


}