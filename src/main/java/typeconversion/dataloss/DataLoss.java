package typeconversion.dataloss;

import enumtype.week.Day;

public class DataLoss {

    public void dataLoss() {
        long start = 0;
        int counter = 0;
        while (counter < 3) {
            long variable = (long) (float) start;
            if (variable != start) {
                System.out.println(start);
                System.out.println(Math.abs(start - variable));
                System.out.println((Long.toBinaryString(start)).length());
                counter++;
            }
            start++;
        }
    }


    public static void main(String[] args) {
        DataLoss dataLoss = new DataLoss();

        dataLoss.dataLoss();
    }

}
