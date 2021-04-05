package week08d05;


import week08d04.ExamplesStore;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Plane {

    public int getLongestPartOfOcean() {
        Path path = Path.of("map.txt");
        int max = 0;
        int temp = 0;
        boolean ocean = false;
        try (InputStream inputStream = Files.newInputStream(path)) {
            byte[] bytes = new byte[1];
            int size;
            while ((size = inputStream.read(bytes)) > 0) {
                if (bytes[0] == '0') {
                    ocean = true;
                }
                if (bytes[0] == '1') {
                    ocean = false;
                    temp = 0;
                }
                if (ocean) {
                    temp++;
                }
                if (temp > max) {
                    max = temp;
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read this file.", ioe);
        }
        return max;
    }

    public static void main(String[] args) {
        Plane plane = new Plane();
        System.out.println(plane.getLongestPartOfOcean());
    }
}