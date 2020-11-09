package primitivetypes;

public class PrimitiveTypes {


    public String toBinaryString(int n){
        String stringBinary = "";
        for(int number = n; number > 0;) {
            int digit = number % 2;
            stringBinary = digit + "" + stringBinary;
            number /= 2;
        }
        return stringBinary;
    }

}
