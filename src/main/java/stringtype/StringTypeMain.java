package stringtype;

public class StringTypeMain {

    public static void main(String[] args) {

        String prefix = "Hello ";

        String name = "John Doe";

        String message = prefix + name;

        message += 444;

        boolean b = message.equals("Hello John Doe");

        boolean c = message.equals("Hello John Doe444");

        String twoEmptyString = "" + "";
        System.out.println(twoEmptyString);
        System.out.println(twoEmptyString.length());

        System.out.println("Abcde".length());

        System.out.println("Abcde".substring(0, 1) + "," + "Abcde".substring(2, 3));

        System.out.println("Abcde".substring(0, 3));
    }
}
