package main;

import service.Java;
import service.SpringBoot;
import service.Telusko;

//class Alpha
//{
//	public void alpha()
//	{
//		//statements
//		//logic
//	}
//}
//
//class Beta extends Alpha
//{
//	public void beta()
//	{
//		//
////		Alpha a=new Alpha();
////		a.alpha();
//		alpha();
//	}
//}






public class LaunchApp 
{

	public static void main(String[] args) 
	{
		//System.out.println("hello");
		//Constructor Injection
			Telusko t=new Telusko(new Java());//target class
			
			//Java java=new Java();
			
			//t.setCourse(new Java());
			
			//setter injection
			t.setCourse(new SpringBoot());//Depdency Injection--> Injecting depdent object into target object 
			
			Boolean status=t.buyTheCourse(4545.5);
			if(status)
				System.out.println("Course Enrolled Successfully");
			else
				System.out.println("Failed to enroll for the course");
	}

}
