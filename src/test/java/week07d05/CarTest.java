package week07d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    void createCarWithoutParamTest() {
        Car car = new Car();
        assertEquals(5, car.getNumberOfGears());
        assertEquals(TransmissionType.AUTOMATIC, car.getTransmissionType());
    }

    @Test
    void createCarWithParamTest() {
        Car car = new Car(6, TransmissionType.MANUAL);
        assertEquals(6, car.getNumberOfGears());
        assertEquals(TransmissionType.MANUAL, car.getTransmissionType());
    }

}