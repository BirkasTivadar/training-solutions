package inheritancemethods.bankaccount;

import stringtype.StringTypeMain;

public class DebitAccount {
    private final double COST = 3.0;
    private final double MIN_COST = 200;

    private String accountNumber;
    private long balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public DebitAccount(String accountNumber, long balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public final long costOfTransaction(long amount) {
        if (amount * COST / 100 < MIN_COST) {
            return (long) MIN_COST;
        }
        return (long) (amount * COST / 100);
    }

    public boolean transaction(long amount) {
        long sumAmount = amount + costOfTransaction(amount);
        if (balance < sumAmount) {
            return false;
        }
        balance -= amount + costOfTransaction(amount);
        return balance >= 0;
    }

    public void balanceToZero() {
        balance = 0;
    }

}
