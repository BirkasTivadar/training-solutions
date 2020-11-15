package introexception.patient;

public class SsnValidator {
    public boolean isValidSsn(String ssn) {
        if (ssn.length() != 9) {
            return false;
        }
        try {
            int sum = 0;
            for (int i = 0; i < ssn.length() - 1; i += 2) {
                sum += Integer.parseInt(String.valueOf(validChar(ssn.charAt(i)))) * 3;
            }
            for (int i = 1; i < ssn.length() - 1; i += 2) {
                sum += Integer.parseInt(String.valueOf(validChar(ssn.charAt(i)))) * 7;
            }
            return Integer.parseInt(String.valueOf(validChar(ssn.charAt(8)))) == sum % 10;
        } catch (IllegalArgumentException iae) {
            return false;
        }
    }

    private char validChar(char digitChar) {
        if (digitChar < '0' || digitChar > '9') {
            throw new IllegalArgumentException("Not only numbers included.");
        }
        return digitChar;
    }
}
