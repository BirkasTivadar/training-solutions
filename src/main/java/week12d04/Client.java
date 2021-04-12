package week12d04;

public class Client {

    public String name;
    public String regNumber;

    public Client(String name, String regNumber) {
        if (isEmptyOrNull(name) || isEmptyOrNull(regNumber)) {
            throw new IllegalArgumentException("Both parameter must not be null or empty.");
        }
        this.name = name;
        this.regNumber = regNumber;
    }

    private boolean isEmptyOrNull(String str) {
        return str == null || str.isBlank();
    }

    public String getName() {
        return name;
    }

    public String getRegNumber() {
        return regNumber;
    }


}
