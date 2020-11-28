package week05d05;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private List<Song> songs = new ArrayList<>();

    public Playlist(List<Song> songs) {
        this.songs = songs;
    }

    public List<Song> findByLengthGreaterThan(int mins){
        List<Song> greaterSongs = new ArrayList<>();
        for(Song song : songs){
            if(song.getLengthInSeconds() /60.0 > mins){
                greaterSongs.add(song);
            }
        }
        return greaterSongs;
    }
}
