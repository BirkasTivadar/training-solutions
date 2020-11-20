package stringscanner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringScannerTest {
   /* @Test
    void incorrectParameterShouldThrowException() {
        StringScanner stringScanner = new StringScanner();
        IllegalArgumentException iae = assertThrows(new IllegalArgumentException., () -> stringScanner.readAndSumValues("a:2:4", ":"));
        assertEquals("Incorrect parameter string!", iae.getMessage());
    }*/

    @Test
    void delimiterIsSpaceOrNull() {
        StringScanner stringScanner = new StringScanner();
        assertEquals(11, stringScanner.readAndSumValues("2 4 5", " "));
        assertEquals(11, stringScanner.readAndSumValues("2 4 5", null));
    }

    @Test
    void readAndSumValues() {
        StringScanner stringScanner = new StringScanner();
        assertEquals(6, stringScanner.readAndSumValues("1:2:3", ":"));
        assertEquals(6, stringScanner.readAndSumValues("1:2:3", ":"));
    }

    @Test
    void readAndSumValuesWithoutDelimiter() {
        StringScanner stringScanner = new StringScanner();
        assertEquals(6, stringScanner.readAndSumValues("1 2 3"));
    }

   @Test
    void filterLinesWithWordOccurrences(){
        StringScanner stringScanner = new StringScanner();
        assertEquals("first word\nnext word", stringScanner.filterLinesWithWordOccurrences("first word\napple\nnext word", "word"));
    }

}