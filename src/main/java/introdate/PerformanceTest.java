package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class PerformanceTest {

    public static void main(String[] args) {

        Performance performance = new Performance("Daddy Yankee", LocalDate.of(2020, 2, 26), LocalTime.of(20, 30), LocalTime.of(22, 0));
        System.out.println(performance.getInfo());

    }
}
