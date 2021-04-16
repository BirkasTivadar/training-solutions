package week13d01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CitySearchSenior {

    private static final String SEPARATOR = ";";

    public String search() {
        String cityZip;
        String cityName;
        String abcFirst = "";
        String zipFirst = "";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(CitySearch.class.getResourceAsStream("/iranyitoszamok-varosok-2021.csv")))) {
            String line = reader.readLine();
            while ((line = reader.readLine()) != null) {
                cityZip = line.split(SEPARATOR)[0];
                cityName = line.split(SEPARATOR)[1];
                if (abcFirst.isBlank()) {
                    abcFirst = cityName;
                    zipFirst = cityZip;
                } else {
                    if (cityName.compareTo(abcFirst) < 0) {
                        abcFirst = cityName;
                        zipFirst = cityZip;
                    }
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read", ioe);
        }
        return String.format("%s: %s", abcFirst, zipFirst);
    }
}
