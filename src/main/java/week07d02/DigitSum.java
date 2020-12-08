package week07d02;

public class DigitSum {

    public int sumOfDigits(int x){
        int sum = 0;
        String stringX = String.valueOf(x);
        for(int i = 0; i < stringX.length(); i++){
            sum += Character.getNumericValue(stringX.charAt(i));
        }
        return sum;
}
