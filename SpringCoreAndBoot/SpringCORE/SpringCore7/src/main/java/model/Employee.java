package model;

public class Employee 
{
	private Integer empid;
	
	private String name;
	
	private Double salary;
	
	private String city;

	public Employee(Integer empid, String name, Double salary, String city) {
		super();
		System.out.println("Employee Bean created");
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.city = city;
	}

	public Employee() {
		System.out.println("bean created");
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + ", city=" + city + "]";
	}
	
	
	public String employeeTask()
	{
		return "Every Employee Acts Productive but in reality they are less productive";
	}
	
	

}
