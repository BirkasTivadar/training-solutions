package introcontrol;

public class IntroControlMain {

    public static void main(String[] args) {
        IntroControl introControl = new IntroControl();

        System.out.println(introControl.substractTenIfGreaterThanTen(12));
        System.out.println(introControl.substractTenIfGreaterThanTen(10));
        System.out.println(introControl.substractTenIfGreaterThanTen(122));
        System.out.println(introControl.substractTenIfGreaterThanTen(-12));

        System.out.println(introControl.describeNumber(0));
        System.out.println(introControl.describeNumber(11));
        System.out.println(introControl.describeNumber(-3));

        System.out.println(introControl.greetinToJoe("Tiva"));
        System.out.println(introControl.greetinToJoe("Joe"));
        System.out.println(introControl.greetinToJoe("joe"));

        System.out.println(introControl.calculateBonus(1000));
        System.out.println(introControl.calculateBonus(11_000_120));
        System.out.println(introControl.calculateBonus(1_000_000));

        System.out.println(introControl.calculateConsumption(1000, 5660));
        System.out.println(introControl.calculateConsumption(5555, 5555));
        System.out.println(introControl.calculateConsumption(9000, 1));

        introControl.printNumbers(15);
        introControl.printNumbersBetween(10,20);
        introControl.printNumbersBetweenAnyDirection(1,5);
        introControl.printNumbersBetweenAnyDirection(10,6);

        introControl.printOddNumbers(21);




    }
}
