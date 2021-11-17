package com.tutorials.model;

import java.time.LocalDate;
import java.util.List;

public class Booking {

    private Room room;
    private LocalDate dateFrom;
    private LocalDate dateTo;
    private BookingType bookingType;
    private List<Guest> guests;

    public Booking(Room room, LocalDate dateFrom, LocalDate dateTo, BookingType bookingType, List<Guest> guests) {
        this.room = room;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.bookingType = bookingType;
        this.guests = guests;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public LocalDate getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(LocalDate dateFrom) {
        this.dateFrom = dateFrom;
    }

    public LocalDate getDateTo() {
        return dateTo;
    }

    public void setDateTo(LocalDate dateTo) {
        this.dateTo = dateTo;
    }

    public BookingType getBookingType() {
        return bookingType;
    }

    public void setBookingType(BookingType bookingType) {
        this.bookingType = bookingType;
    }

    public List<Guest> getGuests() {
        return guests;
    }

    public void setGuests(List<Guest> guests) {
        this.guests = guests;
    }

    public String getDescription() {
        return "Rezervace na pokoj č." + room.getId() + ", počet hostů: " + guests.size() + ", v termínu " + dateFrom.toString() + " - " + dateTo.toString();
    }
}
