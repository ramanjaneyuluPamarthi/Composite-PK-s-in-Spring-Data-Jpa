package com.nit.entity;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable                    //It is a classs level Annotation
public class AccountPks implements Serializable          //we need to implement the Serializable or else 
                                                           // sometimes results execption
{

	private Integer accId;
	private String accType;
	private Long accNumber;
	
	public AccountPks() {

	}

	
	public AccountPks(Integer accId, String accType, Long accNumber) {
		this.accId = accId;
		this.accType = accType;
		this.accNumber = accNumber;
	}


	public Integer getAccId() {
		return accId;
	}

	public void setAccId(Integer accId) {
		this.accId = accId;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public Long getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(Long accNumber) {
		this.accNumber = accNumber;
	}

	@Override
	public String toString() {
		return "AccountPks [accId=" + accId + ", accType=" + accType + ", accNumber=" + accNumber + "]";
	}
	
	

}
