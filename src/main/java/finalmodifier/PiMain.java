package finalmodifier;

import java.util.Scanner;

public class PiMain {

    public static void main(String[] args) {

        CircleCalculator circleCalculator = new CircleCalculator();

        CylinderCalculator cylinderCalculator = new CylinderCalculator();

        CylinderCalculatorBasedOnCircle cylinderCalculatorBasedOnCircle = new CylinderCalculatorBasedOnCircle();

        Scanner scanner = new Scanner(System.in);

        System.out.println(String.format("A pí értéke: %.2f", CircleCalculator.PI));

        System.out.println("\nMennyi legyen a kör sugara?");

        double r = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("\nA kör kerülete: " + circleCalculator.calculatePerimeter(r));

        System.out.println("\nA kör területe: " + circleCalculator.calculateArea(r));

        System.out.println("\nMennyi legyen a cilinder magassága?");
        double h = scanner.nextDouble();

        System.out.println("\nA cilinder térfogata: " + cylinderCalculator.calculateVolume(r, h));

        System.out.println("\nA cilinder felszínének mérete: " + cylinderCalculatorBasedOnCircle.calculateSurfaceArea(r, h));
    }
}
