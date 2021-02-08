package week15d01;

import java.util.Map;

public class Coordinates {

    public Map.Entry<Double, Double> searchMax(Map<Double, Double> coordinates) {
        Map.Entry<Double, Double> result = null;
        for (Map.Entry<Double, Double> entry : coordinates.entrySet()) {
            if (result == null || entry.getValue() > result.getValue()) {
                result = entry;
            }
        }
        return result;
    }
}
