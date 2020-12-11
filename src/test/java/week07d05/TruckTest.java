package week07d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TruckTest {
    @Test
    void createTruckWithoutParamTest() {
        Truck truck = new Truck();
        assertEquals(5, truck.getNumberOfGears());
        assertEquals(TransmissionType.AUTOMATIC, truck.getTransmissionType());
    }

    @Test
    void createTruckWithParamTest() {
        Truck truck = new Truck(7, TransmissionType.SEQUENTIAL);
        assertEquals(7, truck.getNumberOfGears());
        assertEquals(TransmissionType.SEQUENTIAL, truck.getTransmissionType());
    }
}