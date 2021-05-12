package week13d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Airport {

    private static final String DEPARTURE = "Departure";

    private static final String ARRIVAL = "Arrival";

    private List<Catalog> catalogs = new ArrayList<>();

    public List<Catalog> getCatalogs() {
        return new ArrayList<>(catalogs);
    }


    public void loadFile(String fileName) {

        if (fileName == null || fileName.isBlank()) {
            throw new IllegalArgumentException("Invalid filename.");
        }

        Path path = Path.of(fileName);

        try (BufferedReader br = Files.newBufferedReader(path)) {

            String line;

            while ((line = br.readLine()) != null) {
                String[] splitted = line.split(" ");
                addCatalog(splitted);
            }

        } catch (IOException e) {
            throw new IllegalStateException("Can not read.");
        }
    }


    private void addCatalog(String[] data) {

        String flyNumber = data[0];
        String direction = data[1];
        String city = data[2];
        String time = data[3];

        int hours = Integer.parseInt(time.split(":")[0]);
        int minutes = Integer.parseInt(time.split(":")[1]);

        catalogs.add(new Catalog(flyNumber, direction, city, LocalTime.of(hours, minutes)));
    }


    public String moreDirection() {

        int arr = 0;

        int halfSize = catalogs.size() / 2;

        for (Catalog item : catalogs) {

            if (item.getDirection().equals(ARRIVAL)) {
                arr++;
            }

            if (halfSize < arr) {
                return ARRIVAL;
            }
        }
        return (arr == halfSize) ? "Both" : DEPARTURE;
    }


    public Catalog searchFlyNumber(String flyNr) {

        if (flyNr == null || flyNr.isBlank()) {
            throw new IllegalArgumentException("Invalid flynumber");
        }

        for (Catalog item : catalogs) {

            if (item.getFlyNumber().equals(flyNr)) {
                return item;
            }
        }

        throw new IllegalArgumentException("Wrong flynumber");
    }


    public List<Catalog> getCityToDirection(String city, String direction) {

        if (city == null || city.isBlank()) {
            throw new IllegalArgumentException("invalid city");
        }

        if (direction == null || invalidDirection(direction)) {
            throw new IllegalArgumentException("Invalid direction");
        }

        return catalogs.stream().filter(e -> e.getCity().equals(city) && e.getDirection().equals(direction)).collect(Collectors.toList());
    }


    private boolean invalidDirection(String str) {

        return !str.equals(ARRIVAL) && !str.equals(DEPARTURE);
    }


    public Catalog getFirstDepartures() {

        return catalogs.stream().filter(e -> e.getDirection().equals(DEPARTURE)).min(Comparator.comparing(Catalog::getTime)).get();
    }
}