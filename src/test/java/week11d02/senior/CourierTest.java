package week11d02.senior;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CourierTest {

    @Test
    void testGetFirstRide() {
        Courier courier = new Courier();
        courier.loadRides("rides.txt");
        assertEquals(2, courier.getFirstRide().getDay());
        assertEquals(1, courier.getFirstRide().getRideId());
        assertEquals(3.4, courier.getFirstRide().getKm());
    }

    @Test
    void testGetNoWorkDays() {
        Courier courier = new Courier();
        courier.loadRides("rides.txt");
        assertEquals(Arrays.asList(1, 3, 6, 7), courier.getNoWorkDays());
    }

    @Test
    void testGetKmByDays() {
        Courier courier = new Courier();
        courier.loadRides("rides.txt");
        assertEquals(11, courier.getKmByDays().get(5));
        assertEquals(20.5, courier.getKmByDays().get(2));
    }
}