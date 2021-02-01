package week06d03;

import java.util.List;

public class Series {

    public SeriesType calculateSeriesType(List<Integer> serie) {
        if (serie == null || serie.size() < 2) {
            throw new IllegalArgumentException("The list is too small.");
        }
        if (serie.size() == 2) {
            return serie.get(0) < serie.get(1) ? SeriesType.INCREASING : SeriesType.DECREASING;
        }
        boolean inc = true;
        boolean dec = true;
        for (int i = 1; i < serie.size(); i++) {
            if (serie.get(i) > serie.get(i - 1) || serie.get((serie.size() - 2)) < serie.get(serie.size() - 1)) {
                dec = false;
            }
            if (serie.get(i) < serie.get(i - 1) || serie.get(serie.size() - 2) > serie.get(serie.size() - 1)) {
                inc = false;
            }
        }
        if (inc) {
            return SeriesType.INCREASING;
        }
        if (dec) {
            return SeriesType.DECREASING;
        }
        return SeriesType.CRISSCROSS;
    }
}
