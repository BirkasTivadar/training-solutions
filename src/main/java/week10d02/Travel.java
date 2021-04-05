package week10d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class Travel {

    public static int getStopWithMax(InputStream inputStream) {
        int[] numbersOfStations = new int[30];
        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                int i = Integer.parseInt(line.split(" ")[0]);
                numbersOfStations[i]++;
            }
        } catch (IOException ioException) {
            throw new IllegalStateException("Can not read file", ioException);
        }
        return getMax(numbersOfStations);
    }

    private static int getMax(int[] numbersOfStations) {
        int max = 0;
        int pos = 0;
        for (int i = 0; i < numbersOfStations.length; i++) {
            if (numbersOfStations[i] > max) {
                max = numbersOfStations[i];
                pos = i;
            }
        }
        return pos;
    }
}
