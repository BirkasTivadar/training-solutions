package week05d04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductSeniorTest {

    @Test
    void createProductSenior() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> new ProductSenior(1500, "EUR"));
        assertEquals("Currency must be HUF or USD", iae.getMessage());
    }

    @Test
    void convertPriceHUF() {
        ProductSenior productSenior = new ProductSenior(1500, "HUF");
        assertEquals(5, productSenior.convertPrice("USD"));
        assertEquals(1500, productSenior.convertPrice("HUF"));
    }

    @Test
    void convertPriceUSD() {
        ProductSenior productSenior = new ProductSenior(22, "USD");
        assertEquals(22, productSenior.convertPrice("USD"));
        assertEquals(6600, productSenior.convertPrice("HUF"));
    }
}