package lambdaprimitives;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;

public class SportGadgetStore {

    private List<Product> products;

    public SportGadgetStore(List<Product> products) {
        this.products = new ArrayList<>(products);
    }

    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }

    public int getNumberOfProducts() {
        return products.stream().mapToInt(Product::getQuantity).sum();
    }

    public Double getAveragePrice() {
        return products.stream().mapToDouble(Product::getPrice).summaryStatistics().getAverage();
    }

    public String getExpensiveProductStatistics(double minPrice) {
        IntSummaryStatistics stats = products.stream().filter(p -> p.getPrice() > minPrice)
                .mapToInt(Product::getQuantity).summaryStatistics();

        return stats.getCount() < 1 ? "Nincs ilyen termék." :
                String.format("Összesen %d féle termék, amelyekből minimum %d db, maximum %d db, összesen %d db van.",
                        stats.getCount(), stats.getMin(), stats.getMax(), stats.getSum());

    }
}
