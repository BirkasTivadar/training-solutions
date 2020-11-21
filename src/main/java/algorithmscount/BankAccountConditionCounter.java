package algorithmscount;

import java.util.List;

public class BankAccountConditionCounter {

    public int countWithBalanceGreaterThan(List<BankAccount> bankAccounts, int balanceLimit) {
        int counter = 0;
        for (BankAccount bankAccount : bankAccounts) {
            if (bankAccount.getBalance() > balanceLimit) {
                counter++;
            }
        }
        return counter;
    }
}
