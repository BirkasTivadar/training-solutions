package introcontrol;

import java.util.Scanner;

public class UserMenu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Felhasználók listázása\n" +
                "2. Felhasználó felvétele\n" +
                "Többi: Kilépés");

        System.out.println("Kérek egy számot.");
        int number = scanner.nextInt();

        if(number == 1){
            System.out.println("Felhasználók listázása");
        }
        if(number == 2){
            System.out.println("Felhasználó felvétele");
        }
    }

}
