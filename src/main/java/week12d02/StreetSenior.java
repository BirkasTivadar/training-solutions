package week12d02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreetSenior {

    private List<Parcel> soldParcels = new ArrayList<>();

    public List<Parcel> getSoldParcels() {
        return new ArrayList<>(soldParcels);
    }

    public void loadParcels() {
        Path path = Path.of("kerites.txt");
        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line;
            while ((line = br.readLine()) != null) {
                int side = Integer.parseInt(line.split(" ")[0]);
                int width = Integer.parseInt(line.split(" ")[1]);
                char color = line.split(" ")[2].charAt(0);
                soldParcels.add(new Parcel(side, width, color));
            }
        } catch (IOException ioException) {
            throw new IllegalStateException("Cannot read file", ioException);
        }
    }

    public List<Parcel> sortedByWidth() {
        List<Parcel> temp = getSoldParcels();
        Collections.sort(temp);
        return temp;
    }

    public int getLastSoldSite() {
        Parcel lastSite = soldParcels.get(soldParcels.size() - 1);
        int result = 0;
        for (Parcel parcel : soldParcels) {
            if (lastSite.getSide() == parcel.getSide()) {
                result++;
            }
        }
        return lastSite.getSide() == 0 ? result * 2 : result * 2 - 1;
    }

    public void writeOddSite() {
        Path file = Path.of("soldParcelsInOddSide.txt");
        try (BufferedWriter writer = Files.newBufferedWriter(file)) {
            selectAndWrite(writer);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write file", ioe);
        }
    }

    private void selectAndWrite(BufferedWriter writer) throws IOException {
        int houseNumber = 1;
        for (Parcel parcel : soldParcels) {
            if (parcel.getSide() == 1) {
                StringBuilder parcelInString = new StringBuilder();
                String color = String.valueOf(parcel.getColorOfFence());
                int width = parcel.getWidth();
                parcelInString.append("(").append(houseNumber).append(")").append(color.repeat(width));
                writer.write(parcelInString.toString());
                houseNumber += 2;
            }
        }
    }


}
