package com.cisco;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Accounts {
	
	@XmlElement(name="account")
	private List<Account> accounts;
	
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	public List<Account> getAccounts() {
		return accounts;
	}

}
