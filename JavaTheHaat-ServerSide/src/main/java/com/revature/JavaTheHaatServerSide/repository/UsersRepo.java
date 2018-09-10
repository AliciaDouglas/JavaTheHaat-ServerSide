package com.revature.JavaTheHaatServerSide.repository;

import org.springframework.data.repository.CrudRepository;

import com.revature.JavaTheHaatServerSide.beans.Users;

public interface UsersRepo extends CrudRepository<Users, Integer>{
	
	/**
	 * find user by uId
	 * @param uId
	 * @return
	 */
	Users findByUId(int uId);

	/**
	 * find user by username
	 * @param username
	 * @return
	 */
	Users findByUsername(String username);
}
