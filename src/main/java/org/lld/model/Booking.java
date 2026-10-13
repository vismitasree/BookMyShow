package org.lld.model;

import java.util.List;

public class Booking {
    int BookingID;
    User user;
    int movieID;
    List<Seat> seatList;
    double bookingPrice;
    BookingStatus bookingStatus;
}
