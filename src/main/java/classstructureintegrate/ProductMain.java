package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("A termék neve?");
        String productName = scanner.nextLine();

        System.out.println("A termék ára?");
        int productPrice = scanner.nextInt();

        Product product = new Product(productName, productPrice);
        System.out.println();
        System.out.println(product.getName());
        System.out.println(product.getPrice());

        product.increasePrice(23);
        System.out.println(product.getPrice());

        product.decreasePrice(productPrice);
        System.out.println(product.getPrice());
    }
}
