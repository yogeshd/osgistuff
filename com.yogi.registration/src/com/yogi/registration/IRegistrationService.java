package com.yogi.registration;

import java.util.List;

public interface IRegistrationService {

	public String registerPerson(Person person);
	public Person getPerson(String uuid);
	public List<Person> getPersonList();
}
