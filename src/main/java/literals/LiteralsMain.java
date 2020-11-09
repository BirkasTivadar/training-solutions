package literals;

public class LiteralsMain {

    public static void main(String[] args) {

        String i = 2 + "" + 3;

        System.out.println(i);

        String j = Integer.toString(2) + Integer.toString(3);
        System.out.println(j);

        double quotient = 3.0 / 4;
        System.out.println(quotient);

        long big = 3_244_444_444L;

        String s = "árvíztűrőtükörfúrógép";

        String word = "title".toUpperCase();
        System.out.println(word);

        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(-2));



    }

}
