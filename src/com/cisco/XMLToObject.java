package com.cisco;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class XMLToObject {
	public static void main(String[] args) {
		try {
			Unmarshaller unmarshaller=JAXBContext.newInstance(Employee.class).createUnmarshaller();
			Employee employee=(Employee) unmarshaller.unmarshal(new File("EmployeeData.xml"));
			System.out.println("Employee name is: "+employee.getName());
			System.out.println("employee address is: "+employee.getAddress());
			System.out.println("employee salary is: "+employee.getSalary());
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
