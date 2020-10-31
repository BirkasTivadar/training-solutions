package classstructureconstructors;

public class Store {
    private String product;
    private int stock;

    public Store(String product) {
        this.product = product;
        stock = 0;
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

    public void setStock(int stock) {
        this.stock = stock;
    }
}
