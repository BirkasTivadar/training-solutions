package abstractclass.gamecharacter;

public class Point {
    private long x;
    private long y;

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }

    public Point(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public long distance(Point otherPoint) {
        return(long)Math.sqrt(Math.pow((double)getX() - otherPoint.getX(), 2.0) + (Math.pow((double)getY() - otherPoint.getY(), 2.0)));
    }
}
