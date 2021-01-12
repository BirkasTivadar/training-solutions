package week11d02;

public class Ride {
    private int day;
    private int rideId;
    private double km;

    public Ride(int day, int rideId, double km) {
        this.day = day;
        this.rideId = rideId;
        this.km = km;
    }

    public int getDay() {
        return day;
    }

    public int getRideId() {
        return rideId;
    }

    public double getKm() {
        return km;
    }
}
