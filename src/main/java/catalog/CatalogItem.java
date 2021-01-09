package catalog;

import java.util.ArrayList;
import java.util.List;

public class CatalogItem {
    private List<Feature> features = new ArrayList<>();
    private int price;
    private String registrationNumber;

    public CatalogItem(String registrationNumber, int price, List<Feature> features){
        this.registrationNumber = registrationNumber;
        this.price = price;
        this.features = List.copyOf(features);
    }
}
