package week10d05;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Calculator {

    private int findMinSum(int[] arr) {
        Integer[] four = {arr[0], arr[1], arr[2], arr[3]};
        int sum = arr[0] + arr[1] + arr[2] + arr[3];
        int max = Math.max(Math.max(four[0], four[1]), Math.max(four[2], four[3]));
        int sumMinusMax = sum - max;
        for (int i = 4; i < arr.length; i++) {
            if (sumMinusMax + arr[i] < sum) {
                sum = sumMinusMax + arr[i];
                Array.set(four, Arrays.asList(four).indexOf(max), arr[i]);
                max = Math.max(Math.max(four[0], four[1]), Math.max(four[2], four[3]));
            }
        }
        return sum;
    }

    private int findMaxSum(int[] arr) {
        Integer[] four = {arr[0], arr[1], arr[2], arr[3]};
        int sum = arr[0] + arr[1] + arr[2] + arr[3];
        int min = Math.min(Math.min(four[0], four[1]), Math.min(four[2], four[3]));
        int sumMinusMin = sum - min;
        for (int i = 4; i < arr.length; i++) {
            if (sumMinusMin + arr[i] > sum) {
                sum = sumMinusMin + arr[i];
                Array.set(four, Arrays.asList(four).indexOf(min), arr[i]);
                min = Math.min(Math.min(four[0], four[1]), Math.min(four[2], four[3]));
            }
        }
        return sum;
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
        return new MinMax(findMinSum(arr), findMaxSum(arr));
    }

}
