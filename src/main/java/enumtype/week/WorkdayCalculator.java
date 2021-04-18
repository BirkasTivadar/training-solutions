package enumtype.week;

import java.util.ArrayList;
import java.util.List;

public class WorkdayCalculator {

    public List<DayType> dayTypes(Day firstDay, int numbersOfDays) {
        List<DayType> dayTypes = new ArrayList<>();
        Day day = firstDay;
        for (int i = 0; i < numbersOfDays; i++) {
            dayTypes.add(day.getDayType());
            day = Day.nextDay(day);
        }
        return dayTypes;
    }

//    private Day nextDay(Day day) {
//        if (day.ordinal() == 6) {
//            return Day.values()[0];
//        }
//        return Day.values()[day.ordinal() + 1];
//    }
}
