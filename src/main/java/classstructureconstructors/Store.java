package classstructureconstructors;

public class Store {

    private String product;

    private int stock = 0;

    public Store(String product) {
        this.product = product;
    }

    public void store(int addNumber) {
        this.stock += addNumber;
    }

    public void dispatch(int subtractNumber) {
        this.stock -= subtractNumber;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getStock() {
        return stock;
    }
}
