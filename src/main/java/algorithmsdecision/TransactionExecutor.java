package algorithmsdecision;

import java.util.List;

public class TransactionExecutor {

    public void executeTransactions(List<Transaction> transactions, List<BankAccount> accounts) {
        for (BankAccount account : accounts) {
            for (Transaction transaction : transactions) {
                if (account.getAccountNumber().equals(transaction.getAccountNumber())) {
                    if (transaction.isCredit()) {
                        account.deposit(transaction.getAmount());
                        transaction.statusChangeSucceded();
                    }
                    if (transaction.isDebit() && account.withdraw(transaction.getAmount())) {
                        transaction.statusChangeSucceded();
                    } else {
                        transaction.statusChangePending();
                    }
                }
            }
        }
    }
}
