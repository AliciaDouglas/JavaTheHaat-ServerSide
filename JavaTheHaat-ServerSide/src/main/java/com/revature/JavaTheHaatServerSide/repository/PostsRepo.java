package com.revature.JavaTheHaatServerSide.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.revature.JavaTheHaatServerSide.beans.Posts;

public interface PostsRepo extends CrudRepository<Posts, Integer>{
	
	/**
	 * Get posts by user id
	 * @param uId
	 * @return
	 */
	List<Posts> findByUId(int uId);
	
	/**
	 * Get posts by category id
	 * @param categoryId
	 * @return
	 */
	List<Posts> findByCategoryId(int categoryId);
	
	/**
	 * Get post by pId
	 * @param pId
	 * @return
	 */
	Posts findByPId(int pId);

}
