package week11d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourierTest {

    @Test
    void addWrongRideWrongTest() {
        Courier courier = new Courier();
        Ride ride = new Ride(1, 2, 23);

        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> courier.addRide(ride));
        assertEquals("Wrong ride.", iae.getMessage());
    }

    @Test
    void addWrongRideWrongTest2() {
        Courier courier = new Courier();
        Ride ride = new Ride(1, 1, 23);
        Ride ride2 = new Ride(1, 3, 23);
        courier.addRide(ride);

        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> courier.addRide(ride2));
        assertEquals("Wrong ride.", iae.getMessage());
    }

    @Test
    void addWrongRideWrongTest3() {
        Courier courier = new Courier();
        Ride ride = new Ride(1, 1, 23);
        Ride ride2 = new Ride(3, 1, 23);
        Ride ride3 = new Ride(2, 1, 23);
        courier.addRide(ride);
        courier.addRide(ride2);

        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> courier.addRide(ride3));
        assertEquals("Wrong ride.", iae.getMessage());
    }

    @Test
    void addWrongRideWrongTest4() {
        Courier courier = new Courier();
        Ride ride = new Ride(1, 1, 23);
        Ride ride2 = new Ride(3, 1, 23);
        Ride ride3 = new Ride(4, 2, 23);
        courier.addRide(ride);
        courier.addRide(ride2);

        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> courier.addRide(ride3));
        assertEquals("Wrong ride.", iae.getMessage());
    }

    @Test
    void checkDaysTest() {
        Courier courier = new Courier();
        Ride ride = new Ride(1, 1, 23);
        Ride ride2 = new Ride(3, 1, 23);
        Ride ride3 = new Ride(4, 1, 23);
        courier.addRide(ride);
        courier.addRide(ride2);
        courier.addRide(ride3);

        assertEquals(2, courier.checkDays());
    }

    @Test
    void checkDaysTest2() {
        Courier courier = new Courier();
        Ride ride = new Ride(1, 1, 23);
        Ride ride2 = new Ride(2, 1, 23);
        Ride ride3 = new Ride(3, 1, 23);
        courier.addRide(ride);
        courier.addRide(ride2);
        courier.addRide(ride3);

        assertEquals(4, courier.checkDays());
    }

}