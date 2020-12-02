package week06d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordEraserTest {

    @Test
    void eraseWordTest() {
        WordEraser wordEraser = new WordEraser();
        assertEquals("körte barack szilva körte birsalma", wordEraser.eraseWord("alma körte barack alma szilva körte birsalma", "alma"));
    }
}