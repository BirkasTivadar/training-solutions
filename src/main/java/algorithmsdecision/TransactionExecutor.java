package algorithmsdecision;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class TransactionExecutor {

    public void executeTransactions(List<Transaction> transactions, List<BankAccount> accounts) {
        for (BankAccount account : accounts) {
            for (Transaction transaction : transactions) {
                if (account.getAccountNumber().equals(transaction.getAccountNumber())) {
                    if (transaction.isCredit()) {
                        account.deposit(transaction.getAmount());
                        transaction.statusChangeSucceded();
                    } else if (transaction.isDebit() && account.withdraw(transaction.getAmount())) {
                        transaction.statusChangeSucceded();
                    } else {
                        transaction.statusChangePending();
                    }
                }
            }
        }
    }


    public static void main(String[] args) {
        List<BankAccount> accounts = Arrays.asList(
                new BankAccount("Fred", "123-324-123", 100),
                new BankAccount("Kate", "133-324-123", 2000),
                new BankAccount("Mary", "143-324-123", 90)
        );

        List<Transaction> transactions = Arrays.asList(
                new Transaction("123-324-123", TransactionOperation.CREDIT, 2000, LocalDateTime.MIN),
                new Transaction("133-324-123", TransactionOperation.DEBIT, 200, LocalDateTime.MIN),
                new Transaction("143-324-123", TransactionOperation.DEBIT, 2000, LocalDateTime.MIN)
        );

        TransactionExecutor transactionExecutor = new TransactionExecutor();

        transactionExecutor.executeTransactions(transactions, accounts);
        System.out.println(accounts.get(0).getBalance());
    }
}
