package org.publicModule;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable{

	private String name;
	
	private Integer age;
	
	List<Address> addresses;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
