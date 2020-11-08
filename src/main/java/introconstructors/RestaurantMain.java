package introconstructors;

public class RestaurantMain {

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("Két Fenyő", 13);

        System.out.println("Az étterem neve: " + restaurant.getName() + ", kapacitása: " + restaurant.getCapacity() + ", és a menü: \n"
                + restaurant.getMenu().get(0) + "\n" + restaurant.getMenu().get(1) + "\n"+ restaurant.getMenu().get(2));
    }

}
