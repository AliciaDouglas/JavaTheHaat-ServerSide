package com.revature.JavaTheHaatServerSide.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ACCOUNT_STATUS")
public class AccountStatus {

	@Id
	@Column(name="ACC_STATUS_ID")
	private int accStatusId;
	
	@Column(name="ACC_STATUS")
	private String accStatus;
	
	
	public AccountStatus() {
		super();
	}


	public AccountStatus(int accStatusId, String accStatus) {
		super();
		this.accStatusId = accStatusId;
		this.accStatus = accStatus;
	}


	public int getAccStatusId() {
		return accStatusId;
	}


	public void setAccStatusId(int accStatusId) {
		this.accStatusId = accStatusId;
	}


	public String getAccStatus() {
		return accStatus;
	}


	public void setAccStatus(String accStatus) {
		this.accStatus = accStatus;
	}


	@Override
	public String toString() {
		return "AccountStatus [accStatusId=" + accStatusId + ", accStatus=" + accStatus + "]";
	}
	
	
	
}
