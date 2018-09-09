package com.revature.JavaTheHaatServerSide.beans;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	
	@Column(name="U_ID", nullable=false)
	private int uId;
	
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="U_ID", insertable=false, updatable=false)
	private Users user;
	
	@Column(name="TITLE")
	private String title;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@Column(name="VIDEO")
	private String video;
	
	@Column(name="TIME_SUBMISSION")
	private Date timeSubmission;
	
	private int categoryId;
	
	@OneToMany(mappedBy="post", fetch=FetchType.EAGER)
	private Set<Steps> steps = new HashSet<Steps>();
	
	@OneToMany(mappedBy="post", fetch=FetchType.EAGER)
	private Set<Comments> comments = new HashSet<Comments>();
	
	public Posts (){}


	public Posts(int pId, int uId, Users user, String title, String description, String video, Date timeSubmission,
			int categoryId, Set<Steps> steps, Set<Comments> comments) {
		super();
		this.pId = pId;
		this.uId = uId;
		this.user = user;
		this.title = title;
		this.description = description;
		this.video = video;
		this.timeSubmission = timeSubmission;
		this.categoryId = categoryId;
		this.steps = steps;
		this.comments = comments;
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


	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
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

	public Date getTimeSubmission() {
		return timeSubmission;
	}

	public void setTimeSubmission(Date timeSubmission) {
		this.timeSubmission = timeSubmission;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	
	public Set<Steps> getSteps() {
		return steps;
	}


	public void setSteps(Set<Steps> steps) {
		this.steps = steps;
	}



	public Set<Comments> getComments() {
		return comments;
	}



	public void setComments(Set<Comments> comments) {
		this.comments = comments;
	}


	@Override
	public String toString() {
		return "Posts [pId=" + pId + ", uId=" + uId + ", user=" + user + ", title=" + title + ", description="
				+ description + ", video=" + video + ", timeSubmission=" + timeSubmission + ", categoryId=" + categoryId
				+ ", steps=" + steps + ", comments=" + comments + "]";
	}





}
