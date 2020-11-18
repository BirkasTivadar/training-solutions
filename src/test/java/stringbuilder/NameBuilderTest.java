package stringbuilder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameBuilderTest {

    @Test
    void invalidParametersShouldThrowExceptionNullFamilyName() {
        NameBuilder nameBuilder = new NameBuilder();
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> nameBuilder.concatNameHungarianStyle(null, "G", "John", Title.MR));
        assertEquals("Family name and given name must not be empty!", iae.getMessage());
    }

    @Test
    void invalidParametersShouldThrowExceptionNullGivenName() {
        NameBuilder nameBuilder = new NameBuilder();
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> nameBuilder.concatNameHungarianStyle("Smith", "G", null, Title.MR));
        assertEquals("Family name and given name must not be empty!", iae.getMessage());
    }

    @Test
    void invalidParametersShouldThrowExceptionEmptyFamilyName() {
        NameBuilder nameBuilder = new NameBuilder();
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> nameBuilder.concatNameHungarianStyle("", "G", "John", Title.MR));
        assertEquals("Family name and given name must not be empty!", iae.getMessage());
    }
 @Test
    void invalidParametersShouldThrowExceptionEmptyGivenName() {
        NameBuilder nameBuilder = new NameBuilder();
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> nameBuilder.concatNameHungarianStyle("Smith", "G", "", Title.MR));
        assertEquals("Family name and given name must not be empty!", iae.getMessage());
    }

    @Test
    void westernStyleNameConcatenation() {
        NameBuilder nameBuilder = new NameBuilder();
        assertEquals("Mr. John G Smith", nameBuilder.concatNameWesternStyle("Smith", "G", "John", Title.MR));
        assertEquals("John G Smith", nameBuilder.concatNameWesternStyle("Smith", "G", "John", null));
        assertEquals("Mr. John Smith", nameBuilder.concatNameWesternStyle("Smith", "", "John", Title.MR));
        assertEquals("Mr. John Smith", nameBuilder.concatNameWesternStyle("Smith", null, "John", Title.MR));
    }

    @Test
    void hungarianStyleNameConcatenation() {
        NameBuilder nameBuilder = new NameBuilder();
        assertEquals("Mr. Smith G John", nameBuilder.concatNameHungarianStyle("Smith", "G", "John", Title.MR));
        assertEquals("Smith G John", nameBuilder.concatNameHungarianStyle("Smith", "G", "John", null));
        assertEquals("Mr. Smith John", nameBuilder.concatNameHungarianStyle("Smith", "", "John", Title.MR));
        assertEquals("Mr. Smith John", nameBuilder.concatNameHungarianStyle("Smith", null, "John", Title.MR));
    }

    @Test
    void insertTitle() {
        NameBuilder nameBuilder = new NameBuilder();
        assertEquals("Dr. Prof. John G Smith", nameBuilder.insertTitle("Dr. John G Smith",Title.PROF, " "));
    }

    @Test
    void deleteNamePart() {
        NameBuilder nameBuilder = new NameBuilder();
        assertEquals("Dr. John G Smith", nameBuilder.deleteNamePart("Dr. Prof. John G Smith", "Prof. "));
    }
}