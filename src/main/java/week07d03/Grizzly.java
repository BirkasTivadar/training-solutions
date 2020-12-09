package week07d03;


public class Grizzly extends Bear {

    public static void eat() {
        System.out.println("Grizzly is eating.");
    }


    public static void main(String[] args) {
       Bear bear = new Grizzly();
       Grizzly grizzly = new Grizzly();

        bear.eat();
        grizzly.eat();
    }


}
