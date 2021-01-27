package week13d03;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Beosztas {

    public int hoursCounter(String name) {
        Path path = Path.of("beosztas.txt")
        int result = 0;
        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.trim().equals(name)) {
                    br.readLine();
                    br.readLine();
                    result += Integer.parseInt(br.readLine().trim());
                }
            }

        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read.", ioe);
        }
        return result;
    }
}
