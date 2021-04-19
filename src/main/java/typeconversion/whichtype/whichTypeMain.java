package typeconversion.whichtype;

public class whichTypeMain {

    public static void main(String[] args) {

        WhichType type = new WhichType();

        System.out.println(type.whichType("2345"));

        System.out.println(type.whichType("2"));

        System.out.println(type.whichType("2222222222222222222"));

        System.out.println(type.whichType("23456755"));

        System.out.println(type.whichType("-128"));

        System.out.println(type.whichType("-129"));
    }
}

