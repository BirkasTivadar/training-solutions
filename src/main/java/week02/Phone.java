package week02;


import java.util.Scanner;

public class Phone {
    String type;
    int mem;

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

        System.out.println("A telefon típusa?");
        String phoneType = scanner.nextLine();

        System.out.println("A telefon memóriájának nagysága?");
        int phoneMem = scanner.nextInt();

        Phone phone = new Phone(phoneType, phoneMem);

        System.out.println(phone.getType());
        System.out.println(phone.getMem());


    }
}
