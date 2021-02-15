package exam03;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Path;

public class Histogram {

    public String createHistogram(BufferedReader reader) {
        StringBuilder str = new StringBuilder();
        try (BufferedReader br = reader) {
            String line;
            while ((line = br.readLine()) != null) {
                int counter = Integer.parseInt(line);
                for (int i = 1; i <= counter; i++) {
                    str.append("*");
                }
                str.append("\n");
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read");
        }
        return str.toString();
    }

}