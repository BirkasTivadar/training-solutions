package week10d01;

public class Gps {
    private double gpsX;
    private double gpsY;
    private double altitude;

    public Gps(double gpsX, double gpsY, double altitude) {
        this.gpsX = gpsX;
        this.gpsY = gpsY;
        this.altitude = altitude;
    }

    public double getGpsX() {
        return gpsX;
    }

    public double getGpsY() {
        return gpsY;
    }

    public double getAltitude() {
        return altitude;
    }
}
