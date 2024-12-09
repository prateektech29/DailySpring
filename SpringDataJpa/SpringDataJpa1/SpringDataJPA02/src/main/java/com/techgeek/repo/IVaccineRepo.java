package com.techgeek.repo;

import org.springframework.data.repository.CrudRepository;

import com.techgeek.entity.Vaccine;

public interface IVaccineRepo extends CrudRepository<Vaccine, Integer> 
{

}
