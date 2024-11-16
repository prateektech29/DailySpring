package com.techgeek.main.configuration;

import com.techgeek.main.Password;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	public Config()
	{
		System.out.println("Config  bean created");
	}
	
	@Bean
	public Password createPasswordBean()
	{
		Password pass=new Password("SHA");
		return pass;
	}

}
