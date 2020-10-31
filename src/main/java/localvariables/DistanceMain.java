package localvariables;

public class DistanceMain {

    public static void main(String[] args) {

        Distance distance = new Distance(54.34, true);
        System.out.println(" A távolság: " + distance.getDistanceInKm() + " km, és " + distance.isExact());

        int tavolsagKm = (int) distance.getDistanceInKm();
        System.out.println(tavolsagKm);
    }
}
