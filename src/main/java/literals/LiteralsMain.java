package literals;

public class LiteralsMain {

    public static void main(String[] args) {

        System.out.println("" + 1 + 2);

        System.out.println(1 + "" + 2);

        System.out.println(Integer.toString(1).concat(Integer.toString(2).concat("\n")));

        double quotient = 3 / 4;
        System.out.println(quotient);

        quotient = 3.0 / 4;
        System.out.println(quotient);

        long big = 3_244_444_444L;

        String s = "árvíztűrőtükörfúrógép";

        String word = "title".toUpperCase();

        System.out.println("\n1 értéke bináris formában: " + Integer.toBinaryString(1));

        System.out.println("\n-2 értéke bináris formában:\n" + Integer.toBinaryString(-2));
    }
}
