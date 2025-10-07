package com.capgemini;

public class Customer extends User {
    private String password;

    public Customer(String name, String email, String phoneNumber, int age, String password) {
        super(name, email, phoneNumber, age);
        this.password = password;
    }

    @Override
    public void logIn(String email, String password) {
        if (this.email.equals(email) && this.password.equals(password)) {
            System.out.println("Customer logged in successfully.");
        } else {
            System.out.println("Login failed.");
        }
    }

    @Override
    public void signUp() {
        System.out.println("Customer signed up: " + name);
    }

    public void addReservation(int boatID, String date) {
        System.out.println("Reservation added for boat ID " + boatID + " on " + date);
    }

    public void cancelReservation(int reservationID) {
        System.out.println("Reservation cancelled with ID: " + reservationID);
    }
}
