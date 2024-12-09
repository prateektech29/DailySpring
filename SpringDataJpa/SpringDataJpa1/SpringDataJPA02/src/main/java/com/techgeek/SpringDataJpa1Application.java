package com.techgeek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.techgeek.entity.Vaccine;
import com.techgeek.service.VaccineService;

@SpringBootApplication
public class SpringDataJpa1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpa1Application.class, args);
	
		VaccineService service = container.getBean(VaccineService.class);
		
		Vaccine vac=new Vaccine("Phizer","Moderena",45454.4);

		String status=service.registerVaccineInfo(vac);
		System.out.println(status);
		
//		Vaccine vac1=new Vaccine("Polio","WHO",4545.4);
//		Vaccine vac2=new Vaccine("CovidShield","Astrazenica",45445.4);
//		Vaccine vac3=new Vaccine("Covaxin","BharatBio",454544.4);
		
//		List<Vaccine> vaccines=new ArrayList<Vaccine>();
//		
//		vaccines.add(new Vaccine("Polio","WHO",4545.4));
//		vaccines.add(new Vaccine("CovidShield","Astrazenica",45445.4));
//		vaccines.add(new Vaccine("Covaxin","BharatBio",454544.4));
//		
//		service.registerMultipleVaccineInfo(vaccines).forEach(v->System.out.println(v));
		
//		Long count=service.vaccinesCount();
//		System.out.println("Number of vaccines available "+ count);
//		int id=5;
//		Boolean status=service.checkVaccineAvailability(id);
//		if(status)
//			System.out.println("Vaccine with id "+ id+" is available");
//		else
//			System.out.println("Vaccine with id "+ id+" is not available");
		
		 service.getAllVaccinesInfo().forEach(v->System.out.println(v));
		
		
			
	}

}
