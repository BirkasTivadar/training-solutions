package recursion;

public class FactorialCalculator {

    public long getFactorial(int number) {
        if (number > 1) {
            long solution = getFactorial(number - 1);
            return number * solution;
        }
        return 1;
    }
}
