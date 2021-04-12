package week12d02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ParcelTest {

    @Test
    void testParcelSort() {
        List<Parcel> parcels = Arrays.asList(
                new Parcel(0, 10, 'P'),
                new Parcel(1, 8, 'K'),
                new Parcel(0, 12, ':')
        );
        Collections.sort(parcels);
        assertEquals(12, parcels.get(0).getWidth());
    }




}