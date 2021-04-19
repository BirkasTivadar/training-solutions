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

        Circle circle1 = new Circle(diameter1);
        Circle circle2 = new Circle(diameter2);

        System.out.println(String.format("\nAz első kör kerülete: %.2f", circle1.perimeter()));
        System.out.println(String.format("Az első kör területe: %.2f", circle1.area()));

        System.out.println(String.format("\nA második kör kerülete: %.2f", circle2.perimeter()));
        System.out.println(String.format("A második kör területe: %.2f", circle2.area()));
    }
}
