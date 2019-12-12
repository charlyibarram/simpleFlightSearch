package com.united.services.flightbooking.booking;

import java.util.List;

import com.united.services.flightbooking.domain.entity.FlightBooking;

public interface BookingService {

    List<FlightBooking> getAllMultiFlightBookings();

    List<FlightBooking> getAllBookingsByPassenger(String passengerId);

    FlightBooking getBooking(String bookingId);

    List<FlightBooking> getAllMultiFlightBookingsByPassenger(String passengerId);

    void createSampleBookings();

}
