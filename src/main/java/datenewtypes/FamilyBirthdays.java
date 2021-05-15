package datenewtypes;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FamilyBirthdays {

    private List<LocalDate> birthdays;

    public FamilyBirthdays(LocalDate... birthdays) {
        this.birthdays = new ArrayList<>(Arrays.asList(birthdays));
    }


    public boolean isFamilyBirthday(TemporalAccessor date) {
        int month = date.get(ChronoField.MONTH_OF_YEAR);
        int day = date.get(ChronoField.DAY_OF_MONTH);

        return birthdays.stream().anyMatch(e -> e.get(ChronoField.MONTH_OF_YEAR) == month && e.get(ChronoField.DAY_OF_MONTH) == day);
    }


    public long nextFamilyBirthDay(TemporalAccessor date) {
        int year = date.get(ChronoField.YEAR);
        int month = date.get(ChronoField.MONTH_OF_YEAR);
        int day = date.get(ChronoField.DAY_OF_MONTH);

        LocalDate temp = LocalDate.of(year, month, day);

        return getMin(year, temp);
    }


    private long getMin(int year, LocalDate temp) {

        long min = 366;

        for (LocalDate birthday : birthdays) {

            LocalDate nextBirthday = birthday.withYear(year);

            if (nextBirthday.isBefore(temp)) {
                nextBirthday = nextBirthday.plusYears(1);
            }

            long difference = ChronoUnit.DAYS.between(temp, nextBirthday);

            if (difference < min) {
                min = difference;
            }
        }

        return min;
    }
}
