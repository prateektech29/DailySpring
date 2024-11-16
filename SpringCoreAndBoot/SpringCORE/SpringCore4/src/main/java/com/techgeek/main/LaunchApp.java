package com.techgeek.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaunchApp 
{

	public static void main(String[] args)
	{
		
		ApplicationContext container=new ClassPathXmlApplicationContext("applicationconfig.xml");
		
		Password p = container.getBean(Password.class);
		p.passwordAlgoUsed();
	}

}