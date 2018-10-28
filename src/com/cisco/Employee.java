package com.cisco;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="employee")
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee {
	
	@XmlElement(name="emp")
	private String name;
	
	@XmlElement(name="add")
	private String address;
	
	@XmlElement(name="sal")
	private int salary;
	
	@XmlElement(name="accounts")
	private Accounts accounts;
	
	public Employee() {
		
	}
	
	Employee(String name, String address,int salary){
		this.name=name;
		this.address=address;
		this.salary=salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public Accounts getAccounts() {
		return accounts;
	}
	
	public void setAccounts(Accounts accounts) {
		this.accounts = accounts;
	}
}
