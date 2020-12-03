package methodstructure.pendrives;

public class Pendrive {
    private String name;
    private int capacity;
    private int price;

    public Pendrive(String name, int capacity, int price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }

    public String toString() {
        return name + ", capacity: " + capacity + " GB, ára: " + price + ",-Ft";
    }

    public void risePrice(int percent) {
        price += price * percent / 100.0;
    }

    public double pricePerCapacity() {
        return (double) price / capacity;
    }

    public int comparePricePercCapacity(Pendrive pendrive) {
        if (this.pricePerCapacity() > pendrive.pricePerCapacity()) {
            return 1;
        }
        if (this.pricePerCapacity() < pendrive.pricePerCapacity()) {
            return -1;
        }
        return 0;
    }

    public boolean cheaperThen(Pendrive pendrive) {
        return price < pendrive.getPrice();
    }

    public static void main(String[] args) {
        Pendrive pendrive = new Pendrive("Datatraveller", 32, 5000);
        System.out.println(pendrive.toString());
    }
}
