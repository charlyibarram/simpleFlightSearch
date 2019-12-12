package com.united.services.flightbooking.airport;

import java.util.List;

import com.united.services.flightbooking.domain.entity.Airport;

public interface AirportService {
	Airport getAirportById(String airportId);
	List<Airport> getAllAirports();
}
