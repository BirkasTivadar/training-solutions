package statements;

import java.util.Scanner;

public class TimeMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem adja meg az első időpontot!");
        System.out.println("Óra?");
        int hour = scanner.nextInt();
        System.out.println("Perc?");
        int minute = scanner.nextInt();
        System.out.println("Másodperc?");
        int second = scanner.nextInt();

        Time time1 = new Time(hour, minute, second);
        System.out.println();

        System.out.println("Kérem adja meg a második időpontot!");
        System.out.println("Óra?");
        hour = scanner.nextInt();
        System.out.println("Perc?");
        minute = scanner.nextInt();
        System.out.println("Másodperc?");
        second = scanner.nextInt();

        Time time2 = new Time(hour, minute, second);
        System.out.println();

        System.out.println("Az első időpont " + time1.toString() + " = " + time1.getInMinutes() + " perc");
        System.out.println("A második időpont " + time2.toString() + " = " + time2.getInSeconds() + " másodperc");
        System.out.println("Az első korábbi, mint a második: " + time1.earlierThan(time2));

    }
}
