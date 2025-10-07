package com.capgemini;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Admin extends User {
    private String password;
    private List<Boat> boats;

    public Admin(String name, String email, String phoneNumber, int age, String password) {
        super(name, email, phoneNumber, age);
        this.password = password;
        this.boats = new ArrayList<>();
    }

    @Override
    public void logIn(String email, String password) {
        if (this.email.equals(email) && this.password.equals(password)) {
            System.out.println("Admin logged in successfully.");
        } else {
            System.out.println("Login failed.");
        }
    }

    @Override
    public void signUp() {
        System.out.println("Admin signed up: " + name);
    }

    public void addBoat(Boat boat) {
        boats.add(boat);
        System.out.println("Boat added: " + boat.getName());
    }

    public void editBoat(int boatID, String newName, String newType, List<LocalDate> unavailableDates) {
        for (Boat boat : boats) {
            if (boat.getBoatID() == boatID) {
                boat.setName(newName);
                boat.setType(newType);
                boat.setUnavailableDates(unavailableDates);
                System.out.println("Boat updated: " + boat.getName());
                return;
            }
        }
        System.out.println("Boat not found.");
    }

    public void deleteBoat(int boatID) {
        boats.removeIf(boat -> boat.getBoatID() == boatID);
        System.out.println("Boat deleted with ID: " + boatID);
    }

    public List<Boat> getBoats() {
        return boats;
    }
}