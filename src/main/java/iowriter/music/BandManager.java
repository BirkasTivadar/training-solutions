package iowriter.music;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class BandManager {

    private List<Band> bandsList = new ArrayList<>();

    public List<Band> getBandsList() {
        return bandsList;
    }

    public void readBandsFromFile(Path path) {
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] bandArray = line.split(";");
                int bandYear = Integer.parseInt(bandArray[1]);
                bandsList.add(new Band(bandArray[0], bandYear));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read.", ioe);
        }
    }

    private List<Band> bandsBefore(int year) {
        List<Band> bandList = new ArrayList<>();
        for (Band band : bandsList) {
            if (band.getYear() < year) {
                bandList.add(band);
            }
        }
        return bandList;
    }

    public void writeBandsBefore(Path path, int year) {
        List<Band> bands = bandsBefore(year);
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            for (Band band : bands) {
                writer.write(band.getName() + ";" + band.getYear());
                writer.newLine();
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write.", ioe);
        }
    }


}
