package com.day1.TravelLog;

import java.util.ArrayList;
import java.util.List;

public class TravelLogApp {
    public static void main(String[] args) throws Exception {

        TripStorageService storage = new TripStorageService();
        TripAnalyzerService analyzer = new TripAnalyzerService();

        List<Trip> trips = new ArrayList<>();
        trips.add(new Trip("Paris", "France", 7, "Visited Eiffel Tower"));
        trips.add(new Trip("Rome", "Italy", 4, "Colosseum was amazing"));
        trips.add(new Trip("Paris", "France", 3, "Food trip"));
        trips.add(new Trip("Tokyo", "Japan", 8, "Cherry blossom season"));

        storage.saveTrips(trips);

        List<Trip> loadedTrips = storage.loadTrips();

        System.out.println("Trips > 5 days:");
        analyzer.longTrips(loadedTrips).forEach(System.out::println);

        System.out.println("\nUnique Countries:");
        System.out.println(analyzer.uniqueCountries(loadedTrips));

        System.out.println("\nTop Cities:");
        analyzer.topCities(loadedTrips).forEach(System.out::println);

        System.out.println("\nSearching notes for 'Eiffel':");
        analyzer.findCitiesMentioned(loadedTrips, "Eiffel");
    }
}
