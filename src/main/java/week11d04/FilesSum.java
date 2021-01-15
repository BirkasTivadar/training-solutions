package week11d04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FilesSum {

    private int readFile(Path path) {
        int number = 0;
        if (Files.isRegularFile(path)) {
            try {
                String content = Files.readString(path);
                try {
                    number = Integer.parseInt(content);
                } catch (NumberFormatException nfe) {
                    System.out.println("");
                }
            } catch (IOException ioe) {
                throw new IllegalStateException("Can not read file", ioe);
            }
        }
        return number;
    }



}
