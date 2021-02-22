package exam03retake01;

import java.util.Locale;

public class CdvCheck {

    public boolean check(String taxNumber) {
        if (taxNumber.length() != 10) {
            throw new IllegalArgumentException("Wrong taxnumber");
        }
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            try {
                String str = taxNumber.substring(i, i + 1);
                System.out.println(str);
                int temp = Integer.parseInt(str);
                sum += temp * (i + 1);
            } catch (NumberFormatException nfe) {
                throw new IllegalArgumentException("This character is not digit" + taxNumber.substring(i, i + 1));
            }
        }
        System.out.println(sum % 11);
        return Integer.parseInt(taxNumber.substring(9)) == sum % 11;
    }

}