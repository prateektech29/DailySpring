package com.techgeek.SpringDataJdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.techgeek.SpringDataJdbc.dao.EmploeeDao;

@SpringBootApplication
public class SpringDataJdbcApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringDataJdbcApplication.class, args);
		EmploeeDao dao = container.getBean(EmploeeDao.class);
		dao.input();
	
	}

}
