package exam03;

public enum CruiseClass {
    LUXURY(3.0),
    FIRST(1.8),
    SECOND(1.0);

    private final double priceMultiply;

    CruiseClass(double priceMultiply) {
        this.priceMultiply = priceMultiply;
    }

    public double getPriceMultiply() {
        return priceMultiply;
    }
}
