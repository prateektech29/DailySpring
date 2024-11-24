package main;

import model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class LaunchApp1 {


    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("applicationconfig.xml");

        Employee emp1 = container.getBean("emp1", Employee.class);
        System.out.println(emp1);
        System.out.println(emp1.employeeTask());
        System.out.println(emp1.hashCode());

        System.out.println("***************************");
        Employee emp2 = container.getBean("emp2", Employee.class);
        System.out.println(emp2);
        System.out.println(emp2.employeeTask());
        System.out.println(emp2.hashCode());

        System.out.println("***************************");
        Employee emp3 = container.getBean("emp3", Employee.class);
        System.out.println(emp3);
        System.out.println(emp3.employeeTask());
        System.out.println(emp3.hashCode());
    }

}
