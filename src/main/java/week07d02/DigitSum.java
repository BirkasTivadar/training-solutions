package week07d02;

public class DigitSum {

    public static int sumOfDigits(int x) {
       if (x > 9){
           int solution = sumOfDigits(x/=10);
           return solution += x%10;
       } else {
           return 0;
       }
        /*int sum = 0;
        while(x != 0){
            sum += x%10;
            x /= 10;
        }
        return sum;*/
    }

    public static void main(String[] args) {
        System.out.println(DigitSum.sumOfDigits(456));
    }
}
