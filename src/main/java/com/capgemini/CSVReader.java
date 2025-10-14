import java.io.*;
import java.nio.file.*;
import java.util.*;

public class CSVReader {

    public static ArrayList<Boat> readBoats(String path) throws IOException {
       ArrayList<Boat> boats = new ArrayList<>();
        ArrayList<String> lines = Files.readAllLines(Paths.get(path));
        for (String line : lines) {
            String[] parts = line.split(",");
            boats.add(new Boat(parts[0], parts[1], parts[2],parts[3])); 
        }
        return boats;
    }

    public static ArrayList<Reservation> readReservations(String path) throws IOException {
        ArrayList<Reservation> reservations = new ArrayList<>();



        ArrayList<String> lines = Files.readAllLines(Paths.get(path));
        for (String line : lines) {
            String[] parts = line.split(",");
            reservations.add(new Reservation(parts[0], parts[1], parts[2],parts[3]));
        }
        return reservations;
    }

    public static ArrayList<User> readUsers(String path) throws IOException {
        ArrayList<User> users = new ArrayList<>();
        ArrayList<String> lines = Files.readAllLines(Paths.get(path));
        for (String line : lines) {
            String[] parts = line.split(",");
            users.add(new User(parts[0], parts[1],parts[2],parts[3]));
        }
        return users;
    }
}