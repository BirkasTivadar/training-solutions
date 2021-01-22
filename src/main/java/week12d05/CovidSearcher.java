package week12d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CovidSearcher {

    public int covidSearch() {
        int result = 0;
        int rowIndex = 0;
        Path file = Path.of("src", "main", "resources", "index.html");
        try (BufferedReader br = Files.newBufferedReader(file)) {
            String line;
            while ((line = br.readLine()) != null) {
                rowIndex++;
                if (line.toLowerCase().contains("koronavírus")) {
                    result++;
                    System.out.println(rowIndex);
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read.", ioe);
        }
        return result;
    }

    public static void main(String[] args) {
        CovidSearcher covidSearcher = new CovidSearcher();
        System.out.println(covidSearcher.covidSearch());
    }
}
