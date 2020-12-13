package interfacestaticmethods;


public class Product implements Valued {
    private String name;
    private double valued;

    public String getName() {
        return name;
    }

    @Override
    public double getValued() {
        return valued;
    }

    public Product(String name, double valued) {
        this.name = name;
        this.valued = valued;
    }
}
