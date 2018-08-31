package com.revature.JavaTheHaatServerSide.beans;

public class Users {
	
	private int uId;
	private String fname;
	private String lname;
	private String email;
	private String username;
	private String password;
	private String profilePic;
	private int accTypeId;
	private int accStatusId;
	
	
	public Users() {
		super();
	}


	public Users(int uId, String fname, String lname, String email, String username, String password, String profilePic,
			int accTypeId, int accStatusId) {
		super();
		this.uId = uId;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.username = username;
		this.password = password;
		this.profilePic = profilePic;
		this.accTypeId = accTypeId;
		this.accStatusId = accStatusId;
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


	public int getAccTypeId() {
		return accTypeId;
	}


	public void setAccTypeId(int accTypeId) {
		this.accTypeId = accTypeId;
	}


	public int getAccStatusId() {
		return accStatusId;
	}


	public void setAccStatusId(int accStatusId) {
		this.accStatusId = accStatusId;
	}


	@Override
	public String toString() {
		return "Users [uId=" + uId + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", username="
				+ username + ", password=" + password + ", profilePic=" + profilePic + ", accTypeId=" + accTypeId
				+ ", accStatusId=" + accStatusId + "]";
	}
	
	
	

}
