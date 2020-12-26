package formatlocaleprintf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintFormatTest {
    @Test
    void lessParameterThenInFormatStringShouldThrowException() {
        PrintFormat printFormat = new PrintFormat();
        int i = 6;
        int j = 7;
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> printFormat.checkException("%d  %d  %d", i, j));
        assertEquals("Less objects then expected in format String!", iae.getMessage());
    }


    @Test
    void printFormattedTextWDouble() {
        PrintFormat printFormat = new PrintFormat();
        Double d = 561123.201;
        assertEquals("Total is: 561 123,20 Ft", printFormat.printFormattedText(d));
    }

    @Test
    void testPrintFormattedTextWIntString() {
        PrintFormat printFormat = new PrintFormat();
        String fruit = "APPLES";
        int count = 6;
        assertEquals("We counted 6 APPLES in the basket", printFormat.printFormattedText(6, fruit));
    }

    @Test
    void testPrintFormattedTextWIntegerRightEdge() {
        PrintFormat printFormat = new PrintFormat();
        int i = 6;
        int j = 66;
        int k = 666666;
        assertEquals("Right edge of numbers set at 4 spaces from text:   " + i, printFormat.printFormattedText(i));
        assertEquals("Right edge of numbers set at 4 spaces from text:  " + j, printFormat.printFormattedText(j));
        assertEquals("Right edge of numbers set at 4 spaces from text:" + k, printFormat.printFormattedText(k));
    }

    @Test
    void testPrintFormattedTextMultipleObject() {
        PrintFormat printFormat = new PrintFormat();
        int i = 6;
        int j = 7;
        int k = 8;
        assertEquals("Multiple objects containing text:" + i + "\t" + j + "\t" + k, printFormat.printFormattedText(i, j, k));
    }
}