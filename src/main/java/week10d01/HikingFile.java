package week10d01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class HikingFile {

    public static final String SEPARATOR = ", ";

    public ChangeAltitude getPlusElevation(InputStream inputStream) {

        List<Integer> altitudes = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                int altitude = Integer.parseInt(line.split(SEPARATOR)[2]);
                altitudes.add(altitude);
            }
        } catch (IOException ioException) {
            throw new IllegalStateException("Can not read file", ioException);
        }
        return getChangeAltitude(altitudes);
    }

    private ChangeAltitude getChangeAltitude(List<Integer> altitudes) {
        int elevation = 0;
        int inclination = 0;
        for (int i = 1; i < altitudes.size(); i++) {
            if (altitudes.get(i) > altitudes.get(i - 1)) {
                elevation += altitudes.get(i) - altitudes.get(i - 1);
            } else {
                inclination += altitudes.get(i - 1) - altitudes.get(i);
            }
        }
        return new ChangeAltitude(elevation, inclination);
    }

}
