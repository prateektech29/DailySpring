package com.techlover.SpringBoot01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.techlover.SpringBoot01.service.GreeetingsService;

@SpringBootApplication  //==> @ComponentScan + @EnableAutoConfiguration
public class SpringBoot01Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringBoot01Application.class, args);
		GreeetingsService greet = container.getBean(GreeetingsService.class);

//		System.out.println(container.getBeanDefinitionCount());
//		String[] beanDefinitionNames = container.getBeanDefinitionNames();
//		System.out.println(Arrays.toString(beanDefinitionNames));

		String status=greet.generateWish("Prateek");
		System.out.println(status);
	
	}

}
