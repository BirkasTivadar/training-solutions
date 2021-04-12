package week12d02;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StreetSeniorTest {

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
    void writeOddSite() {
        StreetSenior streetSenior = new StreetSenior();
        streetSenior.loadParcels();
        streetSenior.writeOddSite();
    }
}