package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Series {
    private static final Scanner scanner = new Scanner(System.in);
    static final ArrayList<SeriesModel> seriesList = new ArrayList<>();

    public static void addNewSeries() {
        System.out.println("=== Add a New TV Series ===");

        System.out.print("Series ID: ");
        String id = scanner.nextLine();

        System.out.print("Series Name: ");
        String name = scanner.nextLine();

        String ageRestriction;
        while (true) {
            System.out.print("Age Restriction (between 3 and 18): ");
            ageRestriction = scanner.nextLine();
            if (isAgeValid(ageRestriction)) break;
            System.out.println("Invalid age. Please enter a number between 3 and 18.");
        }

        System.out.print("Number of Episodes: ");
        String episodeCount = scanner.nextLine();

        SeriesModel series = new SeriesModel(id, name, ageRestriction, episodeCount);
        seriesList.add(series);

        System.out.println("Series successfully added.\n");
    }

    public static void findSeriesById() {
        System.out.print("Enter Series ID to search: ");
        String id = scanner.nextLine();
        SeriesModel found = getSeries(id);

        if (found != null) {
            displaySeries(found);
        } else {
            System.out.println("No series found with ID: " + id);
        }
    }

    public static void modifySeries() {
        System.out.print("Enter Series ID to update: ");
        String id = scanner.nextLine();
        SeriesModel series = getSeries(id);

        if (series != null) {
            System.out.print("New Series Name: ");
            series.SeriesName = scanner.nextLine();

            String newAge;
            while (true) {
                System.out.print("New Age Restriction: ");
                newAge = scanner.nextLine();
                if (isAgeValid(newAge)) break;
                System.out.println("Invalid age. Try again.");
            }
            series.SeriesAge = newAge;

            System.out.print("New Number of Episodes: ");
            series.SeriesNumberOfEpisodes = scanner.nextLine();

            System.out.println("Series updated.");
        } else {
            System.out.println("Series ID not found.");
        }
    }

    public static void removeSeries() {
        System.out.print("Enter Series ID to delete: ");
        String id = scanner.nextLine();
        SeriesModel toDelete = getSeries(id);

        if (toDelete != null) {
            System.out.print("Confirm deletion (Y to delete): ");
            String confirm = scanner.nextLine();
            if (confirm.equalsIgnoreCase("Y")) {
                seriesList.remove(toDelete);
                System.out.println("Series removed.");
            } else {
                System.out.println("Deletion cancelled.");
            }
        } else {
            System.out.println("No series found with that ID.");
        }
    }

    public static void showAllSeries() {
        if (seriesList.isEmpty()) {
            System.out.println("No series available.");
            return;
        }

        int index = 1;
        for (SeriesModel s : seriesList) {
            System.out.println("\n--- Series " + index++ + " ---");
            displaySeries(s);
        }
    }

    public static void closeApp() {
        System.out.println("Application exited.");
        System.exit(0);
    }

    static SeriesModel getSeries(String id) {
        for (SeriesModel s : seriesList) {
            if (s.SeriesID.equalsIgnoreCase(id)) {
                return s;
            }
        }
        return null;
    }

    static boolean isAgeValid(String age) {
        try {
            int value = Integer.parseInt(age);
            return value >= 3 && value <= 18;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static void displaySeries(SeriesModel s) {
        System.out.println("Series ID: " + s.SeriesID);
        System.out.println("Series Name: " + s.SeriesName);
        System.out.println("Age Restriction: " + s.SeriesAge);
        System.out.println("Episodes: " + s.SeriesNumberOfEpisodes);
    }
}
