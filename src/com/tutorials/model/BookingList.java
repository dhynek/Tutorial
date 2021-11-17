package com.tutorials.model;

import java.util.ArrayList;
import java.util.List;

public class BookingList {

    private final List<Booking> bookings = new ArrayList<>();

    public void addBooking(Booking booking) {
        this.bookings.add(booking);
    }

    public void removeBooking(Booking booking) {
        this.bookings.remove(booking);
    }

    public void deleteAllBookings() {
        this.bookings.clear();
    }

    public List<Booking> getBookings() {
        return bookings;
    }

}
