package consctructoroverloading;

public class SimpleTime {
    public static final int MINUTES_IN_HOURS = 60;
    public static final String SEPARATOR = ":";


    private int hours;
    private int minutes;

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public SimpleTime(int hours) {
        this.hours = hours;
    }

    public SimpleTime(int hours, int minutes) {
        this(hours);
        this.minutes = minutes;
    }

    public SimpleTime(SimpleTime time) {
        hours = time.hours;
        minutes = time.minutes;
    }

    public int difference(SimpleTime time) {
        return (hours * MINUTES_IN_HOURS + minutes) - (time.hours * MINUTES_IN_HOURS + time.minutes);
    }

    public String toString() {
        return hours + SEPARATOR + minutes;
    }
}
