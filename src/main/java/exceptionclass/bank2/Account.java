package exceptionclass.bank2;

public class Account {
    private String accountNumber;
    private double balance;
    private double maxSubtract;

    public Account(String accountNumber, double balance) {
        if (accountNumber == null) {
            throw new IllegalArgumentException();
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.maxSubtract = 100_000;
    }

    public void setMaxSubtract(double maxSubtract) {
        if (maxSubtract < 0) {
            throw new InvalidAmountBankOperationException();
        }
        this.maxSubtract = maxSubtract;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getMaxSubtract() {
        return maxSubtract;
    }

    public double deposit(double amount) {
        if (amount < 0) {
            throw new InvalidAmountBankOperationException();
        }
        balance += amount;
        return balance;
    }

    public double subtract(double amount) {
        if (amount < 0 || amount > maxSubtract) {
            throw new InvalidAmountBankOperationException();
        }
        if (amount > balance) {
            throw new LowBalanceBankOperationException();
        }
        balance -= amount;
        return balance;
    }
}
