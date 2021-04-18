package math.rounding;

import java.util.Arrays;
import java.util.Random;

public class RoundingAnomaly {

    private double[] randomNumbers(int size, double max, int scale) {
        Random rnd = new Random();
        double[] numbers = new double[size];
        double tizedes = Math.pow(10, scale);
        for (int i = 0; i < size; i++) {
            numbers[i] = (Math.round(rnd.nextDouble() * max * tizedes)) / tizedes;
        }
        return numbers;
    }

    private double roundAFterSum(double[] doubleNums) {
        return Math.round(Arrays.stream(doubleNums).sum());
//        double sum = 0;
//        for (double doubleNum : doubleNums) {
//            sum += doubleNum;
//        }
//        return sum;
    }

    private double sumAfterRound(double[] doubleNums) {
        return Arrays.stream(doubleNums).mapToInt(e -> (int) Math.round(e)).sum();
//        double sum = 0;
//        for (double doubleNum : doubleNums) {
//            sum += Math.round(doubleNum);
//        }
//        return sum;
    }

    private double difference(int size, double max, int scale) {
        double[] randomNumbers = randomNumbers(size, max, scale);
        double roundAfterSum = roundAFterSum(randomNumbers);
        double sumAfterRound = sumAfterRound(randomNumbers);

        return Math.abs(roundAfterSum - sumAfterRound);
    }


    public static void main(String[] args) {

        RoundingAnomaly roundingAnomaly = new RoundingAnomaly();

        double sum = 0;

        for (int i = 0; i < 100; i++) {
            double diff = roundingAnomaly.difference(1000, 1000000, 5);
            sum += diff;
            System.out.print(diff + "; ");
        }

        System.out.println();

        System.out.println(sum / 100);
    }
}
