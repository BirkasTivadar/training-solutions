package week08d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CountryStatistics {

    private List<Country> countries = new ArrayList<>();

    public List<Country> getCountries() {
        return new ArrayList<>(countries);
    }

    public Country maxPopulaton() {
        Path path = Path.of("countries.txt");
        try (BufferedReader br = Files.newBufferedReader(path)) {
            loadCountries(br);
        } catch (IOException ioException) {
            throw new IllegalStateException("Cannot read", ioException);
        }
        Collections.sort(countries);
        return countries.get(0);
    }

    private void loadCountries(BufferedReader br) throws IOException {
        String line;
        while ((line = br.readLine()) != null) {
            String[] lineArr = line.split(" ");
            String name = lineArr[0];
            int population = Integer.parseInt(lineArr[1]);
            int coloursOfFlag = Integer.parseInt(lineArr[2]);
            int neighbours = Integer.parseInt(lineArr[3]);
            countries.add(new Country(name, population, coloursOfFlag, neighbours));
        }
    }

    public static void main(String[] args) {
        CountryStatistics countryStatistics = new CountryStatistics();
        System.out.println(countryStatistics.maxPopulaton());
    }
}
