package consctructoroverloading.bus;

import java.util.ArrayList;
import java.util.List;

public class BusTimeTable {
    private List<SimpleTime> timeTable = new ArrayList<>();

    public List<SimpleTime> getTimeTable() {
        return timeTable;
    }

    public BusTimeTable(List<SimpleTime> timeTable) {
        this.timeTable = timeTable;
    }

    public BusTimeTable(int firstHour, int lastHour, int everyMinute) {
        List<SimpleTime> createdTimeTable = new ArrayList<>();
        for (int i = firstHour; i <= lastHour; i++) {
            createdTimeTable.add(new SimpleTime(i, everyMinute));
        }
        this.timeTable = createdTimeTable;
    }

    public SimpleTime nextBus(SimpleTime actual) {
        for (SimpleTime simpleTime : timeTable) {
            if (simpleTime.difference(actual) >= 0) {
                return simpleTime;
            }
        }
        throw new IllegalArgumentException("No more buses today!");
    }

    public SimpleTime firstBus() {
        SimpleTime firstTime = timeTable.get(0);
        for (SimpleTime simpleTime : timeTable) {
            if (simpleTime.difference(firstTime) < 0) {
                firstTime = simpleTime;
            }
        }
        return firstTime;
    }
}
