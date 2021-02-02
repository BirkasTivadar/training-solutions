package week06d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BottleTest {

    @Test
    void testBottle() {
        Bottle bottle = Bottle.of(BottleType.PET_BOTTLE);

        assertEquals(BottleType.PET_BOTTLE, bottle.getType());

        bottle.fill(34);
        assertEquals(66, bottle.getFilledUntil());
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> bottle.fill(70));
        assertEquals("Fillamount is too much.", iae.getMessage());
    }


}