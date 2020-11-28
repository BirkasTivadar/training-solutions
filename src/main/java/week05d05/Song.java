package week05d05;

public class Song {
    String name;
    long lengthInSeconds;
    String artist;

    public Song(String name, long lengthInSeconds, String artist) {
        if (isEmpty(name) || isEmpty(artist)) {
            throw new IllegalArgumentException("Name and artist must be not empty.");
        }
        if (lengthInSeconds <= 0) {
            throw new IllegalArgumentException("Length must be greater than 0.");
        }

        this.name = name;
        this.lengthInSeconds = lengthInSeconds;
        this.artist = artist;
    }

    public boolean isEmpty(String str) {
        return str == null || str.isBlank();
    }
}
