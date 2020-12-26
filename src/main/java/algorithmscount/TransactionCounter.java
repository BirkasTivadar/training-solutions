package algorithmscount;

import java.util.List;

public class TransactionCounter {

    public int countryLessThan(List<Transaction> transactions, int maxCredit) {
        int counter = 0;
        for (Transaction transaction : transactions) {
            if (transaction.getAmount() < maxCredit) {
                counter++;
            }
        }
        return counter;
    }
}
