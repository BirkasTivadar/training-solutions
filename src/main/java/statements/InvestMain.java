package statements;

import java.util.Scanner;

public class InvestMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem a befektetett tőke összegét.");
        int fund = scanner.nextInt();

        System.out.println("Kérem a kamatlábat.");
        int interestRate = scanner.nextInt();

        Investment investment = new Investment(fund, interestRate);

        System.out.println("Befektetés összege:");
        System.out.println(fund);
        System.out.println("Kamatláb:");
        System.out.println(interestRate);

        System.out.println("Tőke: " + investment.getFund());
        System.out.println("Hozam 50 napra: " + investment.getYield(50));
        System.out.println("Kivett összeg 80 nap után: " + investment.close(80));
        System.out.println("Kivett összeg 90 nap után: " + investment.close(90));
    }
}
