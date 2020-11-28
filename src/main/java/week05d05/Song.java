package week05d05;

public class Song {
    private String name;
    private long lengthInSeconds;
    private String artist;

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

    private boolean isEmpty(String str) {
        return str == null || str.isBlank();
    }

    public String getName() {
        return name;
    }

    public long getLengthInSeconds() {
        return lengthInSeconds;
    }

    public String getArtist() {
        return artist;
    }

    public String toString() {
        return name + ": " + lengthInSeconds + " seconds" + " (" + artist + ")";
    }

}
