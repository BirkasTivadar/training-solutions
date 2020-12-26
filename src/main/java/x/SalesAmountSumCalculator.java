package x;

import filescanner.library.Library;

import java.util.ArrayList;
import java.util.List;

public class SalesAmountSumCalculator {

    public int sumSalesAmount(List<Salesperson> salespersonList) {
        int sum = 0;
        for (Salesperson person : salespersonList) {
            sum += person.getAmount();
        }
        return sum;
    }
}
