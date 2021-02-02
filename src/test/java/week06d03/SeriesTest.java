package week06d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SeriesTest {

    @Test
    void testIncreasedSerie() {
        Series series = new Series();
        List<Integer> inc = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(SeriesType.INCREASING, series.calculateSeriesType(inc));
    }

    @Test
    void testDecreasedSerie() {
        Series series = new Series();
        List<Integer> dec = new ArrayList<>(Arrays.asList(9, 7, 5, 3, 1));
        assertEquals(SeriesType.DECREASING, series.calculateSeriesType(dec));
    }

    @Test
    void testCrissCrossedSerie() {
        Series series = new Series();
        List<Integer> crisscross = new ArrayList<>(Arrays.asList(9, 7, 8, 5, 3, 1));
        assertEquals(SeriesType.CRISSCROSS, series.calculateSeriesType(crisscross));
    }

}