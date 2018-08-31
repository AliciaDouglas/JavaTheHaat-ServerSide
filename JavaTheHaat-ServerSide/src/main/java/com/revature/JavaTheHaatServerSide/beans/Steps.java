package com.revature.JavaTheHaatServerSide.beans;

public class Steps {

	private int sId;
	private int pId;
	private int stepNum;
	private String stepName;
	private String stepText;
	private String pic;
	
	
	public Steps() {
		super();
	}


	public Steps(int sId, int pId, int stepNum, String stepName, String stepText, String pic) {
		super();
		this.sId = sId;
		this.pId = pId;
		this.stepNum = stepNum;
		this.stepName = stepName;
		this.stepText = stepText;
		this.pic = pic;
	}


	public int getsId() {
		return sId;
	}


	public void setsId(int sId) {
		this.sId = sId;
	}


	public int getpId() {
		return pId;
	}


	public void setpId(int pId) {
		this.pId = pId;
	}


	public int getStepNum() {
		return stepNum;
	}


	public void setStepNum(int stepNum) {
		this.stepNum = stepNum;
	}


	public String getStepName() {
		return stepName;
	}


	public void setStepName(String stepName) {
		this.stepName = stepName;
	}


	public String getStepText() {
		return stepText;
	}


	public void setStepText(String stepText) {
		this.stepText = stepText;
	}


	public String getPic() {
		return pic;
	}


	public void setPic(String pic) {
		this.pic = pic;
	}


	@Override
	public String toString() {
		return "Steps [sId=" + sId + ", pId=" + pId + ", stepNum=" + stepNum + ", stepName=" + stepName + ", stepText="
				+ stepText + ", pic=" + pic + "]";
	}
	
	
	
}
