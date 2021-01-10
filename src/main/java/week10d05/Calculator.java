package week10d05;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Calculator {

    private MinMax findMinMaxSumMoreFour(int[] arr) {
        Integer[] four = {arr[0], arr[1], arr[2], arr[3]};
        int sumMin = arr[0] + arr[1] + arr[2] + arr[3];
        int sumMax = sumMin;
        int max = Math.max(Math.max(four[0], four[1]), Math.max(four[2], four[3]));
        int min = Math.min(Math.min(four[0], four[1]), Math.min(four[2], four[3]));
        int sumMinusMax = sumMin - max;
        int sumMinusMin = sumMax - min;
        for (int i = 4; i < arr.length; i++) {
            if (sumMinusMax + arr[i] < sumMin) {
                sumMin = sumMinusMax + arr[i];
                Array.set(four, Arrays.asList(four).indexOf(max), arr[i]);
                max = Math.max(Math.max(four[0], four[1]), Math.max(four[2], four[3]));
                sumMinusMax = sumMin - max;
            }
            if (sumMinusMin + arr[i] > sumMax) {
                sumMax = sumMinusMin + arr[i];
                Array.set(four, Arrays.asList(four).indexOf(min), arr[i]);
                min = Math.min(Math.min(four[0], four[1]), Math.min(four[2], four[3]));
                sumMinusMin = sumMax - min;
            }
        }
        return new MinMax(sumMin, sumMax);
    }

    public MinMax findMinMaxSum(int[] arr) {
        if (arr.length < 1) {
            throw new IllegalArgumentException("Empty array.");
        }
        if (arr.length < 4) {
            int sum = 0;
            for (int number : arr) {
                sum += number;
            }
            return new MinMax(sum, sum);
        }
        return findMinMaxSumMoreFour(arr);
    }

}
