package com.capgemini;

public abstract class User {
    private static int idCounter = 1;

    protected int userID;
    protected String name;
    protected String email;
    protected String phoneNumber;
    protected int age;

    public User(String name, String email, String phoneNumber, int age) {
        this.userID = idCounter++;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public abstract void logIn(String email, String password);
    public abstract void signUp();

    public void listAllBoats() {
        // Bu metot daha sonra Boat listesini alacak şekilde geliştirilebilir
        System.out.println("Listing all available boats...");
    }

    // Getters (istersen setters da ekleyebiliriz)
    public int getUserID() {
        return userID;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {
        return age;
    }
}
