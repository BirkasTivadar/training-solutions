package x;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this(hours, minutes);
        this.seconds = seconds;
    }

    public Time(int hours, int minutes) {
        this(hours);
        this.minutes = minutes;
    }

    public Time(int hours) {
        this.hours = hours;
    }

    public Time(Time time) {
        this.hours = time.hours;
        this.minutes = time.minutes;
        this.seconds = time.seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    private int timeInSeconds(Time time) {
        return time.hours * 3600 + time.minutes * 60 + time.seconds;
    }

    public boolean isEqual(Time time) {
        return timeInSeconds(this) == timeInSeconds(time);
    }

    public boolean isEqual(int hours, int minutes, int seconds) {
        return this.isEqual(new Time(hours, minutes, seconds));
    }

    public boolean isEarlier(Time time) {
        return timeInSeconds(this) < timeInSeconds(time);
    }

    public boolean isEarlier(int hours, int minutes, int seconds) {
        return this.isEarlier(new Time(hours, minutes, seconds));
    }


}
