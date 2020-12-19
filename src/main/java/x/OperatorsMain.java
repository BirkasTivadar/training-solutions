package x;

public class OperatorsMain {

    public static void main(String[] args) {
        Operators operators = new Operators();

        System.out.println(operators.isEven(43));

        System.out.println(Integer.parseInt(Integer.toBinaryString(15<<2),2));

        System.out.println(operators.multiplyByPowerOfTwo(13,3));
    }
}
