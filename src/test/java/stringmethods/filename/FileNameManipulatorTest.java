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
    void invalidParametersShouldThrowExceptionJustExtension() {
        FileNameManipulator fileNameManipulator = new FileNameManipulator();
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> fileNameManipulator.changeExtensionToLowerCase(".java"));
        assertEquals("Invalid argument!", iae.getMessage());
    }

    @Test
    void invalidParametersShouldThrowExceptionIfNullString() {
        FileNameManipulator fileNameManipulator = new FileNameManipulator();
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> fileNameManipulator.findLastCharachter(null));
        assertEquals("Empty string!", iae.getMessage());
    }

    @Test
    void invalidParametersShouldThrowExceptionIfWrongFileName() {
        FileNameManipulator fileNameManipulator = new FileNameManipulator();
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> fileNameManipulator.findFileExtension("."));
        assertEquals("Invalid file name!", iae.getMessage());
    }

    @Test
    void invalidParametersShouldThrowExceptionIfWrongExtension() {
        FileNameManipulator fileNameManipulator = new FileNameManipulator();
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> fileNameManipulator.findFileExtension(".d"));
        assertEquals("Invalid file name!", iae.getMessage());
    }

    @Test
    void invalidFileNameEmptyString() {
        FileNameManipulator fileNameManipulator = new FileNameManipulator();
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> fileNameManipulator.findFileExtension("\t\n\r"));
        assertEquals("Invalid file name!", iae.getMessage());
    }

    @Test
    void invalidFileNameNull() {
        FileNameManipulator fileNameManipulator = new FileNameManipulator();
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> fileNameManipulator.findFileExtension(null));
        assertEquals("Invalid file name!", iae.getMessage());
    }

    @Test
    void invalidParametersShouldThrowException() {
        FileNameManipulator fileNameManipulator = new FileNameManipulator();
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> fileNameManipulator.identifyFilesByExtension("d", ".d"));
        assertEquals("Invalid argument!", iae.getMessage());
    }

    @Test
    void invalidFileNameShouldThrowException() {
        FileNameManipulator fileNameManipulator = new FileNameManipulator();
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> fileNameManipulator.identifyFilesByExtension("d", "."));
        assertEquals("Invalid argument!", iae.getMessage());
    }

    @Test
    void invalidFileNameEmptyStringGoodExtension() {
        FileNameManipulator fileNameManipulator = new FileNameManipulator();
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> fileNameManipulator.identifyFilesByExtension("d", "\t\n\r"));
        assertEquals("Invalid argument!", iae.getMessage());
    }

    @Test
    void invalidFileNameNullGoodExtension() {
        FileNameManipulator fileNameManipulator = new FileNameManipulator();
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> fileNameManipulator.identifyFilesByExtension("d", null));
        assertEquals("Invalid argument!", iae.getMessage());
    }

    @Test
    void invalidExtensionEmptyStringGoodFileName() {
        FileNameManipulator fileNameManipulator = new FileNameManipulator();
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> fileNameManipulator.identifyFilesByExtension("\t\n\r", "record.dat"));
        assertEquals("Invalid argument!", iae.getMessage());
    }

    @Test
    void invalidExtensionNullGoodFileTwoName() {
        FileNameManipulator fileNameManipulator = new FileNameManipulator();
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> fileNameManipulator.identifyFilesByExtension(null, "record.dat"));
        assertEquals("Invalid argument!", iae.getMessage());
    }

    @Test
    void invalidFileOneNullGoodFileTwoName() {
        FileNameManipulator fileNameManipulator = new FileNameManipulator();
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> fileNameManipulator.compareFilesByName(null, "record.dat"));
        assertEquals("Invalid argument!", iae.getMessage());
    }

    @Test
    void invalidFileTwoNullGoodFileOneName() {
        FileNameManipulator fileNameManipulator = new FileNameManipulator();
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> fileNameManipulator.compareFilesByName("record.dat", null));
        assertEquals("Invalid argument!", iae.getMessage());
    }

    @Test
    void invalidFileTwoEmptyStringGoodFileOneName() {
        FileNameManipulator fileNameManipulator = new FileNameManipulator();
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> fileNameManipulator.compareFilesByName("record.dat", "\n\t\r"));
        assertEquals("Invalid argument!", iae.getMessage());
    }

    @Test
    void invalidFileOneEmptyStringGoodFileName() {
        FileNameManipulator fileNameManipulator = new FileNameManipulator();
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> fileNameManipulator.compareFilesByName("\n\t\r", "record.dat"));
        assertEquals("Invalid argument!", iae.getMessage());
    }

    @Test
    void invalidFileNameToReplaceEmptyString() {
        FileNameManipulator fileNameManipulator = new FileNameManipulator();
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> fileNameManipulator.replaceExtension("\n\t\r", "jpeg", "jpg"));
        assertEquals("Empty string!", iae.getMessage());
    }

    @Test
    void invalidFileNameToReplaceNull() {
        FileNameManipulator fileNameManipulator = new FileNameManipulator();
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> fileNameManipulator.replaceExtension(null, "jpeg", "jpg"));
        assertEquals("Empty string!", iae.getMessage());
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