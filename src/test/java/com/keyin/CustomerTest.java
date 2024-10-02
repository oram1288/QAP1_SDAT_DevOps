package com.keyin;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomerTest {
    @Test
    public void testRentMovie() throws Exception {
        Customer customer = new Customer("Cody Oram", "cody@gmail.com", 709123123);
        Movie movie = new Movie("The Dark Knight","Action","2h 32m", "Christopher Nolan");

        customer.rentMovie(movie, 5);
        assertEquals(1, customer.getRentals().size());
        assertTrue(movie.isRented()); // Movie is added to customer's rental list
    }

    @Test
    public void testEmptyRentalList() {
        Customer customer = new Customer("Cody Oram", "cody@gmail.com", 709123123);

        assertTrue(customer.getRentals().isEmpty()); // No movie rentals in customers list
    }

    @Test
    public void testRentSameMovieTwice() throws Exception {
        Customer customer = new Customer("Cody Oram", "cody@gmail.com", 709123123);
        Movie movie = new Movie("The Dark Knight","Action","2h 32m", "Christopher Nolan");

        customer.rentMovie(movie, 5);
        assertThrows(Exception.class, () -> customer.rentMovie(movie, 5)); // Trying to rent the same movie
    }
}