package statements;

import java.util.Scanner;

public class DivByThree {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérek egy egész számot.");
        int szam = scanner.nextInt();


        System.out.print("A " + szam + " hárommal ");
        System.out.println((szam % 3 == 0) ? "osztható." : "nem osztható.");
    }

}
