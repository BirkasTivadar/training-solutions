package week04;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {

    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(99)+1;

        Scanner scanner = new Scanner(System.in);
        int tip = 0;

        while(tip != number){
            System.out.println("Kérem tippeljen egy számot");
            tip = scanner.nextInt();
            if(tip < number){
                System.out.println("Nem jó, a szám kisebb, mint amit a gép gondolt.");
            } else {
                System.out.println("Nem jó, a szám nagyobb ,mint amit a gép gondolt");
            }
        }

        System.out.println("Gratulálok, eltalálta a számot.");


    }
}
