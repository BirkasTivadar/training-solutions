package week10d01.mid;

import org.junit.jupiter.api.Test;
import week10d01.Gps;
import week10d01.Hiking;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HikingTest {

    @Test
    void getPlusElevation() {
        Hiking hiking = new Hiking(List.of(
                new Gps(2313.321, 123.3123, 10),
        new Gps(2313.321, 123.3123, 20),
        new Gps(2313.321, 123.3123, 15),
        new Gps(2313.321, 123.3123, 18)));

        assertEquals(13, hiking.getPlusElevation());

    }
}