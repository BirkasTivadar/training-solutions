package ioreadstring.transaction;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TransactionManager {
    private List<BankAccount> accountList = new ArrayList<>();

    public List<BankAccount> getAccountList() {
        return List.copyOf(accountList);
    }

    public void uploadListFromFile(String file) {
        Path path = Path.of(file);
        try {
            List<String> accounts = Files.readAllLines(path);
            for (String account : accounts) {
                String name = account.split(";")[0];
                String accountNumber = account.split(";")[1];
                int balance = Integer.parseInt(account.split(";")[2]);
                accountList.add(new BankAccount(name, accountNumber, balance));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file.", ioe);
        }
    }

    public void makeTransactions(String file) {
        Path path = Path.of(file);
        try {
            List<String> transactions = Files.readAllLines(path);
            for (String transaction : transactions) {
                String accountNumkber = transaction.split(";")[0];
                int amount = Integer.parseInt(transaction.split(";")[1]);
                for (BankAccount account : accountList) {
                    if (account.getAccountNumber().equals(accountNumkber)) {
                        account.setBalance(amount);
                    }
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }
}
