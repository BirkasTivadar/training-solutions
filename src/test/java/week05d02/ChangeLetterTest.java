package week05d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChangeLetterTest {

    @Test
    void chargeVowels() {
        ChangeLetter changeLetter = new ChangeLetter();
        assertEquals("*RT*gh**s***", changeLetter.chargeVowels("ARTeghUisEou"));
        assertEquals("*****", changeLetter.chargeVowels("UoIeA"));
        assertEquals("Hrvtsk", changeLetter.chargeVowels("Hrvtsk"));
    }
}