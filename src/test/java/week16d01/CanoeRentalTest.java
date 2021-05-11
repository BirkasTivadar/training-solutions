package week16d01;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class CanoeRentalTest {

    @Test
    void testCreateCanoeRental() {

        CanoeRental redCanoe = new CanoeRental("Red", CanoeType.RED, LocalDateTime.of(2021, 05, 11, 8, 0));

        assertEquals("Red", redCanoe.getName());
        assertEquals(CanoeType.RED, redCanoe.getCanoeType());
        assertEquals(LocalDateTime.of(2021, 05, 11, 8, 0), redCanoe.getStartTime());
    }

    @Test
    void testSetEndTime() {

        CanoeRental redCanoe = new CanoeRental("Red", CanoeType.RED, LocalDateTime.of(2021, 05, 11, 8, 0));
        CanoeRental greenCanoe = new CanoeRental("Green", CanoeType.GREEN, LocalDateTime.of(2021, 05, 11, 9, 30));

        redCanoe.setEndTime(LocalDateTime.of(2021, 05, 11, 9, 30));

        assertEquals(LocalDateTime.of(2021, 05, 11, 9, 30), redCanoe.getEndTime());
        assertEquals(null, greenCanoe.getEndTime());

    }

    @Test
    void calculateRentalSum() {
        CanoeRental redCanoe = new CanoeRental("Red", CanoeType.RED, LocalDateTime.of(2021, 05, 11, 8, 0));
        CanoeRental greenCanoe = new CanoeRental("Green", CanoeType.GREEN, LocalDateTime.of(2021, 05, 11, 9, 30));
        CanoeRental blueCanoe = new CanoeRental("Blue", CanoeType.BLUE, LocalDateTime.of(2021, 05, 11, 10, 20));

        assertEquals(5000, redCanoe.calculateRentalSum());
        assertEquals(6000, greenCanoe.calculateRentalSum());
        assertEquals(7500, blueCanoe.calculateRentalSum());
    }


}
