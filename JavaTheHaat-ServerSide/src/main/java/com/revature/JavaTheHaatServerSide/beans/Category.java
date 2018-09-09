package com.revature.JavaTheHaatServerSide.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CATEGORY")
public class Category {
	
	@Id
	@Column(name="CATEGORY_ID")
	private int categoryId;
	
	@Column(name="CATEGORY")
	private String category;
	
	public Category (){}

	public Category(int categoryId, String category) {
		super();
		this.categoryId = categoryId;
		this.category = category;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", category=" + category + "]";
	}
	
	

}
