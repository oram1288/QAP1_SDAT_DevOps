package com.keyin;

public class RentalSystem {
    public static void main(String[] args) throws Exception {
        Customer customer = new Customer("Cody Oram", "cody@gmail.com", "709-123-4567");
        Movie movie1 = new Movie("Avengers: Endgame", "Sci-Fi", "3h 1m", "Anthony Russo, Joe Russo");
        Movie movie2 = new Movie("The Dark Knight","Action","2h 32m", "Christopher Nolan");

        customer.rentMovie(movie1,5);
        customer.rentMovie(movie2,3);

        for (Rental rental : customer.getRentals()) {
            System.out.println("Movie: " + rental.getMovie().getTitle() + "\n"
                    + "Days Rented: " + rental.getDaysRented() + "\n"
                    + "Customer: " + "\n"
                    + " Name: " + customer.getName() + "\n"
                    + " Email: " + customer.getEmail() + "\n"
                    + " Phone Number: " + customer.getPhoneNum() + "\n"
            );
        }
    }
}
