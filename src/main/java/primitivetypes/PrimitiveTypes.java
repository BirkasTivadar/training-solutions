package primitivetypes;

public class PrimitiveTypes {

    public String toBinaryString(int n) {

        int remainDigits = 32;

        String result = "";

        while (n > 0) {
            String remain = "" + n % 2;
            result = remain + result;
            remainDigits--;
            n = n / 2;
        }

        result = "0".repeat(remainDigits - 1) + result;

        return result;
    }


}
