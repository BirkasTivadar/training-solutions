package ioreaderclasspath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CountryStatistics {

    private List<Country> countryList = new ArrayList<>();

    public List<Country> getCountryList() {
        return new ArrayList<>(countryList);
    }

    public int numberOFCountries() {
        return countryList.size();
    }

    public Country mostBorderCountries() {
        Country result = countryList.get(0);
        int max = countryList.get(0).getBorderCountries();
        for (Country country : countryList) {
            if (country.getBorderCountries() > max) {
                result = country;
                max = country.getBorderCountries();
            }
        }
        return result;
    }

    public List<Country> readFromFile(String fileName) {
        List<String> countries = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(CountryStatistics.class.getResourceAsStream("/" + fileName)))) {
            String line;
            while ((line = reader.readLine()) != null) {
                countries.add(line);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
        for (String countryString : countries) {
            String name = countryString.split(" ")[0];
            int borders = Integer.parseInt(countryString.split(" ")[1]);
            countryList.add(new Country(name, borders));
        }
        return countryList;
    }
}
