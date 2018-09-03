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
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="P_ID")
	private Posts post;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="U_ID")
	private int uId;
	
	@Column(name="COMMENT_TEXT")
	private String commentText;
	
	@Column(name="TIME_SUBMISSION")
	private String timeSubmission;

	public Comments() {
		super();
	}

	public Comments(int cId, Posts post, int uId, String commentText, String timeSubmission) {
		super();
		this.cId = cId;
		this.post = post;
		this.uId = uId;
		this.commentText = commentText;
		this.timeSubmission = timeSubmission;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public Posts getPost() {
		return post;
	}

	public void setPost(Posts post) {
		this.post = post;
	}

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public String getCommentText() {
		return commentText;
	}

	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}

	public String getTimeSubmission() {
		return timeSubmission;
	}

	public void setTimeSubmission(String timeSubmission) {
		this.timeSubmission = timeSubmission;
	}

	@Override
	public String toString() {
		return "Comments [cId=" + cId + ", post=" + post + ", uId=" + uId + ", commentText=" + commentText
				+ ", timeSubmission=" + timeSubmission + "]";
	}
	
	
	
}
