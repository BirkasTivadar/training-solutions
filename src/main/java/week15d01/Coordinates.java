package week15d01;

import java.util.HashMap;
import java.util.Map;

public class Coordinates {

    public Map<Double, Double> searchMax(Map<Double, Double> coordinates) {
        Map result = new HashMap();
        double max = Double.MIN_VALUE;
        double xMax = 0;
        for (Double x : coordinates.keySet()) {
            if (coordinates.get(x) > max) {
                max = coordinates.get(x);
                xMax = x;
            }
        }
        result.put(xMax, max);
        return result;
    }
}
