package inheritancemethods.products;

import java.math.BigDecimal;

public class Product {
    private String name;
    private BigDecimal unitWeight;
    int numberOfDecimals;

    public Product(String name, BigDecimal unitWeight, int numberOfDecimals) {
        this.name = name;
        this.unitWeight = unitWeight;
        this.numberOfDecimals = numberOfDecimals;
    }

    public Product(String name, BigDecimal unitWeight) {
        this(name, unitWeight, 2);
    }

    public String getName() {
        return name;
    }

    public BigDecimal getUnitWeight() {
        return unitWeight;
    }

    public int getNumberOfDecimals() {
        return numberOfDecimals;
    }

    public BigDecimal totalWeight(int pieces){
        return unitWeight.multiply(new BigDecimal(String.valueOf(pieces)));
    }

    public static void main(String[] args) {
        BigDecimal unit = new BigDecimal("0.235");
        Product product = new Product("Ipad", unit, 3);
        System.out.println(product.totalWeight(3));
    }
}
