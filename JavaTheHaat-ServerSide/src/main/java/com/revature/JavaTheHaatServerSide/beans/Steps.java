package com.revature.JavaTheHaatServerSide.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="STEPS")
public class Steps {

	@Id
	@Column(name="S_ID")
	@SequenceGenerator(name="STEPS_SEQ", sequenceName="STEPS_SEQ")
	@GeneratedValue(generator="STEPS_SEQ", strategy=GenerationType.SEQUENCE)
	private int sId;
	
	@Column(name="P_ID", nullable=false)
	private int pId;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="P_ID", insertable=false, updatable=false)
	private Posts post;
	
	@Column(name="STEP_NUM")
	private int stepNum;
	
	@Column(name="STEP_NAME")
	private String stepName;
	
	@Column(name="STEP_TEXT")
	private String stepText;
	
	@Column(name="PIC")
	private String pic;
	
	
	public Steps() {
		super();
	}




	public Steps(int sId, int pId, Posts post, int stepNum, String stepName, String stepText, String pic) {
		super();
		this.sId = sId;
		this.pId = pId;
		this.post = post;
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
		return "Steps [sId=" + sId + ", post=" + post + ", stepNum=" + stepNum + ", stepName=" + stepName
				+ ", stepText=" + stepText + ", pic=" + pic + "]";
	}


	
	
	
	
}
