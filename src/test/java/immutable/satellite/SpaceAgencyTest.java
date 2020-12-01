package immutable.satellite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpaceAgencyTest {

    @Test
    void nullParameterShouldThrowException() {
        NullPointerException npe = assertThrows(NullPointerException.class, () -> new SpaceAgency().registerSatellite(null));
        assertEquals("Parameter must not be null!", npe.getMessage());
    }

    @Test
    void testRegisterSatellite() {
        SpaceAgency spaceAgency = new SpaceAgency();
        spaceAgency.registerSatellite((new Satellite(new CelestialCoordinates(12, 23, 45), "ASD345")));
        spaceAgency.registerSatellite((new Satellite(new CelestialCoordinates(22, 33, 44), "QWE789")));
        assertEquals("[ASD345: CelestialCoordinates: x=12, y=23, z=45, QWE789: CelestialCoordinates: x=22, y=33, z=44]", spaceAgency.toString());
    }

    @Test
    void testNotFoundSatelliteByRegisterIdent() {
        SpaceAgency spaceAgency = new SpaceAgency();
        spaceAgency.registerSatellite((new Satellite(new CelestialCoordinates(12, 23, 45), "ASD345")));
        spaceAgency.registerSatellite((new Satellite(new CelestialCoordinates(22, 33, 44), "QWE789")));
        assertEquals("QWE789: CelestialCoordinates: x=22, y=33, z=44", spaceAgency.findSatelliteByRegisterIdent("QWE789").toString());
    }


}
