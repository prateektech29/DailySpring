package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaunchApp1
{

	public static void main(String[] args)
	{
		//BeanFactory
		//ApplicationContext
		
		
		ApplicationContext container=new ClassPathXmlApplicationContext("applicationconfig.xml");

		Crio t = container.getBean(Crio.class);
		
		Boolean status=t.buyTheCourse(2500.0);
		if(status)
			System.out.println("Course Purchased Successfully");
		else
			System.out.println("Failed to buy the course");
	}

}
