package interfaceextends.robot;

import java.util.ArrayList;
import java.util.List;

public class AstroBoy implements FlyableRobot {
    public final static long ALTITUDE = 5;
    private Point position;
    private int angle;
    List<Point> path = new ArrayList<>();

    public AstroBoy(Point position) {
        this.position = position;
    }

    @Override
    public void liftTo(long altitude) {
       Point point = new Point(position.getX(), position.getY(), altitude);
       position = point;
       path.add(point);
    }

    private void walkTo(Point position) {
        this.position = position;
        path.add(position);
    }

    private void flyTo(Point position) {
        this.position = position;
        path.add(position);
    }



    @Override
    public void fastMoveTo(Point position) {
        Point point = new Point(position.getX(), position.getY(), ALTITUDE);
        liftTo(ALTITUDE);
        walkTo(point);
        liftTo(0);
    }

    @Override
    public void moveTo(Point position) {
        walkTo(position);
    }

    @Override
    public void rotate(int angle) {
        this.angle = angle;
    }

    public Point getPosition() {
        return position;
    }

    public int getAngle() {
        return angle;
    }

    public long getAltitude() {
        return position.getZ();
    }

    @Override
    public List<Point> getPath() {
        return path;
    }
}
