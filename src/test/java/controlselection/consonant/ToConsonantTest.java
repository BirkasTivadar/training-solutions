package controlselection.consonant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToConsonantTest {

    @Test
    void convertToConsonant() {
        ToConsonant toConsonant = new ToConsonant();

        assertEquals('b', toConsonant.convertToConsonant('a'));
        assertEquals('b', toConsonant.convertToConsonant('b'));
        assertEquals('z', toConsonant.convertToConsonant('z'));
        assertEquals('v', toConsonant.convertToConsonant('u'));
        assertEquals('v', toConsonant.convertToConsonant('v'));
    }
}