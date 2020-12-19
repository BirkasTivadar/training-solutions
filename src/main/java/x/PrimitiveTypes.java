package x;

public class PrimitiveTypes {
    public static final int DIGITS = 32;

    public String toBinaryString(int n){
        int remainDigits = 32;
        String result="";
        while(n>0){
            remainDigits--;
            String remain = "" + n%2;
            n = n/2;
            result = remain + result;
        }
        if(remainDigits>0){
            for(int i=0; i<remainDigits; i++){
                result = "0"+result;
            }
        }
        return result;
    }
}
