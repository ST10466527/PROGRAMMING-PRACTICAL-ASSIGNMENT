package org.example;
import java.util.Scanner;

public class TVSeriesApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Preparing to start the application
        System.out.println("LATEST SERIES-2025");
        System.out.println("***************************");
        System.out.println("Enter (1) to launch menu or any other key to exit");
        String input = scanner.nextLine();

        if (input.equals("1")) {
            showMainMenu(scanner);
        } else {
            System.out.println("Exiting application. Goodbye!");
        }
    }

    public static void showMainMenu(Scanner scanner) {
        int option;
        do {
            System.out.println("\nPlease select one of the following menu items:");
            System.out.println("(1) Capture a new series.");
            System.out.println("(2) Search for a series.");
            System.out.println("(3) Update series age restriction.");
            System.out.println("(4) Delete a series.");
            System.out.println("(5) Print series report - 2025.");
            System.out.println("(6) Exit Application.");

            try {
                option = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            switch (option) {
                case 1:
                    Series.addNewSeries();
                    break;
                case 2:
                    Series.findSeriesById();
                    break;
                case 3:
                    Series.modifySeries();
                    break;
                case 4:
                    Series.removeSeries();
                    break;
                case 5:
                    Series.showAllSeries();
                    break;
                case 6:
                    Series.closeApp();
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (true);
    }
}