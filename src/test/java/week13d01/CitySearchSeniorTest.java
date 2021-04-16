package week13d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CitySearchSeniorTest {

    @Test
    void testSearch() {
        CitySearchSenior citySearchSenior = new CitySearchSenior();
        assertEquals("Aba: 8127", citySearchSenior.search());
    }
}