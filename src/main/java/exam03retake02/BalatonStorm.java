package exam03retake02;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class BalatonStorm {

    public List<String> getStationsInStorm(BufferedReader reader) {
        List<String> result = new ArrayList<>();
        try (BufferedReader br = reader) {
            String line;
            String station = null;
            while ((line = br.readLine()) != null) {
                station = getStationIfStorm(result, line, station);
            }
        } catch (IOException ioException) {
            throw new IllegalStateException("Cannot read", ioException);
        }
        Collections.sort(result, Collator.getInstance(new Locale("hu", "HU")));
        return result;
    }

    private String getStationIfStorm(List<String> result, String line, String station) {
        int level;
        if (line.contains("allomas")) {
            String temp = line.split(":")[1];
            station = temp.substring(2, temp.length() - 2);
        }
        if (line.contains("level")) {
            level = Integer.parseInt(line.split(":")[1].trim().substring(0, 1));
            if (level == 3) {
                result.add(station);
            }
        }
        return station;
    }
}



