package com.revature.JavaTheHaatServerSide.beans;

public class Comments {
	
	private int sId;
	private int pId;
	private int stepNum;
	private int stepName;
	private int stepText;
	private String pic;
	
	public Comments () {}

	public Comments(int sId, int pId, int stepNum, int stepName, int stepText, String pic) {
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

	public int getStepName() {
		return stepName;
	}

	public void setStepName(int stepName) {
		this.stepName = stepName;
	}

	public int getStepText() {
		return stepText;
	}

	public void setStepText(int stepText) {
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
		return "Comments [sId=" + sId + ", pId=" + pId + ", stepNum=" + stepNum + ", stepName=" + stepName
				+ ", stepText=" + stepText + ", pic=" + pic + "]";
	}
	
	

}
