package classstructureconstructors;

public class StoreMain {

    public static void main(String[] args) {
        Store store1 = new Store("uva");
        Store store2 = new Store("manzana");

        System.out.println(store1.getProduct());
        System.out.println(store1.getStock());
        store1.store(25);
        System.out.println(store1.getStock());
        store1.dispatch(7);
        System.out.println(store1.getStock());
        store1.store(12);
        System.out.println(store1.getStock());
        System.out.println();

        System.out.println(store2.getProduct());
        System.out.println(store2.getStock());
        store2.store(5);
        System.out.println(store2.getStock());
        store2.store(23);
        System.out.println(store2.getStock());
        store2.dispatch(5);
        System.out.println(store2.getStock());
        store2.store(15);
        System.out.println(store2.getStock());



    }
}
