package typeconversion.whichtype;

public class whichTypeMain {

    public static void main(String[] args) {
        WhichType whichType = new WhichType();

        System.out.println(whichType.whichType("2345"));
        System.out.println(whichType.whichType("2"));
        System.out.println(whichType.whichType("2222222222222222222"));
        System.out.println(whichType.whichType("23456755"));
        System.out.println(whichType.whichType("-128"));
        System.out.println(whichType.whichType("-129"));
    }
}
