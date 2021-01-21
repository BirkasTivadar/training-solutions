package ioreadbytes.byteacount;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class ByteChecker {

    public int readBytesAndFindAs(String fileName) {
        Path path = Path.of(fileName);
        int result = 0;
        try (InputStream inputStream = Files.newInputStream(path)) {
            byte[] bytes = new byte[150];
            int size;
            while ((size = inputStream.read(bytes)) > 0) {
                // for(byte a : bytes){} nem jó, mert ha az utolsó buffer nagyobb, mint a maradék, akkor feltölti a maradékkal buffert, de a buffer többi részében bennemarad az előző maradéka
                for (int i =0; i< size; i++) {
                    if (bytes[i] == 97) {
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
