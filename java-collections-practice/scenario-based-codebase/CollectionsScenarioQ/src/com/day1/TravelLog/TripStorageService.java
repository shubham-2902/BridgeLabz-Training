package com.day1.TravelLog;
import java.io.*;
import java.util.List;

public class TripStorageService {

    private static final String FILE = "trips.dat";

    public void saveTrips(List<Trip> trips) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE))) {
            out.writeObject(trips);
        }
    }

    public List<Trip> loadTrips() throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE))) {
            return (List<Trip>) in.readObject();
        }
    }
}
