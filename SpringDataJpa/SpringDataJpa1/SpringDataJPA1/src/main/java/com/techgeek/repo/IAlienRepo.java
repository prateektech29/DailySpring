package com.techgeek.repo;

import org.springframework.data.repository.CrudRepository;

import com.techgeek.entity.Alien;
//@Repository
public interface IAlienRepo extends CrudRepository<Alien, Integer>
{

}
	