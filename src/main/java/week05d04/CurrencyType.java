package week05d04;

public enum CurrencyType {
    HUF(1),
    USD(300);

    private final int value;

    public int getValue() {
        return value;
    }

    CurrencyType(int value) {
        this.value = value;
    }
}
