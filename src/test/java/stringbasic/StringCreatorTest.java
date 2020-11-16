package stringbasic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCreatorTest {

    @Test
    void theStringsAreEqualOrSame() {
        StringCreator stringCreator = new StringCreator();
        assertEquals(true, stringCreator.createStringForHeap().equals(stringCreator.createStringForLoop()));
        assertEquals(false, stringCreator.createStringForHeap() == stringCreator.createStringForLoop());

    }

}