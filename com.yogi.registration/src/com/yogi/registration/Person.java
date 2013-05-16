package com.yogi.registration;

import java.util.UUID;

public class Person {

	private String uuid;
	
	private String fname;
	private String lname;
	private int age;
	private String email;
	
	
	public Person( String fname, String lname, int age, String email) {
		super();
		this.setUuid(UUID.randomUUID().toString());
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.email = email;
	}	
	
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


	public String getUuid() {
		return uuid;
	}


	public void setUuid(String uuid) {
		this.uuid = uuid;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person helo  [uuid=");
		builder.append(uuid);
		builder.append(", fname=");
		builder.append(fname);
		builder.append(", lname=");
		builder.append(lname);
		builder.append(", age=");
		builder.append(age);
		builder.append(", email=");
		builder.append(email);
		builder.append("]");
		return builder.toString();
	}
	
}
