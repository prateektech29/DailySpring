package com.techlover.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class Greetings
{
	@Autowired
	private LocalDateTime time;
	
	public Greetings()
	{
		System.out.println("Greetings bean created");
	}
	
	public String generateGreeeting(String name)
	{
		int hour=time.getHour();
		if (hour >=4 && hour<12)
		{
			return "good morning "+ name;
		}
		else if (hour>=12 && hour<16)
		{
			return "good afternoon "+ name;
		}
		else if (hour>=16  && hour<19)
		{
			return "good evening "+  name;
		}
		else
		return "Good night "+ name;
	}
	

}
