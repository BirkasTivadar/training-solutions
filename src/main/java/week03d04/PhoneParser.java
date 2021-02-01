package week03d04;

public class PhoneParser {

    public Phone parse(String phoneNumber) {
        String[] phoneNumArr = phoneNumber.split("-");
        return new Phone(phoneNumArr[0], phoneNumArr[1]);
    }

    public static void main(String[] args) {
        PhoneParser phoneParser = new PhoneParser();

        Phone phone = phoneParser.parse("10-1234567");
        System.out.println(phone.getPrefix());
        System.out.println(phone.getNumber());
    }
}
