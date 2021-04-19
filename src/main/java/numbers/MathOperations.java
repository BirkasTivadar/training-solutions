package numbers;

import java.util.Scanner;

public class MathOperations {

    private static final double MAX_DIFFERENCE = 0.0001;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("A kiszámolandó kifejezés: 0,1 * 3");

        double result = 0.1 * 3;

        System.out.println("\nKérem az eredményt: ");
        double answerResult = scanner.nextDouble();

        System.out.println("\nA gép által számolt eredmény: " + result);

        System.out.println(Math.abs(result - answerResult) < MAX_DIFFERENCE ? "A megoldás jó." : "A megoldás nem jó.");
    }
}
