package com.techgeek.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techgeek.entity.Vaccine;
import com.techgeek.repo.IVaccineRepo;
@Service
public class VaccineService implements IVaccineService 
{
	private IVaccineRepo repo;
	
	
	@Autowired
	public void setRepo(IVaccineRepo repo)
	{
		this.repo = repo;
	}

	@Override
	public String registerVaccineInfo(Vaccine vaccine) 
	{
		Vaccine vac=repo.save(vaccine);
		
		return "Vaccine Info registered with id "+ vac.getId();
	}

	@Override
	public Iterable<Vaccine> registerMultipleVaccineInfo(Iterable<Vaccine> vaccines) 
	{
		return repo.saveAll(vaccines);
		
	}

	@Override
	public Long vaccinesCount() {
		return repo.count();
		
	}

	@Override
	public Boolean checkVaccineAvailability(Integer id) {
		return repo.existsById(id);
		
	}

	@Override
	public Iterable<Vaccine> getAllVaccinesInfo() 
	{
		
		return repo.findAll();
	}

}
