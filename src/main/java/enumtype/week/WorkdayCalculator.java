package enumtype.week;

import java.util.ArrayList;
import java.util.List;

public class WorkdayCalculator {


    private Day nextDay(Day day) {
        if (day.ordinal() == 6) {
            return Day.values()[0];
        } else {
            return Day.values()[day.ordinal() + 1];
        }
    }

    public List<DayType> dayTypes(Day firstDay, int numbersOfDays) {
        List<DayType> dayTypes = new ArrayList<>();
        Day day = firstDay;
        for (int i = 0; i < numbersOfDays; i++) {
            dayTypes.add(day.getDayType());
            day = nextDay(day);
        }
        return dayTypes;
    }
}
