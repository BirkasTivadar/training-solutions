package lambdacomparator.cloud;

public class CloudStorage implements Comparable<CloudStorage> {

    private String provider;
    private int space;
    private PayPeriod period;
    private double price;

    public CloudStorage(String provider, int space, PayPeriod period, double price) {
        this.provider = provider;
        this.space = space;
        this.period = period;
        this.price = price;
    }

    public CloudStorage(String provider, int space) {
        this.provider = provider;
        this.space = space;
    }

    public String getProvider() {
        return provider;
    }

    public int getSpace() {
        return space;
    }

    public PayPeriod getPeriod() {
        return period;
    }

    public double getPrice() {
        return price;
    }

    private double pricePerYearPerSpace() {
        if (period == null) {
            return 0;
        }
        return price / period.getLength() / space;
    }

    @Override
    public int compareTo(CloudStorage o) {
        double diff = this.pricePerYearPerSpace() - o.pricePerYearPerSpace();
        return diff < 0 ? (int) (Math.floor(diff)) : (int) (Math.ceil(diff));
    }
}
