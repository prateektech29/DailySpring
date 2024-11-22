package com.techlover.service;

import org.springframework.stereotype.Service;

@Service
public class Aeroplane implements ITrip
{

	public Aeroplane()
	{
		System.out.println("Aeroplane Bean created");
	}

	@Override
	public Boolean startTheJourney(Double amount)
	{
		System.out.println("Travelling via Aeroplane &  ticket price paid is "+ amount);
		return true;
	}

}
