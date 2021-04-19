package week02;

import java.util.Scanner;

public class Controller {

    private Office office = new Office();

    public void readOffice() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hány tárgyalót szeretne rögzíteni?");
        int meetingRoomsNumber = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= meetingRoomsNumber; i++) {

            System.out.println("Kérem a(z) " + i + ". tárgyaló nevét.");
            String name = scanner.nextLine();

            System.out.println("Kérem a szélességét.");
            int width = scanner.nextInt();

            System.out.println("Kérem a hosszát.");
            int length = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            MeetingRoom meetingRoom = new MeetingRoom(name, length, width);

            office.addMeetingRoom(meetingRoom);
        }
    }

    public void printMenu() {

        System.out.println("\nVálasztható menüpontok:");
        System.out.println("\n1. Tárgyalók sorrendben");
        System.out.println("2. Tárgyalók visszafele sorrendben");
        System.out.println("3. Minden második tárgyaló");
        System.out.println("4. Területek");
        System.out.println("5. Keresés pontos név alapján");
        System.out.println("6. Keresés névtöredék alapján");
        System.out.println("7. Keresés terület alapján");
    }

    public void runMenu() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem válaszon menüpontot");
        int menuNumber = scanner.nextInt();
        scanner.nextLine();

        switch (menuNumber) {

            case 1 -> office.printNames();

            case 2 -> office.printNamesReverse();

            case 3 -> office.printEventNames();

            case 4 -> office.printAreas();

            case 5 -> {
                System.out.println("Milyen névre keressek?");
                String name = scanner.nextLine();
                office.printMeetingRoomsWithName(name);
            }

            case 6 -> {
                System.out.println("Milyen névtöredékre keressek?");
                String part = scanner.nextLine();
                office.printMeetingRoomsContains(part);
            }

            case 7 -> {
                System.out.println("Hány m2-nél nagyobb tárgyalókra kíváncsi?");
                int roomArea = scanner.nextInt();
                office.printAreasLargerThan(roomArea);
            }
        }
    }

    public static void main(String[] args) {

        Controller controller = new Controller();

        controller.readOffice();

        controller.printMenu();

        controller.runMenu();
    }
}
