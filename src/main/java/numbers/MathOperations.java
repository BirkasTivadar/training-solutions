package numbers;

import java.util.Scanner;

public class MathOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("6 + 5 * (4- 7) / 3");

        double result = 6.0 + 5.0 * (4.0 - 7.0) / 3.0;

        System.out.println("Kérem az eredményt: ");
        double answerResult = scanner.nextDouble();

        if(Math.abs(result - answerResult) < 0.0001) {
        }


    }
}
