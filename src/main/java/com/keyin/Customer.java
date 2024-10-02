package com.keyin;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String email;
    private int phoneNum;
    private List<Rental> rentals;

    public Customer (String name, String email, int phoneNum) {
        this.name = name;
        this.rentals = new ArrayList<>();
    }

    // Getter
    public String getName() {
       return name;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setRentals(List<Rental> rentals) {
        this.rentals = rentals;
    }

    public void rentMovie(Movie movie, int daysRented) throws Exception {
        Rental rental = new Rental(movie, daysRented);
        rentals.add(rental);
    }
}
