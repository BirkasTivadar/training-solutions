package finalmodifier;

public class CylinderCalculatorBasedOnCircle {

    public static double calculateVolume(double r, double h) {
        return CircleCalculator.calculateArea(r) * h;
    }

    public static double calculateSurfaceArea(double r, double h) {
        return (CircleCalculator.calculateArea(r) * 2) + (CircleCalculator.calculatePerimeter(r) * h);
    }
}
