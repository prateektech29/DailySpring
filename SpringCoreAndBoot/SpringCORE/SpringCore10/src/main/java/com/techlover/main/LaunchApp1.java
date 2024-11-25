package com.techlover.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.techlover.config.JavaConfiguration;
import com.techlover.service.Greetings;

public class LaunchApp1
{

	public static void main(String[] args)
	{
		//BeanFactory
		//ApplicationContext
		
		
		ApplicationContext container=new AnnotationConfigApplicationContext(JavaConfiguration.class);
		Greetings greet = container.getBean(Greetings.class);
		
		System.out.println(greet.generateGreeeting("Akash"));
		
	}

}
