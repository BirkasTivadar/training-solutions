package x;

public class Product {
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public Product(Product product) {
        name = product.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
