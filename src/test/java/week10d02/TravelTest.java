package week10d02;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class TravelTest {

    @Test
    void testGetStopWithMax() throws IOException {
        InputStream inputStream = Files.newInputStream(Path.of("utasadat.txt"));
        assertEquals(0, Travel.getStopWithMax(inputStream));
    }
}