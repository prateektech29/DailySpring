package com.techlover.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techlover.service.Passenger;

public class LaunchApp1
{

	public static void main(String[] args)
	{
		//BeanFactory
		//ApplicationContext
		
		
		ApplicationContext container=new ClassPathXmlApplicationContext("applicationconfig.xml");

		Passenger rohit = container.getBean(Passenger.class);
		
		Boolean status=rohit.readyForSomeFun(2500.0);
		if(status)
			System.out.println("Holidays were awesome");
		else
			System.out.println("sorry but your trip is cancelled");
	}

}
