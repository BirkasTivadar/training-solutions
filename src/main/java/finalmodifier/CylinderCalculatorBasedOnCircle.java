package finalmodifier;

public class CylinderCalculatorBasedOnCircle {

    public static double calculateVolume(double r, double h){
        return CircleCalculator.calculateArea(double r) * h;
    }

    public static double calculateSurfaceArea(double r, double h) {
        return (CircleCalculator.calculateArea(double r) * 2) + (CircleCalculator.calculatePerimeter(double r) * h);
}
