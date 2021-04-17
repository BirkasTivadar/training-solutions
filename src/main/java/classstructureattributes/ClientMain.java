package classstructureattributes;

import java.util.Scanner;

public class ClientMain {

    public static void main(String[] args) {

        Client client = new Client();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Az ügyfél neve?");
        client.name = scanner.nextLine();
        System.out.println();

        System.out.println("Az ügyfél születési éve?");
        client.year = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        System.out.println("Az ügyfél címe?");
        client.address = scanner.nextLine();
        System.out.println();

        System.out.println("Az ügyfél adatai: ");
        System.out.println("Neve: " + client.name);
        System.out.println("Születési éve: " + client.year);
        System.out.println("Címe: " + client.address);
    }
}