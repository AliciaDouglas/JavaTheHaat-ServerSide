package com.revature.JavaTheHaatServerSide.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ACCOUNT_TYPE")
public class AccountType {

	@Id
	@Column(name="ACC_TYPE_ID")
	private int accTypeId;
	
	@Column(name="ACC_TYPE")
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
