package com.revature.JavaTheHaatServerSide.beans;

import java.util.Date;

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
@Table(name="COMMENTS")
public class Comments {
	
	@Id
	@Column(name="C_ID")
	@SequenceGenerator(sequenceName="COMMENTS_SEQ", name="COMMENTS_SEQ")
	@GeneratedValue(generator="COMMENTS_SEQ", strategy=GenerationType.SEQUENCE)
	private int cId;
	
	@Column(name="P_ID", nullable=false)
	private int pId;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="P_ID", insertable=false, updatable=false)
	private Posts post;
	
	@Column(name="U_ID", nullable=false)
	private int uId;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="U_ID", insertable=false, updatable=false)
	private Users user;
	
	@Column(name="COMMENT_TEXT")
	private String commentText;
	
	@Column(name="TIME_SUBMISSION")
	private Date timeSubmission;

	public Comments() {
		super();
	}


	public Comments(int cId, int pId, Posts post, int uId, Users user, String commentText, Date timeSubmission) {
		super();
		this.cId = cId;
		this.pId = pId;
		this.post = post;
		this.uId = uId;
		this.user = user;
		this.commentText = commentText;
		this.timeSubmission = timeSubmission;
	}


	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}
	
	

	public int getpId() {
		return pId;
	}


	public void setpId(int pId) {
		this.pId = pId;
	}


	public void setuId(int uId) {
		this.uId = uId;
	}


	public Users getuId() {
		return user;
	}

	public void setuId(Users user) {
		this.user = user;
	}

	public String getCommentText() {
		return commentText;
	}

	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}

	public Date getTimeSubmission() {
		return timeSubmission;
	}

	public void setTimeSubmission(Date timeSubmission) {
		this.timeSubmission = timeSubmission;
	}

	@Override
	public String toString() {
		return "Comments [cId=" + cId + ", post=" + post + ", user=" + user + ", commentText=" + commentText
				+ ", timeSubmission=" + timeSubmission + "]";
	}
	
	
	
}
