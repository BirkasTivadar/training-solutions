package week12d01;

public class Goods implements Comparable<Goods> {

    private int weight;
    private int price;


    public Goods(int weight, int price) {
        this.weight = weight;
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return weight + ":" + price;
    }

    @Override
    public int compareTo(Goods o) {
        return (o.price / o.weight) - (this.price / this.weight);
    }

}
