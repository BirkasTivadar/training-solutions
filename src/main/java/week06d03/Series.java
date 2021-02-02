package week06d03;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.ArrayList;
import java.util.Arrays;
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

    public static void main(String[] args) {
        Series series = new Series();
        List<Integer> inc = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(series.calculateSeriesType(inc));

        List<Integer> dec = new ArrayList<>(Arrays.asList(9, 7, 5, 3, 1));
        System.out.println(series.calculateSeriesType(dec));

        List<Integer> crisscross = new ArrayList<>(Arrays.asList(9, 7, 8, 5, 3, 1));
        System.out.println(series.calculateSeriesType(crisscross));


    }

}
