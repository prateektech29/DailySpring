package com.techgeek.SpringDataJdbc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.techgeek.SpringDataJdbc.model.Employee;

@Repository("dao")
public class EmploeeDao
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private String sql1="INSERT INTO EMPLOYEE(id, name, city)VALUES(1,'Rohan', 'Bengaluru')";
	private String sql="INSERT INTO EMPLOYEE(id, name, city)VALUES(?,?,?)";
	public void input()
	{
		jdbcTemplate.update(sql1);
		System.out.println("Dataa Inserted");
	}

	
	public void input(Employee emp)
	{
		jdbcTemplate.update(sql, emp.getId(), emp.getName(), emp.getCity());
		System.out.println("Data Inserted");
	}
}
