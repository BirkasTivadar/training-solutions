package introcontrol;

import java.util.Scanner;

public class BoatRental {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String csonak5 = "ötfős\n";
        String csonak3 = "háromfős\n";
        String csonak2 = "kétfős\n";
        String elvittCsonak = "";
        int csonakSzam = 0;
        int maradekhely = 10;

        System.out.println("Kérem a létszámot");

        int letszam = scanner.nextInt();

        if(letszam >= 4) {
            elvittCsonak += csonak5;
            csonakSzam++;
            maradekhely -= 5;
            if(letszam == 4) {
                letszam -= 4;
            } else {
                letszam -= 5;
            }
        }

        if(letszam > 2) {
            elvittCsonak += csonak3;
            csonakSzam++;
            maradekhely -= 3;
            letszam -= 3;
        }

        if(letszam > 0) {
            elvittCsonak += csonak2;
            csonakSzam++;
            maradekhely -= 2;
            if(letszam == 1) {
                letszam -= 1;
            } else {
                letszam -= 2;
            }
        }

        System.out.println("Parton maradt csónakok száma: " + (3 - csonakSzam));
        System.out.println("Parton maradt létszám: " + letszam);
        System.out.println(csonakSzam + " db csónak hajózott ki:\n" + elvittCsonak);
        System.out.println((maradekhely + " fő mehet utánuk"));








    }
}
