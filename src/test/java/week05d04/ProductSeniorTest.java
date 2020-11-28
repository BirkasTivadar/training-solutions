package week05d04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductSeniorTest {

    @Test
    void createProductSenior() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> new ProductSenior(1500, null));
        assertEquals("Currency must be HUF or USD", iae.getMessage());
    }

    @Test
    void convertPriceHUF() {
        ProductSenior productSenior = new ProductSenior(1500, CurrencyType.HUF);
        assertEquals(5, productSenior.convertPrice(CurrencyType.USD));
        assertEquals(1500, productSenior.convertPrice(CurrencyType.HUF));
    }

    @Test
    void convertPriceUSD() {
        ProductSenior productSenior = new ProductSenior(22, CurrencyType.USD);
        assertEquals(22, productSenior.convertPrice(CurrencyType.USD));
        assertEquals(6600, productSenior.convertPrice(CurrencyType.HUF));
    }
}