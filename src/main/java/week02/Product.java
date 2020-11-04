package week02;

public class Product {
    private String name;
    private String code;

    public Product(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    public boolean TheyEqual(Product p){
        return this.name.equals(p.name) && (Math.abs(this.code.length() - p.code.length()) < 2) ;
    }

    public static void main(String[] args) {
        Product vaj = new Product("vaj", "12345");
        Product mantequilla = new Product("vaj", "45678");
        Product cheese = new Product("vaj", "12345678");
        Product cukor = new Product("cukor", "45678");

        System.out.println(vaj.TheyEqual(mantequilla));
        System.out.println(vaj.TheyEqual(cukor));
        System.out.println(vaj.TheyEqual(cheese));
    }
}
