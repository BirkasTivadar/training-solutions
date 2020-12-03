package methodstructure.pendrives;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PendriveTest {
    @Test
    public void constructorShouldInitialize() {
        Pendrive pendrive = new Pendrive("Datatraveller", 32, 5000);
        assertEquals("Datatraveller", pendrive.getName());
        assertEquals(32, pendrive.getCapacity());
        assertEquals(5000, pendrive.getPrice());
    }

    @Test
    public void risePrice() {
        Pendrive pendrive = new Pendrive("Datatraveller", 32, 5000);

        pendrive.risePrice(10);
        assertEquals(5500, pendrive.getPrice());
    }

    @Test
    public void comparePricePerCapacity() {
        Pendrive pendrive = new Pendrive("Datatraveller", 32, 5000);
        Pendrive pendrive2 = new Pendrive("Kingston", 64, 7000);
        Pendrive pendrive3 = new Pendrive("Datatraveller", 32, 5001);
        assertEquals(1, pendrive.comparePricePercCapacity(pendrive2));
        assertEquals(-1, pendrive2.comparePricePercCapacity(pendrive));
        assertEquals(0, pendrive.comparePricePercCapacity(pendrive));
        assertEquals(-1, pendrive.comparePricePercCapacity(pendrive3));
    }

    @Test
    public void cheaperThan() {
        Pendrive pendrive = new Pendrive("Datatraveller", 32, 5000);
        Pendrive pendrive2 = new Pendrive("Kingston", 64, 7000);
        assertTrue(pendrive.cheaperThen(pendrive2));
        assertFalse(pendrive2.cheaperThen(pendrive));
    }

}