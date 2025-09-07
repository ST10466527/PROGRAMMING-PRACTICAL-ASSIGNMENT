package org.example;
import java.util.Scanner;

public class SeriesModel {
    public String SeriesID;
    public String SeriesName;
    public String SeriesAge;
    public String SeriesNumberOfEpisodes;

    public SeriesModel(String id, String name, String age, String seriesNumberOfEpisodes) {
        this.SeriesID = id;
        this.SeriesName = name;
        this.SeriesAge = age;
        this.SeriesNumberOfEpisodes = seriesNumberOfEpisodes;
    }

    public SeriesModel() {
    }

    // Getters
    public String getSeriesID() {
        return SeriesID;
    }

    public String getSeriesName() {
        return SeriesName;
    }

    public String getSeriesAge() {
        return SeriesAge;
    }

    public String getSeriesNumberOfEpisodes() {
        return SeriesNumberOfEpisodes;
    }
}