package operators;

public class OperatorsMain {

    public static void main(String[] args) {
        Operators operators = new Operators();

        System.out.println(operators.isEven(-21));

        System.out.println(1 << 16);

        System.out.println(operators.multiplyByPowerOfTwo(5, 4));

        System.out.println(0333);

        int i = -1;
        String s = Integer.toBinaryString(i);
        System.out.println(s);

        System.out.println(Long.valueOf(s, 2).intValue());
    }
}
