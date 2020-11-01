package stringtype;

import javax.management.remote.JMXServerErrorException;

public class StringTypeMain {

    public static void main(String[] args) {

        String prefix = "Hello ";
        String name = "John Doe";
        String message = prefix + name;
        message += 444;
        boolean b = message.equals("Hello John Doe");
        boolean c = message.equals("Hello John Doe444");
        String ketures = "" +"";
        System.out.println(ketures);
        System.out.println(ketures.length());

        String abcde = "Abcde";
        System.out.println(abcde.length());
        System.out.println(abcde.substring(0,1) + "," + abcde.substring(2,3));
        System.out.println(abcde.substring(0,3));
    }
}
