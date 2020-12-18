package week08d05;

public class MathAlgorithms {

    public int greatestCommonDivisor(int number, int other) {
        int greatest = 1;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                if (other % i == 0) {
                    greatest = i;
                }
            }
        }
        return greatest;
    }

}
