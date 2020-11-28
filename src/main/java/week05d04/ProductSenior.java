package week05d04;

public class ProductSenior {
    private long price;
    private String currency;

    public ProductSenior(long price, String currency) {
        if (!currency.equals("HUF") && !currency.equals("USD")) {
            throw new IllegalArgumentException("Currency must be HUF or USD");
        }
        this.price = price;
        this.currency = currency;
    }

    public double convertPrice(String currency) {
        if (this.currency.equals(currency)) {
            return price;
        }
        if (currency.equals("HUF")) {
            return price * 300.0;
        }
        return price / 300.0;

    }
}
