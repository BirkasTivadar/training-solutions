package operators;

public class OperatorsMain {

    public static void main(String[] args) {

        Operators operators = new Operators();

        System.out.println(String.format("A -21 páros szám? %b", operators.isEven(-21)));
        System.out.println(String.format("\nA 68 páros szám? %b", operators.isEven(68)));

        System.out.println(String.format("\nA 16-ot balra léptetve: %d", 16 << 1));
        System.out.println(String.format("\nA 16-ot jobbra léptetve: %d", 16 >> 1));

        System.out.println(String.format("\n5 szorozva kettővel négyszer egymás után: %d", operators.multiplyByPowerOfTwo(5, 4)) + "\n");

        int i = -1;
        String s = Integer.toBinaryString(i);
        System.out.println(s);

//        int j = Integer.parseInt(s, 2);
//        System.out.println(j);
//        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));

//        A kettes komplementens bináris számábrázolás miatt dob kivételt

        System.out.println(Long.valueOf(s, 2).intValue());
    }
}
