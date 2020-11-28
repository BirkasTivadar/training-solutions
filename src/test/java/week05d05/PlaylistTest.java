package week05d05;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PlaylistTest {

    @Test
    void findByLengthGreaterThanTest() {
        List<Song> songs = Arrays.asList(
                new Song("Mayores", 211, "Becky G, Bad Bunny"),
                new Song("Sin Pijama", 217, "Becky G, Natti Natasha"),
                new Song("Bailame", 241, "Nacho"),
                new Song("Criminal", 274, "Natti Natasha, Ozuna")
        );
        Playlist playlist = new Playlist(songs);
        assertEquals(2, playlist.findByLengthGreaterThan(4).size());
    }
}