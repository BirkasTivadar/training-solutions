package week05d05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Playlist {

    private List<Song> songs = new ArrayList<>();

    public Playlist(List<Song> songs) {
        this.songs = songs;
    }

    public List<Song> findByLengthGreaterThan(int mins) {
        List<Song> greaterSongs = new ArrayList<>();
        for (Song song : songs) {
            if (song.getLengthInSeconds() / 60.0 > mins) {
                greaterSongs.add(song);
            }
        }
        return greaterSongs;
    }

    public String toString() {
        String str = "";
        for (Song song : songs) {
            str += song + "\n";
        }
        return str;
    }

    public static void main(String[] args) {
        List<Song> songs = Arrays.asList(
                new Song("Mayores", 211, "Becky G, Bad Bunny"),
                new Song("Sin Pijama", 217, "Becky G, Natti Natasha"),
                new Song("Bailame", 241, "Nacho"),
                new Song("Criminal", 274, "Natti Natasha, Ozuna")
        );
        Playlist playlist = new Playlist(songs);
        System.out.println(playlist.toString());
    }
}
