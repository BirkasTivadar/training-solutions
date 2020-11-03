package finalmodifier;

public class CylinderCalculator {

    public static double calculateVolume(double r, double h){
        return (r * r * CircleCalculator.PI) * h;
    }

    public static double calculateSurfaceArea(double r, double h) {
        return ((r * r * CircleCalculator.PI ) * 2) + (2 * r * CircleCalculator.PI * h);
    }


}
