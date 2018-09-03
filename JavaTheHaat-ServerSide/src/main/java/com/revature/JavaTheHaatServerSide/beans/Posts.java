package com.revature.JavaTheHaatServerSide.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="POSTS")
public class Posts {
	
	@Id
	@Column(name="P_ID")
	@SequenceGenerator(sequenceName="POSTS_SEQ", name="POSTS_SEQ")
	@GeneratedValue(generator="POSTS_SEQ", strategy=GenerationType.SEQUENCE)
	private int pId;
	
	private int uId;
	
	@Column(name="TITLE")
	private String title;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@Column(name="VIDEO")
	private String video;
	
	@Column(name="TIME_SUBMISSION")
	private String timeSubmission;
	
	
	private int categoryId;
	
	public Posts (){}

	public Posts(int pId, int uId, String title, String description, String video, String timeSubmission,
			int categoryId) {
		super();
		this.pId = pId;
		this.uId = uId;
		this.title = title;
		this.description = description;
		this.video = video;
		this.timeSubmission = timeSubmission;
		this.categoryId = categoryId;
	}
	
	

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public String getTimeSubmission() {
		return timeSubmission;
	}

	public void setTimeSubmission(String timeSubmission) {
		this.timeSubmission = timeSubmission;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	@Override
	public String toString() {
		return "Post [pId=" + pId + ", uId=" + uId + ", title=" + title + ", description=" + description + ", video="
				+ video + ", timeSubmission=" + timeSubmission + ", categoryId=" + categoryId + "]";
	}
	
	
	
	
	
	

}
