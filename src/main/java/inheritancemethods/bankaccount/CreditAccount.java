package inheritancemethods.bankaccount;

public class CreditAccount extends DebitAccount {
    private long overdraftLimit;

    public long getOverdraftLimit() {
        return overdraftLimit;
    }

    public CreditAccount(String accountNumber, long balance, long overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public boolean transaction(long amount) {
        long sumAmount = amount + costOfTransaction(amount);
        if (sumAmount > getBalance() + overdraftLimit) {
            return false;
        }
        if (sumAmount < getBalance()) {
            super.transaction(amount);
        } else {
            sumAmount -= getBalance();
            balanceToZero();
            overdraftLimit -= sumAmount;
        }
        return true;
    }
}
