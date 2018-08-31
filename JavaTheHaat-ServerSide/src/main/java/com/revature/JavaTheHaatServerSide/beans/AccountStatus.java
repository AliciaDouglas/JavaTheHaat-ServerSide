package com.revature.JavaTheHaatServerSide.beans;

public class AccountStatus {

	private int accStatusId;
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
