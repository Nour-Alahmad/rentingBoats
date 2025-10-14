import java.io.*;
import java.util.*;

public class CSVWriter {

    public static void writeBoats(String path, ArrayList<Boat> boats) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            for (Boat boat : boats) {
                writer.write(boat.getId() + "," + boat.getName());
                writer.newLine();
            }
        }
    }

    public static void writeReservations(String path, ArrayList<Reservation> reservations) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            for (Reservation res : reservations) {
                writer.write(res.getId() + "," + res.getUserId() + "," + res.getBoatId());
                writer.newLine();
            }
        }
    }

    public static void writeUsers(String path, ArrayList<User> users) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            for (User user : users) {
                writer.write(user.getId() + "," + user.getName());
                writer.newLine();
            }
        }
    }
}