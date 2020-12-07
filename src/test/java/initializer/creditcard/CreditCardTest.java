package initializer.creditcard;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardTest {
    public final Rate[] rates = {new Rate(Currency.HUF, 1.0),
            new Rate(Currency.EUR, 308.23),
            new Rate(Currency.SFR, 289.24),
            new Rate(Currency.GBP, 362.23),
            new Rate(Currency.USD, 289.77)};


    @Test
    public void testConstructorW3Parameters() {
        CreditCard card = new CreditCard(1000, Currency.EUR, Arrays.asList(rates));
        assertEquals(308_230L, card.getBalance());
    }

    @Test
    public void testConstructorW1Parameter() {
        CreditCard card = new CreditCard(100_000);
        assertEquals(100_000L, card.getBalance());
    }

    @Test
    public void testPaymentW2ParametersSuccess() {
        CreditCard card = new CreditCard(100_000);
        assertTrue(card.payment(100, Currency.EUR));
        assertEquals(69_177L, card.getBalance());

    }

    @Test
    public void testPaymentW2ParametersFail() {
        //Given
        CreditCard card = new CreditCard(100_000);
        //Then
        assertFalse(card.payment(1000, Currency.EUR));
        assertEquals(100_000L, card.getBalance());
    }

    @Test
    public void testPaymentW1ParameterSuccess() {
        //Given
        CreditCard card = new CreditCard(100_000);
        //Then
        assertTrue(card.payment(10_000));
        assertEquals(90_000L, card.getBalance());
    }

    @Test
    public void testPaymentW1ParameterFail() {
        //Given
        CreditCard card = new CreditCard(100_000);
        //Then
        assertFalse(card.payment(150_000));
        assertEquals(100_000L, card.getBalance());
    }
}