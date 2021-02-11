package week15d04;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CovidCounter {

    private List<String> threeMostCasesWeek(){


    }

    private Map<String, Integer> filterByHungary(String line) {
        Map<String, Integer> result = new HashMap<>();
        String[] lineArr = line.split(",");
        if (lineArr[4].equals("Hungary")) {
            result.put(lineArr[1], Integer.parseInt(lineArr[2]));
        }
        return result;
    }

    public List<String> loadFile() {
        Path path = Path.of("data.csv");
        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line = br.readLine();
            while ((line = br.readLine()) != null) {
                filter
            }

        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }
}
