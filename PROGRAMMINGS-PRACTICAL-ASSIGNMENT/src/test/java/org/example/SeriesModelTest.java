package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class SeriesModelTest {

    @Test
    public void testConstructorAndGetters() {
        SeriesModel model = new SeriesModel("S100", "The Flash", "13", "10");

        assertEquals("S100", model.getSeriesID());
        assertEquals("The Flash", model.getSeriesName());
        assertEquals("13", model.getSeriesAge());
        assertEquals("10", model.getSeriesNumberOfEpisodes());
    }

    @Test
    public void testSetFieldsManually() {
        SeriesModel model = new SeriesModel();
        model.SeriesID = "S200";
        model.SeriesName = "Arrow";
        model.SeriesAge = "16";
        model.SeriesNumberOfEpisodes = "12";

        assertEquals("S200", model.getSeriesID());
        assertEquals("Arrow", model.getSeriesName());
        assertEquals("16", model.getSeriesAge());
        assertEquals("12", model.getSeriesNumberOfEpisodes());
    }
}