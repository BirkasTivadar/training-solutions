package arrays;

import java.util.Arrays;
import java.util.List;

public class ArraysMain {

    public String numberOfDaysAsString(){
        int[] numberOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return Arrays.toString(numberOfDays);
    }
    public List<String> daysOfWeek(){
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

    public boolean sameTempValues(double[] day, double[] anotherDay){
        return Arrays.equals(day, anotherDay);
    }

    public boolean wonLottery(int[] megtettSzamok, int[] kihuzottSzamok){
        int [] megtett = Arrays.copyOf(megtettSzamok, megtettSzamok.length);
        int [] kihuzott = Arrays.copyOf(kihuzottSzamok, kihuzottSzamok.length);
        Arrays.sort(megtett);
        Arrays.sort(kihuzott);
        return Arrays.equals(megtett, kihuzott);
    }


    public static void main(String[] args) {

        ArraysMain arraysMain = new ArraysMain();

        int[] megtett = {34, 56, 78, 54, 23};
        int[] kihuzott = {54, 23, 34, 78, 56};

        System.out.println(arraysMain.wonLottery(megtett, kihuzott));
        System.out.println(Arrays.toString(megtett));
        System.out.println(Arrays.toString(kihuzott));

    }







}
