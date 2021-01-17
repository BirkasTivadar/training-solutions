package ioreadbytes.byteacount;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class ByteChecker {

    public int readBytesAndFindAs(String fileName) {
        Path path = Path.of(fileName);
        int result = 0;
        try (InputStream inputStream = Files.newInputStream(path)) {
            byte[] bytes = new byte[800];
            while ((inputStream.read(bytes)) > 0) {
                for (byte a : bytes) {
                    if (a == 97) {
                        result++;
                    }
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read this file.", ioe);
        }
        return result;
    }
}
