package week05d04;

public enum CurrencyType {
    HUF(1.0),
    USD(300.0);

    private final double value;

    public double getValue() {
        return value;
    }

    CurrencyType(double value) {
        this.value = value;
    }
}
