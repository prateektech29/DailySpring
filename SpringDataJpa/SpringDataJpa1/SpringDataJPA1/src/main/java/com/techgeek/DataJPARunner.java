package com.techgeek;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.techgeek.entity.Alien;
import com.techgeek.repo.IAlienRepo;
@Component
public class DataJPARunner implements CommandLineRunner
{
	@Autowired
	private IAlienRepo repo;

	@Override
	public void run(String... args) throws Exception 
	{
		System.out.println("run method called");
		System.out.println(repo.getClass().getName());
		repo.save(new Alien(3,"Rohan", "Madras"));


		repo.findAll().forEach(s-> System.out.println(s));
	}

}
