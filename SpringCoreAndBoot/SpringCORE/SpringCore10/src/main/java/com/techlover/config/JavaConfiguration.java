package com.techlover.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={"com.techlover"})
public class JavaConfiguration 
{
	public JavaConfiguration()
	{
		System.out.println("Java Config Bean created");
	}
	
	@Bean
	public LocalDateTime createTimeObject()
	{
		System.out.println();
		return LocalDateTime.now();
	}

}
