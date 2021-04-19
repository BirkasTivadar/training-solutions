package typeconversion.dataloss;

public class DataLoss {

    public void dataLoss() {

        long start = 0;
        int counter = 0;

        while (counter < 3) {
            long variable = (long) (float) start;
            if (variable != start) {
                System.out.println(String.format("Az eredeti szám: %d", start));
                System.out.println(String.format("A konvertált szám: %d", variable));
                System.out.println(String.format("A két szám közötti különbség: %d", Math.abs(start - variable)));
                System.out.println(String.format("Ennyi bináris számjegynél jelenik meg a probléma: %d", Long.toBinaryString(start).length()) + "\n");
                counter++;
            }
            start++;
        }
    }

    public static void main(String[] args) {

        new DataLoss().dataLoss();
    }
}
