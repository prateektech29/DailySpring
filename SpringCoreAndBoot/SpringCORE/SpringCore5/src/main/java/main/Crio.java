package main;

import service.ICourse;

public class Crio
{
	private ICourse course;

	
	public Crio(ICourse course)
	{
		super();
		System.out.println("Constructor Injection");
		this.course = course;
	}
	
	public Crio()
	{
		super();
		System.out.println("Crio Bean created");
	}

	public void setCourse(ICourse course) 
	{
		System.out.println("Setter Injection");
		this.course = course;
	}
	public Boolean buyTheCourse(Double amount)
	{
		return course.getTheCourse(amount);
	}
	
}
