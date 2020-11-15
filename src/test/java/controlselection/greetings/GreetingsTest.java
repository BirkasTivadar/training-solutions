package controlselection.greetings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingsTest {

    @Test
    void greet() {
        Greetings greetings = new Greetings();

        assertEquals("Jó éjt!", greetings.greet(4, 30));
        assertEquals("Jó reggelt!", greetings.greet(8, 23));
        assertEquals("Jó napot!", greetings.greet(12, 12));
        assertEquals("Jó estét!", greetings.greet(19, 35));
    }
}
