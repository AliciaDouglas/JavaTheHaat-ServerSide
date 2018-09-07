package com.revature.JavaTheHaatServerSide.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.revature.JavaTheHaatServerSide.beans.Posts;

public interface PostsRepo extends CrudRepository<Posts, Integer>{
	
	List<Posts> findByUId(int uId);

}
