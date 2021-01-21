package week12.d04;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Secret {


    public void printSecret() {
        Path file = Path.of("secret.dat");

        try (InputStream is = Files.newInputStream(file)) {
            byte[] bytes = is.readAllBytes();
            for (int i = 0; i < bytes.length; i++) {
                bytes[i] += 10;
            }
            for (int i = 0; i < bytes.length; i++) {
                System.out.print((char) bytes[i]);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read.", ioe);
        }
    }

    public static void main(String[] args) {
        Secret secret = new Secret();
        secret.printSecret();
    }
}
