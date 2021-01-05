package week06d01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SeparatedSum {

    public SumPlusMinus sum(String s) {
        Scanner scanner = new Scanner(s).useDelimiter(";");
        double sumPositive = 0;
        double sumNegativ = 0;
        try {
            while (scanner.hasNext()) {
                double number = Double.parseDouble(scanner.next());
                if (number > 0) {
                    sumPositive += number;
                } else {
                    sumNegativ += number;
                }
            }
        } catch (InputMismatchException ex){
           throw new InputMismatchException("Invalid parameter");
        }
        return new SumPlusMinus(sumPositive, sumNegativ);
    }

    public static void main(String[] args) {
        String s = "3.4;-5;6.2;4.3;-2.1";
        SeparatedSum separatedSum = new SeparatedSum();
        System.out.println(separatedSum.sum(s).toString());
    }
}
