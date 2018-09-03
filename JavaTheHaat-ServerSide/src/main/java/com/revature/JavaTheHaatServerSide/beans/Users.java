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
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="USERS")
public class Users {
	
	@Id
	@Column(name="U_ID")
	@SequenceGenerator(name="USERS_SEQ", sequenceName="USERS_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USERS_SEQ")
	private int uId;
	
	@Column(name="FNAME")
	private String fname;
	
	@Column(name="LNAME")
	private String lname;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="USERNAME")
	private String username;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="PROFILE_PIC")
	private String profilePic;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="ACC_TYPE_ID")
	private AccountType accType;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="ACC_STATUS_ID")
	private AccountStatus accStatus;
	
	
	public Users() {
		super();
	}


	public Users(int uId, String fname, String lname, String email, String username, String password, String profilePic,
			AccountType accType, AccountStatus accStatus) {
		super();
		this.uId = uId;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.username = username;
		this.password = password;
		this.profilePic = profilePic;
		this.accType = accType;
		this.accStatus = accStatus;
	}


	public int getuId() {
		return uId;
	}


	public void setuId(int uId) {
		this.uId = uId;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getProfilePic() {
		return profilePic;
	}


	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}

	public AccountType getAccType() {
		return accType;
	}


	public void setAccType(AccountType accType) {
		this.accType = accType;
	}


	public AccountStatus getAccStatus() {
		return accStatus;
	}


	public void setAccStatus(AccountStatus accStatus) {
		this.accStatus = accStatus;
	}


	@Override
	public String toString() {
		return "Users [uId=" + uId + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", username="
				+ username + ", password=" + password + ", profilePic=" + profilePic + ", accType=" + accType
				+ ", accStatus=" + accStatus + "]";
	}




}
