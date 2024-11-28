package com.techlover.SpringBoot01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.techlover.SpringBoot01.service.Company;


@SpringBootApplication  //==> @ComponentScan + @EnableAutoConfiguration
public class SpringBoot01Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringBoot01Application.class, args);
		Company company = container.getBean(Company.class);

		company.disp();
		//container.close();

		System.out.println("******************************");

		//container.close();
		System.out.println("******************************");
		//container.close();
	}

}
