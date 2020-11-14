package numbers;

import java.util.Scanner;

public class CircleMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem az első kör átmérőjét.");
        int diameter1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Kérem a második kör átmérőjét.");
        int diameter2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        Circle circle1 = new Circle(diameter1);
        Circle circle2 = new Circle(diameter2);

        System.out.println("Az első kör kerülete: " + circle1.perimeter());
        System.out.println("Az első kör területe: " + circle1.area());
        System.out.println();
        System.out.println("A második kör kerülete: " + circle2.perimeter());
        System.out.println("A második kör területe: " + circle2.area());
    }
}
