package math.game;

public class GameMain {

    public static void main(String[] args) {
        Point point1 = new Point(10, 20);
        Point point2 = new Point(13, 14);

        Warrior keve = new Warrior("Keve", point1);

        Warrior bulcsu = new Warrior("Búlcsú", point2);

        System.out.println(keve.toString());

        System.out.println(bulcsu.toString() + "\n");

        int round = 1;

        while (bulcsu.distance(keve) != 0) {
            keve.move(bulcsu);
            bulcsu.move(keve);
            System.out.println(round + ". round");
            System.out.println(keve.toString());
            System.out.println(bulcsu.toString());
            round++;
        }

        while (keve.isAlive() && bulcsu.isAlive()) {
            keve.attack(bulcsu);
            bulcsu.attack(keve);
            System.out.println(round + ". round");
            System.out.println(keve.toString());
            System.out.println(bulcsu.toString());
            round++;
        }

        System.out.println("\nWinner: " + (keve.isAlive() ? keve.toString() : bulcsu.toString()));
    }
}
