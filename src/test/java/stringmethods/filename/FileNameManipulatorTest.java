package stringmethods.filename;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileNameManipulatorTest {

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
}