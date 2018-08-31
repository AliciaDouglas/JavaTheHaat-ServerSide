package com.revature.JavaTheHaatServerSide.beans;

public class Favorites {
	
	private int uId;
	private int pId;
	
	public Favorites() {}

	public Favorites(int uId, int pId) {
		super();
		this.uId = uId;
		this.pId = pId;
	}

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	@Override
	public String toString() {
		return "Favorites [uId=" + uId + ", pId=" + pId + "]";
	}
	
	

}
