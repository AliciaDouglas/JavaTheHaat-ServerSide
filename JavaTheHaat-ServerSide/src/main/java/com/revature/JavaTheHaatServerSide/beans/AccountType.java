package com.revature.JavaTheHaatServerSide.beans;

public class AccountType {

	private int accTypeId;
	private String accType;
	
	
	public AccountType() {
		super();
	}


	public AccountType(int accTypeId, String accType) {
		super();
		this.accTypeId = accTypeId;
		this.accType = accType;
	}


	public int getAccTypeId() {
		return accTypeId;
	}


	public void setAccTypeId(int accTypeId) {
		this.accTypeId = accTypeId;
	}


	public String getAccType() {
		return accType;
	}


	public void setAccType(String accType) {
		this.accType = accType;
	}


	@Override
	public String toString() {
		return "AccountType [accTypeId=" + accTypeId + ", accType=" + accType + "]";
	}
	
	
	
}
