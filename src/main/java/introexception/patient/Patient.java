package introexception.patient;

public class Patient {

    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;

    public Patient(String name, String socialSecurityNumber, int yearOfBirth) {
        if (isEmpty(name) || yearOfBirth < 1900 || !(new SsnValidator().isValidSsn(socialSecurityNumber))) {
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    private boolean isEmpty(String str) {
        return str == null || str.isBlank();
    }
}
