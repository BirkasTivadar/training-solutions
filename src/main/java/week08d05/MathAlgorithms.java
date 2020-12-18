package week08d05;

public class MathAlgorithms {

    public int greatestCommonDivisor(int number, int other) {
        int greatest = 1;
        int min;
        int max;
        if (number < other) {
            min = number;
            max = other;
        } else {
            min = other;
            max = number;
        }
        for (int i = min; i >= 1; i--) {
            if (number % i == 0 && other%i == 0) {
                return i;

            }
        }
        return greatest;
    }

}
