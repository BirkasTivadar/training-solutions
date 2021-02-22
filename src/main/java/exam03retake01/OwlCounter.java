package exam03retake01;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class OwlCounter {

    private Map<String, Integer> owls = new HashMap<>();

    public void readFromFile(BufferedReader reader) {
        try (BufferedReader br = reader) {
            String line;
            while ((line = br.readLine()) != null) {
                owls.put(line.split("=")[0], Integer.parseInt(line.split("=")[1]));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Wrong reader", ioe);
        }
    }

    public Integer getNumberOfOwls(String county) {
        return owls.get(county);
    }

}
