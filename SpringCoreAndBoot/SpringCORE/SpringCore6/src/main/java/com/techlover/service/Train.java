package com.techlover.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class Train implements ITrip
{
	
	public Train()
	{
		System.out.println("Train Bean created");
	}

	@Override
	public Boolean startTheJourney(Double amount)
	{
		System.out.println("Travelling via Train &  ticket price paid is "+ amount);
		return true;
	}

}
