package x;

import java.util.ArrayList;
import java.util.List;

public class WorkDayCalculator {



    public List<DayType> dayTypes(Day firstDay, int numberOfDays){
        List<DayType> dayTypes = new ArrayList<>();
        Day day = firstDay;
        for(int i=0;i<numberOfDays;i++){
            dayTypes.add(day.getDayType());
            day = day.nextDay(day);
        }
        return dayTypes;
    }
}
