package com.workshop.smartcitytransportmgmt;
import java.util.*;
import java.util.stream.*;
public class MainApp {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        FareCalculator busFare = d -> d * 2.0;
        FareCalculator metroFare = d -> d * 1.5;
        FareCalculator taxiFare = d -> d * 5 + 20;

        TransportService bus = new BusService(busFare);
        TransportService metro = new MetroService(metroFare);
        TransportService taxi = new TaxiService(taxiFare);
        TransportService ambulance = new AmbulanceService(d -> 0);

        List<TransportService> services = Arrays.asList(bus, metro, taxi, ambulance);
        List<Passenger> passengers = new ArrayList<>();
        List<Trip> trips = new ArrayList<>();

        while (true) {
            System.out.println("\n==== SMART CITY TRANSPORT MENU ====");
            System.out.println("1. Book Trip (Show Services by Fare)");
            System.out.println("2. Add Passenger");
            System.out.println("3. Add Trip Record");
            System.out.println("4. View Passenger Grouping");
            System.out.println("5. Revenue Report");
            System.out.println("6. Emergency Services Check");
            System.out.println("7. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter trip distance: ");
                    double distance = sc.nextDouble();

                    services.stream()
                            .sorted(Comparator.comparing(s -> s.getFare(distance)))
                            .forEach(s -> {
                                s.printServiceDetails();
                                System.out.println("Fare: " + s.getFare(distance));
                            });
                    break;

                case 2:
                    sc.nextLine();
                    System.out.print("Passenger name: ");
                    String name = sc.nextLine();
                    System.out.print("Route: ");
                    String route = sc.nextLine();

                    passengers.add(new Passenger(name, route));
                    System.out.println("Passenger added!");
                    break;

                case 3:
                    sc.nextLine();
                    System.out.print("Route: ");
                    String tripRoute = sc.nextLine();
                    System.out.print("Fare: ");
                    double fare = sc.nextDouble();
                    System.out.print("Peak time? (true/false): ");
                    boolean peak = sc.nextBoolean();

                    trips.add(new Trip(tripRoute, fare, peak));
                    System.out.println("Trip recorded!");
                    break;

                case 4:
                    Map<String, List<Passenger>> grouped =
                            passengers.stream().collect(Collectors.groupingBy(Passenger::getRoute));

                    grouped.forEach((r, list) ->
                            System.out.println(r + " -> " + list.size() + " passengers"));
                    break;

                case 5:
                    DoubleSummaryStatistics stats =
                            trips.stream().collect(Collectors.summarizingDouble(Trip::getFare));

                    System.out.println("Total Revenue: " + stats.getSum());
                    System.out.println("Average Fare: " + stats.getAverage());

                    Map<Boolean, List<Trip>> partition =
                            trips.stream().collect(Collectors.partitioningBy(Trip::isPeakTime));

                    System.out.println("Peak Trips: " + partition.get(true).size());
                    System.out.println("Non-Peak Trips: " + partition.get(false).size());
                    break;

                case 6:
                    services.forEach(s -> {
                        if (s instanceof EmergencyService) {
                            System.out.println(s.getClass().getSimpleName() + " has priority clearance");
                        }
                    });
                    break;

                case 7:
                    System.out.println("System shutting down...");
                    return;

                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}
