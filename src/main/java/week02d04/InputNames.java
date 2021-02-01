package week02d04;

import java.util.Scanner;

public class InputNames {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] nevek = new String[5];
        String nev;

        for (int i = 1; i < 6; i++) {
            System.out.println("Kérem a(z) " + i + ("-dik nevet"));
            nev = scanner.nextLine();
            nevek[i - 1] = nev;
        }
        for (int i = 1; i < 6; i++) {
            System.out.println(i + "-dik elem: " + nevek[i - 1]);
        }

    }
}
