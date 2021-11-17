package com.tutorials;

import com.tutorials.model.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Guest guestAdela = new Guest("Adéla", "Malíková", LocalDate.of(1993, 3, 13));
        Guest guestJan = new Guest("Jan", "Dvořáček", LocalDate.of(1995, 5, 5));

        System.out.println(guestAdela.getDescription());
        System.out.println(guestJan.getDescription());


        Room room1 = new Room(1, 1, true, true, new BigDecimal(1000));
        Room room2 = new Room(2, 1, true, true, new BigDecimal(1000));
        Room room3 = new Room(3, 3, false, true, new BigDecimal(2400));

        System.out.println(room1.getDescription());
        System.out.println(room2.getDescription());
        System.out.println(room3.getDescription());

        Booking booking1 = new Booking(room1, LocalDate.of(2021, 7, 19),
                LocalDate.of(2021, 7, 26), BookingType.WORKING, List.of(guestAdela));

        Booking booking2 = new Booking(room3, LocalDate.of(2021, 9, 1),
                LocalDate.of(2021, 9, 14), BookingType.RECREATIONAL, List.of(guestAdela, guestJan));

        BookingList bookingList = new BookingList();
        bookingList.addBooking(booking1);
        bookingList.addBooking(booking2);

        for (int i = 0; i < bookingList.getBookings().size(); i++) {
            Booking b = bookingList.getBookings().get(i);
            System.out.println(b.getDescription());
        }

    }
}
