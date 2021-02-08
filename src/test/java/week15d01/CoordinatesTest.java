package week15d01;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CoordinatesTest {

    @Test
    void testCoordinates() {
        Coordinates coordinates = new Coordinates();
        Map<Double, Double> testMap = new HashMap<>();
        testMap.put(2.3, 4.5);
        testMap.put(6.0, 2.7);
        testMap.put(2.8, -3.5);
        testMap.put(4.2, 5.5);
        testMap.put(2.6, 4.7);
        Map.Entry<Double, Double> testEntry = coordinates.searchMax(testMap);

        assertEquals(4.2, testEntry.getKey());
        assertEquals(5.5, testEntry.getValue());
    }

}