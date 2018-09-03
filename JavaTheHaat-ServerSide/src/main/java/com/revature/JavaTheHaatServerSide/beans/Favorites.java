package com.revature.JavaTheHaatServerSide.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FAVORITES")
public class Favorites {
	
	@Id
	@Column(name="U_ID")
	private int uId;
	
	@Id
	@Column(name="P_ID")
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
