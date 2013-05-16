package com.yogi.registration.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.yogi.registration.IRegistrationService;
import com.yogi.registration.Person;

public class RegistrationService implements IRegistrationService{

	private static List<Person> registeredPersonList=new ArrayList<Person>();
	private static Map<String,Person> registeredPersonMap=new HashMap<String,Person>();
	
	
	public void activate(Map<String, Object> properties)
	{
		System.out.println("yeah comign here.");
	}
	
	@Override
	public String registerPerson(Person person) {
		// TODO Auto-generated method stub
		registeredPersonMap.put(person.getUuid(),person);
		registeredPersonList.add(person);
		return person.getUuid();
	}

	@Override
	public Person getPerson(String uuid) {
		// TODO Auto-generated method stub
		return registeredPersonMap.get(uuid);
	}

	@Override
	public List<Person> getPersonList() {
		// TODO Auto-generated method stub
		return registeredPersonList;
	}

}
