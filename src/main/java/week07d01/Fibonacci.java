package week07d01;

public class Fibonacci {

    private static final Long[] RESULTS = new Long[Integer.MAX_VALUE / 5];

    public static long fib(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be a than zero.");
        }
        if (number <= 1) {
            return number;
        }
        if (RESULTS[number] == null) {
            RESULTS[number] = fib(number - 2) + fib(number - 1);
        }
        return RESULTS[number];

    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fib(1000));


    }
}
