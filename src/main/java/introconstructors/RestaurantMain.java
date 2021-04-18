package introconstructors;

public class RestaurantMain {

    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant("Két Fenyő", 13);

        System.out.println(String.format("Az étterem neve: %s\nkapacitása: %d fő\nmenü: %s",
                restaurant.getName(),
                restaurant.getCapacity(),
                restaurant.getMenu()));
    }
}
