package iodatastream.bank;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class BankAccountManager {

    public void saveAccount(BankAccount account, Path folder) {
        Path path = folder.resolve(account.getAccountNumber() + ".dat");
        try (DataOutputStream os = new DataOutputStream(new BufferedOutputStream(Files.newOutputStream(path)))) {
            os.writeUTF(account.getAccountNumber());
            os.writeUTF(account.getOwner());
            os.writeDouble(account.getBalance());
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write.", ioe);
        }
    }
}
