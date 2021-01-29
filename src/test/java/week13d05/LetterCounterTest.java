package week13d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetterCounterTest {

    @Test
    void testLetterOfWordCounter(){
        LetterCounter letterCounter = new LetterCounter();

        String strAlma = "Almafa";
        String strKorte = "Körtefa";
        String strAlmaEsKorte = "Almafa, Körtefa";

        assertEquals(4, letterCounter.letterOfWordCounter(strAlma));
        assertEquals(6, letterCounter.letterOfWordCounter(strKorte));
        assertEquals(8, letterCounter.letterOfWordCounter(strAlmaEsKorte));


    }

}