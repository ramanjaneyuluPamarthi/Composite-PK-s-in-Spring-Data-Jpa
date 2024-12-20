package com.nit.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Account {
	
	private String accHolderName;
	private String branch;
	
	@EmbeddedId                            // It is a variable level annotation
	private AccountPks accountPks;           //It is the class having Composite Pks
	
	public Account() {

	}
	
	public Account(String accHolderName, String branch, AccountPks accountPks) {
		this.accHolderName = accHolderName;
		this.branch = branch;
		this.accountPks = accountPks;
	}



	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public AccountPks getAccountPks() {
		return accountPks;
	}

	public void setAccountPks(AccountPks accountPks) {
		this.accountPks = accountPks;
	}

	@Override
	public String toString() {
		return "Account [accHolderName=" + accHolderName + ", branch=" + branch + ", accountPks=" + accountPks + "]";
	}
	
	

}
