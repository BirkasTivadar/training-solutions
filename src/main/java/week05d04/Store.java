package week05d04;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Store {
    List<Product> products = new ArrayList<>();

    public void addProduct(Product plusProduct){
       for(Product product : products){
           if(plusProduct.getExpired().isBefore(LocalDate.now()) || )

        }
        products.add(plusProduct);
    }

    public int getNumberOfExpired(){
        int counter = 0;
        for(Product product : products){
            if(product.getExpired().isBefore(LocalDate.now())){
                counter++;
            }
        }
        return counter;
    }
}
