package week07d04;



public class Duck extends Bird {
    public Duck(String name, int eggs) {
        super(name, eggs);
    }

    @Override
    public void move() {
        System.out.println("Waddle");
    }

    public static void main(String[] args) {
        Bird hapi = new Duck("Hápi", 5);
        hapi.move();
        hapi.layEggs(3);
        System.out.println(hapi.getEggs());
        System.out.println(hapi.getName());
    }
}
