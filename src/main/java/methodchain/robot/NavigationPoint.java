package methodchain.robot;

public class NavigationPoint {
    private int robotDistance;
    private int robotAzimut;

    public NavigationPoint(int robotDistance, int robotAzimut) {
        this.robotDistance = robotDistance;
        this.robotAzimut = robotAzimut;
    }

    public int getRobotDistance() {
        return robotDistance;
    }

    public int getRobotAzimut() {
        return robotAzimut;
    }

    public String toString() {
        return "distance: " + robotDistance + " azimut: " + robotAzimut;
    }


}
