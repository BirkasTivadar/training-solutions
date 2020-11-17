package stringconcat.stringconcat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameTest {

    @Test
    void invalidFamilyNameTest(){
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, ()->new Name("   ", "Doe", "John"));
assertEquals("Family name and given name must not be blank.", iae.getMessage());
    }
void invalidGivenNameTest(){
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, ()->new Name("Doe", "John", null, Title.MRS));
assertEquals("Family name and given name must not be blank.", iae.getMessage());
    }

    @Test
    void concatNameWesternStyleWithoutTitleTest() {
        Name romanNavarro = new Name("Navarro", "Maria", "Roman");
        assertEquals("Roman Maria Navarro", romanNavarro.concatNameWesternStyle());
    }

    @Test
    void concatNameWesternStyleWithTitleTest() {
        Name romanNavarro = new Name("Navarro", "Maria", "Roman", Title.MR);
        assertEquals("Mr. Roman Maria Navarro", romanNavarro.concatNameWesternStyle());
    }

    @Test
    void concatNameWesternStyleWithoutMiddleNameTest() {
        Name romanNavarro = new Name("Navarro", "", "Roman", Title.MR);
        assertEquals("Mr. Roman Navarro", romanNavarro.concatNameWesternStyle());
    }

    @Test
    void concatNameHungarianStyleWithoutTitleTest() {
        Name dezsiCsabaAndras = new Name("Dézsi", "Csaba", "András");
        assertEquals("Dézsi Csaba András", dezsiCsabaAndras.concatNameHungarianStyle());
    }

    @Test
    void concatNameHungarianStyleWithTitleTest() {
        Name dezsiCsabaAndras = new Name("Dézsi", "Csaba", "András", Title.DR);
        assertEquals("Dr. Dézsi Csaba András", dezsiCsabaAndras.concatNameHungarianStyle());
    }

    @Test
    void concatNameHungarianStyleWithoutMiddleNameTest() {
        Name dezsiCsabaAndras = new Name("Dézsi", "    ", "András", Title.DR);
        assertEquals("Dr. Dézsi András", dezsiCsabaAndras.concatNameHungarianStyle());
    }

}