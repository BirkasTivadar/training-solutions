package consctructoroverloading.bus;

public class SimpleTime {
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
        this.hours = time.hours;
        this.minutes = time.minutes;
    }

    public int difference(SimpleTime time) {
        return (this.hours * 60 + this.minutes) - (time.hours * 60 + time.minutes);
    }

    public String toString() {
        return this.hours + ":" + this.minutes;
    }
}
