package x;

import java.util.List;

public class BankAccountDecisionMaker {


    public boolean containsBalanceGreaterThan(List<BankAccount> bankAccounts, int balanceLimit) {
        for (BankAccount bankAccount : bankAccounts) {
            if (bankAccount.getBalance() > balanceLimit) {
                return true;
            }
        }
        return false;
    }
}
