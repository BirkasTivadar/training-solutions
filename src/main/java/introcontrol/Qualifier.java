package introcontrol;

import java.util.Scanner;

public class Qualifier {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérek egy számot.");

        int number = scanner.nextInt();

        System.out.println(number > 100 ? "nNagyobb, mint száz" : "száz, vagy kisebb");
    }
}
