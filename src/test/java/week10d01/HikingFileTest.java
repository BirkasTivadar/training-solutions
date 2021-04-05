package week10d01;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class HikingFileTest {

    @Test
    void testGetPlusElevation() throws IOException {
        InputStream inputStream = Files.newInputStream(Path.of("week10d01_gps.txt"));
        HikingFile hikingFile = new HikingFile();
        ChangeAltitude testAltitude = new ChangeAltitude(25, 15);
        ChangeAltitude resultAltitude = hikingFile.getPlusElevation(inputStream);
        assertEquals(testAltitude.getElevation(), resultAltitude.getElevation());
        assertEquals(testAltitude.getInclination(), resultAltitude.getInclination());

    }
}