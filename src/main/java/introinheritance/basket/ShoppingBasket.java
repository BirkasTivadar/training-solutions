package introinheritance.basket;

public class ShoppingBasket {
    private Basket basket = new Basket();

    public Basket getBasket() {
        return basket;
    }

    public void addItem(Item item) {
        basket.addItem(item);
    }

    public void removeItem(String barcode) {
        basket.removeItem(barcode);
    }

    public double sumNettoPrice() {
        double sum = 0;
        for (Item item : basket.getItems()) {
            sum += item.getNettoPrice();
        }
        return sum;
    }

    public double sumTaxvalue() {
        double sum = 0;
        for (Item item : basket.getItems()) {
            sum += item.getTaxAmount();
        }
        return sum;
    }

    public double sumBruttoPrice() {
        return sumNettoPrice() + sumTaxvalue();
    }

    public void checkout() {
        basket.clearBasket();
    }

    public void removeMostExpensiveItem() {
        Item mostExpensive = basket.getItems().get(0);
        for (Item item : basket.getItems()) {
            if (item.getNettoPrice() > mostExpensive.getNettoPrice()) {
                mostExpensive = item;
            }
        }
        basket.removeItem(mostExpensive.getBarcode());
    }


}
