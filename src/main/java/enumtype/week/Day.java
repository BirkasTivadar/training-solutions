package enumtype.week;

public enum Day {

    SUNDAY(DayType.HOLIDAY),

    MONDAY(DayType.WORKDAY),

    TUESDAY(DayType.WORKDAY),

    WEDNESDAY(DayType.WORKDAY),

    THURSDAY(DayType.WORKDAY),

    FRIDAY(DayType.WORKDAY),

    SATURDAY(DayType.HOLIDAY);

    private final DayType dayType;

    Day(DayType dayType) {
        this.dayType = dayType;
    }

    public DayType getDayType() {
        return dayType;
    }

    public static Day nextDay(Day day) {
        return day.ordinal() == 6 ? Day.values()[0] : Day.values()[day.ordinal() + 1];
    }
}
