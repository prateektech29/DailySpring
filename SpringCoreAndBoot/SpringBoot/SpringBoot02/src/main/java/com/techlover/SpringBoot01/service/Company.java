package com.techlover.SpringBoot01.service;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Company 
{
	
	static 
	{
		System.out.println("Static block of Company Bean");
	}
	
	{
		System.out.println("Java Instance Block of Company Bean");
	}
	
	public Company()
	{
		System.out.println("Company Bean Created");
	}
	
	@PostConstruct
	public void init()
	{
		System.out.println("Init method of Company");
	}
//	@PostConstruct
//	public void init2()
//	{
//		System.out.println("Initt method of Company");
//	}
	
	public void disp()
	{
		System.out.println("Business logic of Company class");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("Bean Destroyed");
	}

//	@PreDestroy
//	public void destroy2()
//	{
//		System.out.println("Beann Destroyed");
//	}

}
