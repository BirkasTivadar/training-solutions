package week12d02;

public class Parcel implements Comparable<Parcel> {

    private int side;
    private int width;
    private char colorOfFence;

    public Parcel(int side, int width, char colorOfFence) {
        this.side = side;
        this.width = width;
        this.colorOfFence = colorOfFence;
    }

    public int getSide() {
        return side;
    }

    public int getWidth() {
        return width;
    }

    public char getColorOfFence() {
        return colorOfFence;
    }

    @Override
    public int compareTo(Parcel o) {
        return o.width - this.width;
    }
}
