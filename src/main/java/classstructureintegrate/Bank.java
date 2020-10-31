package classstructureintegrate;

public class Bank {

    public static void main(String[] args) {
        BankAccount egyeniszamla = new BankAccount("1234","Tiva", 30000);
        BankAccount vallalatiszamla = new BankAccount("5678", "Energo", 1000000);

        System.out.println(egyeniszamla.getInfo());
        System.out.println(vallalatiszamla.getInfo());
        System.out.println();

        egyeniszamla.deposit(70000);
        vallalatiszamla.withdraw(100000);
        System.out.println(egyeniszamla.getInfo());
        System.out.println(vallalatiszamla.getInfo());
        System.out.println();

        vallalatiszamla.transfer(egyeniszamla, 150000);
        System.out.println(egyeniszamla.getInfo());
        System.out.println(vallalatiszamla.getInfo());

    }
}
