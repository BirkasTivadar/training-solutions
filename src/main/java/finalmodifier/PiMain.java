package finalmodifier;

import java.util.Scanner;

public class PiMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Mennyi legyen a kör sugara?");
        double r = scanner.nextDouble();
        scanner.nextLine();


        double circlePerimeter = CircleCalculator.calculatePerimeter(r);
        double circleArea = CircleCalculator.calculateArea(r);

        System.out.print("A kör kerülete: "+ circlePerimeter);
        System.out.println();
        System.out.print("A kör területe: " + circleArea);
        System.out.println();
        System.out.println();

        System.out.println("Mennyi legyen a cilinder magassága?");
        double h = scanner.nextDouble();

        double cylinderVolume = CylinderCalculator.calculateVolume(r, h);
        double cylinderSurfaceArea = CylinderCalculator.calculateSurfaceArea(r, h);

        System.out.print("A cilinder térfogata: "+ cylinderVolume);
        System.out.println();
        System.out.print("A cilinder felszínének mérete: " + cylinderSurfaceArea);




    }
}
