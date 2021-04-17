package introcontrol;

import java.util.Scanner;

public class UserMenu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Felhasználók listázása\n\n" +
                "2. Felhasználó felvétele\n\n" +
                "Többi: Kilépés\n");

        System.out.println("Kérek egy számot.");
        int number = scanner.nextInt();
        scanner.nextLine();

        if (number == 1) {
            System.out.println("\nFelhasználók listázása");
        }
        if (number == 2) {
            System.out.println("\nFelhasználó felvétele");
        }
    }
}
