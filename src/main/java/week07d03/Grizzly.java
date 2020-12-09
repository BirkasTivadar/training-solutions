package week07d03;


public class Grizzly extends Bear {

    @Override
    public void speak() {
        System.out.println("Grizzly growls");
    }

    public void sleep(int length) {
        System.out.println("Grizzly is sleeping for " + length + " hours");
    }

    @Override
    public void eat() {
        System.out.println("Grizzly is eating.");
    }


    public static void main(String[] args) {
        week07d03.Grizzly grizzly = new week07d03.Grizzly();

        grizzly.hunt();
        grizzly.eat();
    }
}
