package lambdaintro;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAccessor;
import java.util.Arrays;
import java.util.List;

public class FamilyBirthdays {

    List<LocalDate> birthDays;

    public FamilyBirthdays(LocalDate... days) {
        this.birthDays = Arrays.asList(days);
    }

    public boolean isFamilyBirthday(TemporalAccessor date) {
        for (LocalDate birthday : birthDays) {
            if (birthday.get(ChronoField.MONTH_OF_YEAR) == date.get(ChronoField.MONTH_OF_YEAR) && birthday.getDayOfMonth() == date.get(ChronoField.DAY_OF_MONTH)) {
                return true;
            }
        }
        return false;
    }


    public int nextFamilyBirthDay(TemporalAccessor date) {
        LocalDate tempDate = LocalDate.of(date.get(ChronoField.YEAR), date.get(ChronoField.MONTH_OF_YEAR), date.get(ChronoField.DAY_OF_MONTH));
        int year = date.get(ChronoField.YEAR);
        int min = 370;
        for (LocalDate birthday : birthDays) {
            LocalDate tempBirthDay = LocalDate.of(year, birthday.getMonth(), birthday.getDayOfMonth());
            if (tempBirthDay.isBefore(tempDate)) {
                tempBirthDay = tempBirthDay.withYear(year + 1);
            }
            int diff = (int) ChronoUnit.DAYS.between(tempDate, tempBirthDay);
            if (min > diff) {
                min = diff;
            }
        }
        return min;
    }


    public static void main(String[] args) {
        LocalDate today = LocalDate.of(2021, 3, 27);
        LocalDate other = LocalDate.of(2021, 2, 15);
        int i = (int) ChronoUnit.DAYS.between(other, today);
        System.out.println(i);
    }
}
