package attributes.bill;

import java.util.ArrayList;
import java.util.List;

public class BillMain {

    public static void main(String[] args) {
        Item mantequilla = new Item("vaj", 5, 6.7);
        Item pan = new Item("kenyér", 3, 4.2);
        Item azucar = new Item("cukor", 4, 10.3);
        Item queso = new Item("sajt", 11, 8.7);

        Bill bill = new Bill();
        bill.addItem(mantequilla);
        bill.addItem(pan);
        bill.addItem(azucar);
        bill.addItem(queso);

        System.out.println(bill.calculateTotalPrice());


    }
}
