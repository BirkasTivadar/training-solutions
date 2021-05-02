package introexception.patient;

public class SsnValidator {

    public boolean isValidSsn(String ssn) {

        if (ssn.length() != 9) {
            return false;
        }

        return checkSsn(ssn);
    }


    private boolean checkSsn(String ssn) {

        if (isNumber(ssn)) {

            int sum = 0;

            for (int i = 0; i < ssn.length() - 1; i++) {
                if (i % 2 == 0) {
                    sum += Integer.parseInt(ssn.substring(i, i + 1)) * 3;
                } else {
                    sum += Integer.parseInt(ssn.substring(i, i + 1)) * 7;
                }
            }

            return sum % 10 == Integer.parseInt(ssn.substring(ssn.length() - 1));
        }

        return false;
    }


    public boolean isNumber(String str) {

        try {
            int value = Integer.parseInt(str);
            return true;

        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}
