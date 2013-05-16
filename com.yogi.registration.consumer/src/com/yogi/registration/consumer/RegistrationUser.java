package com.yogi.registration.consumer;

import com.yogi.registration.IRegistrationService;
import com.yogi.registration.Person;

public class RegistrationUser {

	private IRegistrationService registrationService;

	
	public synchronized void setRegistrationService(IRegistrationService registrationService) {
		System.out.println("Service was set through OSGI DS");
		this.registrationService = registrationService;
		Person person=new Person("yogesh","dakre",35,"yogeshd@cybage.com");
		String uuid = registrationService.registerPerson(person);
		
		System.out.println(registrationService.getPerson(uuid).toString());
		
		
	}
	
	public synchronized void unsetRegistrationService(IRegistrationService registrationService) {
		System.out.println("done with service");
		if(this.registrationService == registrationService)
			this.registrationService = null;
		
	}


	
	
	
}
