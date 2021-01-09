package catalog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CatalogItem {
    private List<Feature> features = new ArrayList<>();
    private int price;
    private String registrationNumber;

    public CatalogItem(String registrationNumber, int price, Feature... features) {
        this.features = Arrays.asList(features);
        this.registrationNumber = registrationNumber;
        this.price = price;

    }

    public List<Feature> getFeatures() {
        return List.copyOf(features);
    }

    public int getPrice() {
        return price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public List<String> getContributors() {
        List<String> result = new ArrayList<>();
        for (Feature feature : features) {
            result.addAll(feature.getContributors());
        }
        return result;
    }
}
