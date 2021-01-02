package x;

public class Point {

    private long x;
    private long y;

    public Point(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }

    public long distance(Point other) {
        return (long) Math.sqrt(Math.pow((double) x - other.getX(), 2) + Math.pow((double) y - other.getY(), 2));
    }
}
