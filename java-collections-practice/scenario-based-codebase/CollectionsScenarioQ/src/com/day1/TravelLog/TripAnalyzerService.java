package com.day1.TravelLog;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class TripAnalyzerService {

    // Trips more than 5 days
    public List<Trip> longTrips(List<Trip> trips) {
        return trips.stream()
                .filter(t -> t.getDays() > 5)
                .collect(Collectors.toList());
    }

    // Unique countries
    public Set<String> uniqueCountries(List<Trip> trips) {
        return trips.stream()
                .map(Trip::getCountry)
                .collect(Collectors.toSet());
    }

    // Top 3 cities
    public List<Map.Entry<String, Integer>> topCities(List<Trip> trips) {
        Map<String, Integer> cityCount = new HashMap<>();
        for (Trip t : trips) {
            cityCount.merge(t.getCity(), 1, Integer::sum);
        }

        return cityCount.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    // Regex search in notes
    public void findCitiesMentioned(List<Trip> trips, String word) {
        Pattern p = Pattern.compile(word, Pattern.CASE_INSENSITIVE);
        for (Trip t : trips) {
            Matcher m = p.matcher(t.getNotes());
            if (m.find()) {
                System.out.println("Mention found in: " + t.getCity());
            }
        }
    }
}
