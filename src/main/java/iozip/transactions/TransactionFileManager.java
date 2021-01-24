package iozip.transactions;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class TransactionFileManager {

    public void saveTransactions(Path zip, List<Transaction> transactionList) {
        try (ZipOutputStream outputStream = new ZipOutputStream(new BufferedOutputStream(Files.newOutputStream(zip)))) {
            for (Transaction transaction : transactionList){
                outputStream.putNextEntry(new ZipEntry(transaction.getId()+".dat"));
                outputStream.write((transaction.getTime().toString()+"\n").getBytes());
                outputStream.write((transaction.getAccount()+"\n").getBytes());
                outputStream.write(String.valueOf(transaction.getAmount()).getBytes());
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write.", ioe);
        }

    }
}
