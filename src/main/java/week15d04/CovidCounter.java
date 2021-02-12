package week15d04;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class CovidCounter {

    private List<CovidStat> covidStats = new ArrayList<>();

    private void filterByHungary(String line) {
        String[] lineArr = line.split(",");
        if (lineArr[4].equals("Hungary")) {
            covidStats.add(new CovidStat(lineArr[1], Integer.parseInt(lineArr[2])));
        }
    }

    public void loadFile(String fileName) {
        Path path = Path.of(fileName);
        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line = br.readLine();
            while ((line = br.readLine()) != null) {
                filterByHungary(line);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public List<CovidStat> threeMostWeek(String fileName) {
        loadFile(fileName);
        List<CovidStat> result = new ArrayList<>(covidStats);
        Collections.sort(result);
        return result.subList(0, 3);
    }

    public static void main(String[] args) {
        CovidCounter covidCounter = new CovidCounter();
        System.out.println(covidCounter.threeMostWeek("data.csv"));
    }
}
