package primitivetypes;

public class PrimitiveTypesMain {

    public static void main(String[] args) {

        System.out.println((new PrimitiveTypes().toBinaryString(15)));
        System.out.println(Integer.toBinaryString(15));
        System.out.println((new PrimitiveTypes().toBinaryString(123456)));
        System.out.println(Integer.toBinaryString(123456));
        System.out.println((new PrimitiveTypes().toBinaryString(142857)));
        System.out.println(Integer.toBinaryString(142857));


    }
}
