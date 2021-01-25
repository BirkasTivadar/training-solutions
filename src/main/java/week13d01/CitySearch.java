package week13d01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;

public class CitySearch {

    public String search() {
        int max = 0;
        String longestName = "";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(CitySearch.class.getResourceAsStream("/iranyitoszamok-varosok-2021.csv")))) {
            String line;
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] cn = line.split(";");
                String name = cn[1].trim();
                if (name.length() > max) {
                    max = name.length();
                    longestName = name;
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read", ioe);
        }
        return longestName;
    }

    public static void main(String[] args) {
        CitySearch citySearch = new CitySearch();

        System.out.println(citySearch.search());
    }
}
