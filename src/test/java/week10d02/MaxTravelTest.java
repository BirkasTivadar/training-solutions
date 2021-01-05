package week10d02;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxTravelTest {


    @Test
    void getMaxIndexWithNullParameter() {
        MaxTravel maxTravel = new MaxTravel();

        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> maxTravel.getMaxIndex(null));
        assertEquals("List is not exist, or empty.", iae.getMessage());
    }

    @Test
    void getMaxIndexWithEmptyList() {
        List<Integer> stations = List.of();
        MaxTravel maxTravel = new MaxTravel();
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> maxTravel.getMaxIndex(stations));
        assertEquals("List is not exist, or empty.", iae.getMessage());
    }

    @Test
    void getMaxIndex() {
        List<Integer> stations = List.of(3, 3, 5, 6, 2, 2, 2, 12, 24);
        MaxTravel maxTravel = new MaxTravel();
        assertEquals(2, maxTravel.getMaxIndex(stations));
    }

    @Test
    void getMaxIndexWithMoreResult() {
        List<Integer> stations = List.of(3, 3, 5, 6, 2, 2, 2, 12, 24, 5, 5);
        MaxTravel maxTravel = new MaxTravel();
        assertEquals(2, maxTravel.getMaxIndex(stations));
    }


}