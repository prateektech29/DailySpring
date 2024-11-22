package com.techlover.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service

public class Bus implements ITrip {

	public Bus()
	{
		System.out.println("Bus Bean Created");
	}
	
	@Override
	public Boolean startTheJourney(Double amount) {
		System.out.println("Travelling via Bus &  ticket price paid is "+ amount);
		return true;
	}

}
