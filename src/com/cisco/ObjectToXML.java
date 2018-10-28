package com.cisco;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class ObjectToXML {
	public static void main(String[] args) {
		try {
			Marshaller marshaller = JAXBContext.newInstance(Employee.class).createMarshaller();
			Employee employee=new Employee();
			employee.setName("Hareram");
			employee.setAddress("BTM");
			employee.setSalary(10000);
			Account account1=new Account();
			account1.setAccountType("Saving");
			account1.setAccountNumber(122343435);
			account1.setBranchName("Bikram Ganj");
			Account account2=new Account();
			account2.setAccountType("dont know");
			account2.setAccountNumber(4596085);
			account2.setBranchName("Dehri");
			
			Accounts accounts=new Accounts();
			List<Account> listOfAccount=new ArrayList<Account>();
			listOfAccount.add(account1);
			listOfAccount.add(account2);
			accounts.setAccounts(listOfAccount);
			employee.setAccounts(accounts);
			
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(employee,new File("EmployeeData.xml"));
			System.out.println("marshalling is success");
		} catch (JAXBException e) {
			e.printStackTrace();
		}System.out.println();
	}
}
