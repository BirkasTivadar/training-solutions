package arrays;

import java.util.Arrays;
import java.util.List;

public class ArraysMain {

    public String numberOfDaysAsString() {
        int[] numberOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return Arrays.toString(numberOfDays);
    }

    public List<String> daysOfWeek() {
        String[] hetNapjai = {"hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap"};
        return Arrays.asList(hetNapjai);
    }

    public String multiplicationTableAsString(int size) {
        int[][] szorzoTabla = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                szorzoTabla[i][j] = (i + 1) * (j + 1);
            }
        }
        return Arrays.deepToString(szorzoTabla);
    }

    public boolean sameTempValues(double[] day, double[] anotherDay) {
        return Arrays.equals(day, anotherDay);
    }

    public boolean wonLottery(int[] megtettSzamok, int[] kihuzottSzamok) {
        int[] megtett = Arrays.copyOf(megtettSzamok, megtettSzamok.length);
        int[] kihuzott = Arrays.copyOf(kihuzottSzamok, kihuzottSzamok.length);
        Arrays.sort(megtett);
        Arrays.sort(kihuzott);
        return Arrays.equals(megtett, kihuzott);
    }

    public boolean sameTempValuesDaylight(double[] day, double[] anotherDay) {
        int dayNumber = Min(day.length, anotherDay.length);
        double[] dayMin = Arrays.copyOfRange(day, 0, dayNumber);
        double[] anotherdayMin = Arrays.copyOfRange(anotherDay, 0, dayNumber);
        return Arrays.equals(dayMin, anotherdayMin);
    }

    private static int Min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }


    public static void main(String[] args) {

        ArraysMain arraysMain = new ArraysMain();

        System.out.println(arraysMain.numberOfDaysAsString() + "\n");

        System.out.println(arraysMain.daysOfWeek() + "\n");

        System.out.println(arraysMain.multiplicationTableAsString(5) + "\n");

        double[] day = {13.2, 14.5, 8.6, 4.3, 21, 15.6, 24.5, 23.8, 18.4, 20.1, 22.6, 31.5, 17.4, 24.5, 10.2, 11.7, 23.4, 25.1, 19.6, 16.5, 23.7, 21.8, 23.4, 10.6};
        double[] anotherdayTrue = {13.2, 14.5, 8.6, 4.3, 21, 15.6, 24.5, 23.8, 18.4, 20.1, 22.6, 31.5, 17.4, 24.5, 10.2, 11.7, 23.4, 25.1, 19.6, 16.5, 23.7, 21.8, 23.4, 10.6};
        double[] anotherDayFalse = {13.2, 14.5, 8.6, 4.3, 21, 15.6, 24.5, 23.8, 18.4, 20.1, 22.6, 31.5, 17.4, 24.5, 10.2, 11.7, 23.4, 25.1, 19.6, 16.5, 23.7, 21.8, 23.4};

        System.out.println(arraysMain.sameTempValues(day, anotherdayTrue));
        System.out.println(arraysMain.sameTempValues(day, anotherDayFalse) + "\n");

        int[] megtett = {34, 56, 78, 54, 23};
        int[] kihuzott = {54, 23, 34, 78, 56};

        System.out.println(arraysMain.wonLottery(megtett, kihuzott));
        System.out.println(Arrays.toString(megtett));
        System.out.println(Arrays.toString(kihuzott) + "\n");

        System.out.println(arraysMain.sameTempValuesDaylight(day, anotherdayTrue));
        System.out.println(arraysMain.sameTempValuesDaylight(day, anotherDayFalse));
    }

}
