package debug.numbers;

import java.util.Arrays;

public class NumberStatisticMain {

    public static void main(String[] args) {

        NumberStatistics feladat1 = new NumberStatistics(Arrays.asList(4, 8, -1, -2, 4, 5, 3));
        System.out.println(feladat1.sumPositives());
        System.out.println(feladat1.minDifferenceBetweenNeighbours() + "\n");

        NumberStatistics feladat2 = new NumberStatistics(Arrays.asList(-3, -4));
        System.out.println(feladat2.sumPositives() + "\n");

        NumberStatistics feladat3 = new NumberStatistics(Arrays.asList(1));
        System.out.println(feladat3.minDifferenceBetweenNeighbours());
    }
}
