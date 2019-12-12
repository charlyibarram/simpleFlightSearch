package com.united.services.flightbooking.passenger;

import java.util.List;

import com.united.services.flightbooking.domain.entity.Passenger;

public interface PassengerService {
	
	Passenger getPassengerById(String passengerId);

	List<Passenger> getAllPassengers();
}
