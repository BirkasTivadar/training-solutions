package datenewtypes;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;


public class DateOfBirth {

    private LocalDate dateOfBirth;

    public DateOfBirth(int year, int month, int day) {
        this.dateOfBirth = LocalDate.of(year, month, day);
    }

    public DateOfBirth(String birthDate, String pattern, Locale locale) {
        if (isEmpty(pattern)) {
            throw new IllegalArgumentException("Empty pattern string, cannot use: ");
        }
        if (locale == null) {
            throw new NullPointerException("Locale must not be null!");
        }
        this.dateOfBirth = LocalDate.parse(birthDate, DateTimeFormatter.ofPattern(pattern).withLocale(locale));
    }

    public DateOfBirth(String birthDate, String pattern) {
        this(birthDate, pattern, Locale.ENGLISH);
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }


    public String toString(String pattern) {

        if (isEmpty(pattern)) {
            throw new IllegalArgumentException("Empty pattern string, cannot use: ");
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);

        return dateOfBirth.format(formatter);
    }


    public String findDayOfWeekForBirthDate(Locale locale) {

        if (locale == null) {
            throw new NullPointerException("Locale must not be null!");
        }

        return dateOfBirth.getDayOfWeek().getDisplayName(TextStyle.FULL, locale);
    }


    public String findDayOfWeekForBirthDate(Locale locale, LocalDate localDate) {
        return localDate.getDayOfWeek().getDisplayName(TextStyle.FULL, locale);
    }


    public long countDaysSinceBirth(LocalDate localDate) {

        if (localDate.isBefore(dateOfBirth)) {
            throw new IllegalStateException("Birthdate is in the future!");
        }

        return ChronoUnit.DAYS.between(dateOfBirth, localDate);
    }


    private boolean isEmpty(String str) {
        return str == null || str.isBlank();
    }


    public long countDaysBetween(DateOfBirth dateOfBirth) {
        return ChronoUnit.DAYS.between(this.dateOfBirth, dateOfBirth.getDateOfBirth());
    }
}
