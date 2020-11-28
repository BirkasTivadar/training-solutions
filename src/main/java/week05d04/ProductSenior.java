package week05d04;

public class ProductSenior {
    long price;
    String currency;

    public ProductSenior(long price, String currency) {
        if(currency != "HUF" || currency != "USD"){
            throw new IllegalArgumentException("Currency must be HUf or USD");
        }
        this.price = price;
        this.currency = currency;
    }
}
