package stringbasic.stringbasic;

import org.junit.jupiter.api.Test;
import stringbasic.stringbasic.StringCreator;

import static org.junit.jupiter.api.Assertions.*;

class StringCreatorTest {

    @Test
    void theStringsAreEqualOrSame() {
        StringCreator stringCreator = new StringCreator();
        assertEquals(true, stringCreator.createStringForHeap().equals(stringCreator.createStringForLoop()));
        assertEquals(false, stringCreator.createStringForHeap() == stringCreator.createStringForLoop());
        assertEquals(true, stringCreator.createStringForLoop().equals(stringCreator.createStringForLoop()));
        assertEquals(true, stringCreator.createStringForLoop() == stringCreator.createStringForLoop());
        assertEquals(true, stringCreator.createStringForHeap().equals(stringCreator.createStringForHeap()));
        assertEquals(false, stringCreator.createStringForHeap() == stringCreator.createStringForHeap());

    }

}