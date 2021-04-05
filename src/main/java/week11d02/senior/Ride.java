package week11d02.senior;

public class Ride implements Comparable<Ride> {

    private int day;
    private int rideId;
    private double km;

    public Ride(int day, int rideId, double km) {
        if (day < 1 || day > 7 || rideId < 1 || km < 0) {
            throw new IllegalArgumentException("Invalid data");
        }
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

    @Override
    public int compareTo(Ride o) {
        if (this.day == o.day) {
            return this.rideId - o.rideId;
        }
        return this.day - o.day;
    }
}
