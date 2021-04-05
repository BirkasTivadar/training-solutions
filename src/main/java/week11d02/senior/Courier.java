package week11d02.senior;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Courier {

    private List<Ride> rides = new ArrayList<>();

    public void loadRides(String filename) {
        Path path = Path.of(filename);
        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line;
            while ((line = br.readLine()) != null) {
                int day = Integer.parseInt(line.split(", ")[0]);
                int id = Integer.parseInt(line.split(", ")[1]);
                double km = Double.parseDouble(line.split(", ")[2]);
                rides.add(new Ride(day, id, km));
            }
        } catch (IOException ioException) {
            throw new IllegalStateException("Cannot read file", ioException);
        }
    }

    public Ride getFirstRide() {
        List<Ride> temp = new ArrayList<>(rides);
        return Collections.min(temp);
    }

    public List<Integer> getNoWorkDays() {
        int[] isRide = new int[7];
        for (Ride ride : rides) {
            isRide[ride.getDay() - 1]++;
        }
        return getDays(isRide);
    }

    private List<Integer> getDays(int[] isRide) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < isRide.length; i++) {
            if (isRide[i] == 0) {
                result.add(i + 1);
            }
        }
        return result;
    }

    public Map<Integer, Double> getKmByDays() {
        Map<Integer, Double> result = new HashMap<>();
        for (Ride ride : rides) {
            if (!result.containsKey(ride.getDay())) {
                result.put(ride.getDay(), 0.0);
            }
            result.put(ride.getDay(), result.get(ride.getDay()) + ride.getKm());
        }
        return result;
    }

}
