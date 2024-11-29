package com.byjus.service;

import org.springframework.stereotype.Service;

@Service
public class Amazon 
{
	
	private IDelivery service;
	
	public Amazon(IDelivery service)
	{
		this.service=service;
		System.out.println("Amazon Bean created");
	}

	/*public Amazon() {
		System.out.println("Amazon Beann created");

	}*/

	/*@Autowired
	//@Qualifier("fedEx")
	public void setService(IDelivery service) {
		this.service = service;
	}*/


	public Boolean deliverProduct(Double amount)
	{
		return service.deliveryTheProduct(amount);
		
	}

}
