package week07d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    @Test
    void createVehicleWithoutParamTest() {
        Vehicle vehicle = new Vehicle();
        assertEquals(5, vehicle.getNumberOfGears());
        assertEquals(TransmissionType.MANUAL, vehicle.getTransmissionType());
    }

    @Test
    void createVehicleWithParamTest() {
        Vehicle vehicle = new Vehicle(6, TransmissionType.SEQUENTIAL);
        assertEquals(6, vehicle.getNumberOfGears());
        assertEquals(TransmissionType.SEQUENTIAL, vehicle.getTransmissionType());
    }

}