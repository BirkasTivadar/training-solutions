package week05d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SongTest {

    @Test
    void createSongWithoutNameTest() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> new Song("", 1920, "Nacho"));
        assertEquals("Name and artist must be not empty.", iae.getMessage());
    }

    @Test
    void createSongNullNameTest() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> new Song(null, 1920, "Nacho"));
        assertEquals("Name and artist must be not empty.", iae.getMessage());
    }

    @Test
    void createSongWithoutArtistTest() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> new Song("Mayores", 1920, ""));
        assertEquals("Name and artist must be not empty.", iae.getMessage());
    }

    @Test
    void createSongNullArtistTest() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> new Song("Mayores", 1920, null));
        assertEquals("Name and artist must be not empty.", iae.getMessage());
    }

    @Test
    void createSongLengthTest() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> new Song("Mayores", 0, "Becky G"));
        assertEquals("Length must be greater than 0.", iae.getMessage());
    }


}