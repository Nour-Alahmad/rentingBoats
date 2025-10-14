package com.capgemini;
import java.io.File;
import java.util.ArrayList; 

public class Application {

    public static void main(String[] args) {
        System.out.println("Hello World! Hiiii");
    }






  try {
            ArrayList<Boat> boats = CSVReader.readBoats("boats.csv");
            ArrayList<Reservation> reservations = CSVReader.readReservations("reservations.csv");
            ArrayList<User> users = CSVReader.readUsers("users.csv");
           

        } catch (IOException e) {
            System.err.println("Error reading CSV files: " + e.getMessage());
        }













    

    //-------------------

     private static void readBoatsCsv( File csvFile) {
        try {
            List<String> lines = File.readAllLines(csvFile);
            for (String line : lines) {

                 switch (lines[0]) {
                case "boats":
                  {
                       String[] parts = line.split("\t");
                

ArrayList<String> boats = new ArrayList<String>();                
                } break;
                  case "reservations":
                  {

                  } break;
                  case "users":{

                  }
                    break;
  default:
System.out.print("")
                }

            }
        } catch (IOException e) {
            System.err.println("Could not read todo items.");
        }
    }
}
