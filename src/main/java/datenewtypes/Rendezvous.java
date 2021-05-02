package datenewtypes;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Rendezvous {

    private LocalTime localTime;


    public Rendezvous(int hours, int minutes) {
        this.localTime = LocalTime.of(hours, minutes);
    }


    public Rendezvous(String time, String pattern) {

        if (isEmpty(pattern)) {
            throw new IllegalArgumentException("Empty pattern string!");
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        LocalTime localTime;

        try {
            localTime = LocalTime.parse(time, formatter);
        } catch (Exception e) {
            throw new IllegalArgumentException(String.format("Illegal time string: %s", time), e);
        }

        this.localTime = localTime;
    }


    public String toString(String pattern) {

        if (isEmpty(pattern)) {
            throw new IllegalArgumentException("Empty pattern string!");
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);

        return localTime.format(formatter);
    }


    public long countMinutesLeft(LocalTime base) {

        if (base.isAfter(localTime)) {
            throw new MissedOpportunityException("Too late!");
        }

        return ChronoUnit.MINUTES.between(base, localTime);
    }


    private boolean isEmpty(String str) {
        return str == null || str.isBlank();
    }


    public void pushLater(int hours, int minutes) {
        this.localTime = localTime.plusHours(hours).plusMinutes(minutes);
    }


    public void pullEarlier(int hours, int minutes) {
        this.localTime = localTime.minusHours(hours).minusMinutes(minutes);
    }
}