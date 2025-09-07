package org.example;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SeriesTest {

    @Before
    public void resetSeriesList() {
        Series.seriesList.clear();
        Series.seriesList.add(new SeriesModel("S001", "Stranger Things", "16", "8"));
    }

    @Test
    public void testGetSeriesFound() {
        SeriesModel result = Series.getSeries("S001");
        assertNotNull(result);
        assertEquals("Stranger Things", result.getSeriesName());
    }

    @Test
    public void testGetSeriesNotFound() {
        SeriesModel result = Series.getSeries("S404");
        assertNull(result);
    }

    @Test
    public void testIsAgeValid() {
        assertTrue(Series.isAgeValid("15"));
        assertFalse(Series.isAgeValid("2"));
        assertFalse(Series.isAgeValid("abc"));
    }

    @Test
    public void testAddSeriesIncreasesListSize() {
        int originalSize = Series.seriesList.size();
        Series.seriesList.add(new SeriesModel("S010", "Breaking Bad", "18", "5"));
        assertEquals(originalSize + 1, Series.seriesList.size());
    }
}