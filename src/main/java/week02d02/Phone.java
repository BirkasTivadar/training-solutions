package week02d02;


import java.util.Scanner;

public class Phone {
    private String type;
    private int mem;

    public Phone(String type, int mem) {
        this.type = type;
        this.mem = mem;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMem() {
        return mem;
    }

    public void setMem(int mem) {
        this.mem = mem;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Az első telefon típusa?");
        String phoneType = scanner.nextLine();

        System.out.println("Az első telefon memóriájának nagysága?");
        int phoneMem = scanner.nextInt();
        scanner.nextLine();

        Phone phone1 = new Phone(phoneType, phoneMem);

        System.out.print("Az első telefon típusa: ");
        System.out.println(phone1.getType());

        System.out.print("Az első telefon memóriájának mérete: ");
        System.out.println(phone1.getMem());


        System.out.println("A második telefon típusa?");
        phoneType = scanner.nextLine();

        System.out.println("A második telefon memóriájának nagysága?");
        phoneMem = scanner.nextInt();

        Phone phone2 = new Phone(phoneType, phoneMem);

        System.out.print("A második telefon típusa: ");
        System.out.println(phone2.getType());

        System.out.print("A második telefon memóriájának mérete: ");
        System.out.println(phone2.getMem());


    }
}
