package immutable.satellite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SatelliteTest {

    @Test
    void emptyParameterShouldThrowException() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> new Satellite(new CelestialCoordinates(12, 23, 45), ""));
        assertEquals("Register ident must not be empty!", iae.getMessage());
    }

    @Test
    void modifyDestination() {
        Satellite satellite = new Satellite(new CelestialCoordinates(12, 23, 45), "ASD567");
        satellite.modifyDestination(new CelestialCoordinates(2, 2, 2));
        assertEquals("ASD567: CelestialCoordinates: x=14, y=25, z=47", satellite.toString());
    }

}