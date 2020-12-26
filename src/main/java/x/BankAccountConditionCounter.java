package x;

import java.util.List;

public class BankAccountConditionCounter {

    public int countWithBalanceGreaterThan(List<BankAccount> bankAccounts, int minBalance) {
        int counter = 0;
        for (BankAccount bankAccount : bankAccounts) {
            if (bankAccount.getBalance() > minBalance) {
                counter++;
            }
        }
        return counter;
    }
}
