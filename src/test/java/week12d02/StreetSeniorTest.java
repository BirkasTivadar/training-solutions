package week12d02;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StreetSeniorTest {
    @TempDir
    public File temporaryFolder;

    @Test
    void testLoadParcels() {
        StreetSenior streetSenior = new StreetSenior();
        streetSenior.loadParcels();
        assertEquals(10, streetSenior.getSoldParcels().get(0).getWidth());
        assertEquals('P', streetSenior.getSoldParcels().get(0).getColorOfFence());
    }

    @Test
    void testSortedParcels() {
        StreetSenior streetSenior = new StreetSenior();
        streetSenior.loadParcels();
        List<Parcel> sorted = streetSenior.sortedByWidth();
        assertEquals(12, sorted.get(0).getWidth());
        assertEquals('#', sorted.get(0).getColorOfFence());
    }

    @Test
    void lastSoldSite() {
        StreetSenior streetSenior = new StreetSenior();
        streetSenior.loadParcels();
        assertEquals(8, streetSenior.getLastSoldSite());
    }

    @Test
    void writeOddSite() throws IOException {
        StreetSenior streetSenior = new StreetSenior();
        streetSenior.loadParcels();

        Path path = new File(temporaryFolder, "soldParcelsInOddSide.txt").toPath();
        streetSenior.writeOddSite(path);

        String streetOddSide = Files.readString(path);
        assertEquals("(1)KKKKKKKK(3)::::::::::(5)SSSSSSSSS", streetOddSide);
    }
}