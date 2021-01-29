package week13d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetterCounterTest {

    @Test
    void testCountLettersOfWord(){
        LetterCounter letterCounter = new LetterCounter();

        String strAlma = "Almafa";
        String strKorte = "Körtefa";
        String strAlmaEsKorte = "Almafa, Körtefa";

        assertEquals(4, letterCounter.countLettersOfWord(strAlma));
        assertEquals(6, letterCounter.countLettersOfWord(strKorte));
        assertEquals(8, letterCounter.countLettersOfWord(strAlmaEsKorte));


    }

}