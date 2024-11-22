package com.techlover.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class Passenger 
{
//	@Autowired
//	@Qualifier("bus")
	private ITrip trip;

//	@Autowired
//	public Passenger(/*@Qualifier("aeroplane")*/ITrip trip)
//	{
//		super();
//		System.out.println("Constructor Injection");
//		this.trip = trip;
//	}
	
	public Passenger() 
	{
		super();
		System.out.println("Passenger Bean created");
	}

	@Autowired
//	@Qualifier("aeroplane")
	public void setTrip(ITrip trip)
	{
		System.out.println("Setter Injection");
		this.trip = trip;
	}
	public Boolean readyForSomeFun(Double amount)
	{
		return trip.startTheJourney(amount);
	}
	
}
