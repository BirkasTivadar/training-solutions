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

    public boolean hasAudioFeature() {
        for (Feature feature : features) {
            if (feature instanceof AudioFeatures) {
                return true;
            }
        }
        return false;
    }

    public boolean hasPrintedFeature() {
        for (Feature feature : features) {
            if (feature instanceof PrintedFeatures) {
                return true;
            }
        }
        return false;
    }

    public List<String> getTitles() {
        List<String> result = new ArrayList<>();
        for (Feature feature : features) {
            result.add(feature.getTitle());
        }
        return result;
    }

    public int fullLengthAtOneItem() {
        int fullLength = 0;
        for (Feature feature : features) {
            if (feature instanceof AudioFeatures) {
                fullLength += ((AudioFeatures) feature).getLength();
            }
        }
        return fullLength;
    }

    public int numberOfPagesAtOneItem() {
        int numberOfPages = 0;
        for (Feature feature : features) {
            if (feature instanceof PrintedFeatures) {
                numberOfPages += ((PrintedFeatures) feature).getNumberOfPages();
            }
        }
        return numberOfPages;
    }


}
