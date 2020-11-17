package stringmethods.filename;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileNameManipulatorTest {

    @Test
    void invalidParametersShouldThrowExceptionIfEmptyString() {
        FileNameManipulator fileNameManipulator = new FileNameManipulator();
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> fileNameManipulator.findLastCharachter(""));
        assertEquals("Empty string!", iae.getMessage());

    }

    @Test
    void invalidParametersShouldThrowExceptionIfWhiteSpaceOnly() {
        FileNameManipulator fileNameManipulator = new FileNameManipulator();
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> fileNameManipulator.changeExtensionToLowerCase("\t\n\r "));
        assertEquals("Empty string!", iae.getMessage());

    }

    @Test
    void invalidParametersShouldThrowExceptionJustPoint() {
        FileNameManipulator fileNameManipulator = new FileNameManipulator();
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> fileNameManipulator.changeExtensionToLowerCase("."));
        assertEquals("Invalid argument!", iae.getMessage());

    }

    @Test
    void findLastCharachter() {
        FileNameManipulator fileNameManipulator = new FileNameManipulator();
        assertEquals('f', fileNameManipulator.findLastCharachter("abcdef"));
        assertEquals('f', fileNameManipulator.findLastCharachter("abcdef \t  \n "));
    }

    @Test
    void findFileExtension() {
        FileNameManipulator fileNameManipulator = new FileNameManipulator();
        assertEquals(".dat", fileNameManipulator.findFileExtension("record.dat"));
    }

    @Test
    void identifyFilesByExtension() {
        FileNameManipulator fileNameManipulator = new FileNameManipulator();
        assertEquals(true, fileNameManipulator.identifyFilesByExtension("mm", "tematika.mm"));
        assertEquals(false, fileNameManipulator.identifyFilesByExtension("md", "tematika.mm"));
    }

    @Test
    void compareFilesByName() {
        FileNameManipulator fileNameManipulator = new FileNameManipulator();
        assertEquals(true, fileNameManipulator.compareFilesByName("String.JAVA", "String.java"));
        assertEquals(false, fileNameManipulator.compareFilesByName("String.java", "Sting.java"));
    }

    @Test
    void changeExtensionToLowerCase() {
        FileNameManipulator fileNameManipulator = new FileNameManipulator();
        assertEquals("String.java", fileNameManipulator.changeExtensionToLowerCase("String.JAVA"));
    }

    @Test
    void replaceExtension() {
        FileNameManipulator fileNameManipulator = new FileNameManipulator();
        assertEquals("picture.png", fileNameManipulator.replaceExtension("picture.png", "jpeg", "jpg"));
        assertEquals("picture.jpg", fileNameManipulator.replaceExtension("picture.jpeg", "jpeg", "jpg"));
        assertEquals("long_descriptive_name.txt", fileNameManipulator.replaceExtension("long descriptive name.txt", " ", "_"));
    }

}