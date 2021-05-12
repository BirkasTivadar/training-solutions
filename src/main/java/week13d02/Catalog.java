package week13d02;

import java.time.LocalTime;

public class Catalog {

    private String flyNumber;

    private String direction;

    private String city;

    LocalTime time;

    public Catalog(String flyNumber, String direction, String city, LocalTime time) {
        this.flyNumber = flyNumber;
        this.direction = direction;
        this.city = city;
        this.time = time;
    }

    public String getFlyNumber() {
        return flyNumber;
    }

    public String getDirection() {
        return direction;
    }

    public String getCity() {
        return city;
    }

    public LocalTime getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "flyNumber='" + flyNumber + '\'' +
                ", direction='" + direction + '\'' +
                ", city='" + city + '\'' +
                ", time=" + time +
                '}';
    }
}
