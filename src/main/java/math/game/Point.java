package math.game;

public class Point {

    private int x;

    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distance(Point other) {
        double dx = Math.abs(this.getX() - other.getX());
        double dy = Math.abs(this.getY() - other.getY());
        return Math.sqrt(Math.pow(dx, 2.0) + Math.pow(dy, 2.0));
    }
}
