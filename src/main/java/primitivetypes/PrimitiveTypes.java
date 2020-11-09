package primitivetypes;

public class PrimitiveTypes {

    private final int NUMBER_OF_DIGITS = 32;


    public String toBinaryString(int n){
        String stringBinary = "";
        for(int number = n; number > 0;) {
            int digit = number % 2;
            stringBinary = digit + "" + stringBinary;
            number /= 2;
        }
        int missingDigits = NUMBER_OF_DIGITS - stringBinary.length();
        for(int i = 0; i < missingDigits; i++){
            stringBinary = 0 + stringBinary;
        }
        return stringBinary;
    }



}
