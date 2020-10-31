package classstructureintegrate;

public class BankAccount {
    private String accountNumber;
    private String owner;
    private int balance;

    public BankAccount(String accountNumber, String owner, int balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public String getInfo() {
        return owner + " (" + accountNumber +"): " + balance + " Ft";
    }

    public void transfer(BankAccount account, int amount) {
        this.balance -= amount;
        account.balance += amount;
    }

    public void deposit(int amount) {
        balance += amount;
    }
    public void withdraw(int amount) {
        balance -= amount;
    }





}
