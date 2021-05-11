package week16d01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class CanoeOfficeTest {

    CanoeOffice canoeOffice;

    @BeforeEach
    void init() {
        canoeOffice = new CanoeOffice();
        canoeOffice.addRental(new CanoeRental("Red", CanoeType.RED, LocalDateTime.of(2021, 05, 11, 8, 0)));
        canoeOffice.addRental(new CanoeRental("Green1", CanoeType.GREEN, LocalDateTime.of(2021, 05, 11, 9, 30)));
        canoeOffice.addRental(new CanoeRental("Blue", CanoeType.BLUE, LocalDateTime.of(2021, 05, 11, 10, 20)));
        canoeOffice.addRental(new CanoeRental("Green2", CanoeType.GREEN, LocalDateTime.of(2021, 05, 11, 11, 30)));
    }

    @AfterEach
    void destruct() {
        canoeOffice = null;
    }

    @Test
    void getCanoeRentals() {
        assertEquals(4, canoeOffice.getCanoeRentals().size());
        assertEquals("Blue", canoeOffice.getCanoeRentals().get(2).getName());
    }

    @Test
    void findRentalByName() {
        assertEquals(LocalDateTime.of(2021, 05, 11, 11, 30), canoeOffice.findRentalByName("Green2").getStartTime());
        assertEquals(CanoeType.RED, canoeOffice.findRentalByName("Red").getCanoeType());
    }

    @Test
    void closeRentalByName() {
        canoeOffice.closeRentalByName("Blue", LocalDateTime.of(2021, 05, 11, 11, 30));

        assertEquals(LocalDateTime.of(2021, 05, 11, 11, 30), canoeOffice.getCanoeRentals().get(2).getEndTime());

        Exception ex = assertThrows(IllegalArgumentException.class, () -> canoeOffice.findRentalByName("Blue"));
        assertEquals("Wrong name", ex.getMessage());
    }

    @Test
    void getRentalPriceByName() {
        LocalDateTime endTime = LocalDateTime.of(2021, 05, 11, 11, 55);

        assertEquals(20_000, canoeOffice.getRentalPriceByName("Red", endTime));
        assertEquals(18_000, canoeOffice.getRentalPriceByName("Green1", endTime));
        assertEquals(15_000, canoeOffice.getRentalPriceByName("Blue", endTime));
        assertEquals(6000, canoeOffice.getRentalPriceByName("Green2", endTime));
    }

    @Test
    void listClosedRentals() {
        canoeOffice.closeRentalByName("Blue", LocalDateTime.of(2021, 05, 11, 11, 30));
        canoeOffice.closeRentalByName("Green1", LocalDateTime.of(2021, 05, 11, 11, 30));

        assertEquals("Green1", canoeOffice.listClosedRentals().get(0).getName());
    }

    @Test
    void countRentals() {
        assertEquals(1, canoeOffice.countRentals().get(CanoeType.RED));
        assertEquals(1, canoeOffice.countRentals().get(CanoeType.BLUE));
        assertEquals(2, canoeOffice.countRentals().get(CanoeType.GREEN));
    }
}