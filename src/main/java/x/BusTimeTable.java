package x;


import java.util.ArrayList;
import java.util.List;

public class BusTimeTable {

    private List<SimpleTime> timeTable = new ArrayList<>();

    public BusTimeTable(List<SimpleTime> timeTable) {
        this.timeTable = new ArrayList<>(timeTable);
    }

    public BusTimeTable(int firstHour, int lastHour, int everyMinute) {
        List<SimpleTime> timeTable = new ArrayList<>();
        for (int i = firstHour; i <= lastHour; i++) {
            SimpleTime simpleTime = new SimpleTime(i, everyMinute);
            timeTable.add(simpleTime);
        }
        this.timeTable = List.copyOf(timeTable);
    }

    public List<SimpleTime> getTimeTable() {
        return List.copyOf(timeTable);
    }

    public SimpleTime nextBus(SimpleTime actual) {
        for (SimpleTime startTime : timeTable) {
            if (startTime.difference(actual) >= 0) {
                return startTime;
            }
        }
        throw new IllegalStateException("No more buses today!");
    }

    public SimpleTime firstBus() {
        SimpleTime first = timeTable.get(0);
        for (SimpleTime startTime : timeTable) {
            if (startTime.difference(first) < 0) {
                first = startTime;
            }
        }
        return first;
    }
}
