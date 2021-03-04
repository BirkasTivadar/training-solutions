package y;

import covid.Vaccine_Type;

import java.util.Scanner;

public class Proba {

    public void vakcinaProba(Scanner scanner) {
        System.out.println("Milyen típusú vakcinával történt az oltás?");
        System.out.println("1. Sinopharm\n" +
                "2. Pfizer-Biontech\n" +
                "3. AstraZeneca\n" +
                "4. Sputnyik V\n" +
                "5. Moderna V\n");
        int vac = 0;
        Vaccine_Type type = null;
        while (!(vac > 0 && vac < 5)) {
            try {
                vac = Integer.parseInt(scanner.nextLine());
                if (vac > 0 && vac < 5) {
                    System.out.println(vac);
                    return;
                } else {
                    System.out.println("Nyomatékosan kérem egy egész számot adjon meg 1 és 5 között!");
                    vakcinaProba(scanner);
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Nyomatékosan kérem egy egész számot adjon meg 1 és 5 között!");
            } catch (IllegalArgumentException | ArithmeticException ex) {
                System.out.println("Nyomatékosan kérem egy egész számot adjon meg 1 és 5 között!");
            }
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        new Proba().vakcinaProba(scanner);
    }

}
