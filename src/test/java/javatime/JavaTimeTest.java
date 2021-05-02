package javatime;

import org.junit.jupiter.api.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

public class JavaTimeTest {

    @Test
    void testLocalDateTime() {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDate localDate1 = LocalDate.of(2019, Month.APRIL, 23);
        assertEquals("2019-04-23", localDate1.toString());

        LocalDateTime localDateTime1 = LocalDateTime.of(2018, 1, 12, 16, 00);
        assertEquals("2018-01-12T16:00", localDateTime1.toString());

        LocalTime localTime1 = LocalTime.of(16, 0);
        assertEquals("16:00", localTime1.toString());

        assertEquals("2018-01-13T17:00", localDateTime1.plusDays(1).plusHours(1).toString());

        assertTrue(LocalDateTime.now().isAfter(localDateTime1));
    }

    @Test
    void testConvert() {
        LocalDateTime localDateTime = LocalDateTime.of(2018, 1, 12, 16, 0);
        LocalDate localDate = localDateTime.toLocalDate();
        LocalTime localTime = localDateTime.toLocalTime();

        assertEquals("2018-01-12", localDate.toString());
        assertEquals("16:00", localTime.toString());

        LocalDateTime localDateTime1 = LocalDateTime.of(localDate, localTime);
        assertEquals("2018-01-12T16:00", localDateTime1.toString());
    }

    @Test
    void testJavaUtilDate() {
        Date date = new Date();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        System.out.println(localDateTime);

        Date date1 = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
        System.out.println(date1);
    }

    @Test
    void testChronoUnit() {
        LocalDateTime localDateTime = LocalDateTime.of(2018, 1, 12, 16, 0);
        LocalDateTime localDateTime1 = LocalDateTime.of(2018, 1, 16, 16, 0);

        assertEquals(4, ChronoUnit.DAYS.between(localDateTime, localDateTime1));
        assertEquals(-4, ChronoUnit.DAYS.between(localDateTime1, localDateTime));
    }

    @Test
    void testField() {
        LocalDateTime localDateTime = LocalDateTime.of(2018, 1, 12, 16, 0);
        assertEquals(12, localDateTime.getDayOfMonth());
    }

    @Test
    void testDateFormat() {
        LocalDateTime localDateTime = LocalDateTime.of(2018, 1, 12, 16, 0);
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;
        String s = localDateTime.format(formatter);
        System.out.println(s);

        DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        String s1 = localDateTime.format(formatter1);
        System.out.println(s1);

        DateTimeFormatter formatter2 =
                DateTimeFormatter.ofPattern("yyyy. MMMM dd. hh:mm").withLocale(Locale.ENGLISH);
        String s2 = localDateTime.format(formatter2);
        System.out.println(s2);

        DateTimeFormatter formatter3 =
                DateTimeFormatter.ofPattern("yyyy. MMMM dd. hh:mm");
        String s3 = localDateTime.format(formatter3);
        System.out.println(s3);
    }

    @Test
    void testParse(){
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String s = "2018-01-12 16:00";
        LocalDateTime localDateTime = LocalDateTime.parse(s,formatter);

        assertEquals(12, localDateTime.getDayOfMonth());
    }

}
