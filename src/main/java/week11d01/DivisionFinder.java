package week11d01;

public class DivisionFinder {

    public int findDivisors(int n) {
        String number = "" + n;
        int result = 0;
        for (int i = 0; i < number.length(); i++) {
            int digit = Character.getNumericValue(number.charAt(i));
            if (digit == 0) continue;
            if (n % digit == 0) {
                result++;
            }
        }
        return result;
    }
}
