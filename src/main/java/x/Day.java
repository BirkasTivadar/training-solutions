package x;

public enum Day {
    MONDAY(DayType.WORKDAY),
    TUESDAY(DayType.WORKDAY),
    WEDNESDAY(DayType.WORKDAY),
    THURSDAY(DayType.WORKDAY),
    FRIDAY(DayType.WORKDAY),
    SATURDAY(DayType.HOLIDAY),
    SUNDAY(DayType.HOLIDAY);

    public final DayType dayType;


    Day(DayType dayType) {
        this.dayType = dayType;
    }

    public DayType getDayType() {
        return dayType;
    }
    public Day nextDay(Day day){
        if(day.ordinal() == 6){
            return Day.values()[0];
        }
        return Day.values()[day.ordinal()+1];
    }
}
