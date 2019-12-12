package com.united.services.flightbooking.flight;

import java.util.List;

import com.united.services.flightbooking.domain.entity.Flight;

public interface FlightService {
	
	Flight getFlightById(String flightId);

	List<Flight> getAllFlights();
}
